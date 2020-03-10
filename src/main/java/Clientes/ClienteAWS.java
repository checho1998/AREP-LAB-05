package Clientes;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
/**
 * 
 * @author checho
 *
 */
public class ClienteAWS extends Thread {
	//Atributos
    private static URL url;
    private static int numHilos;
    private static ArrayList<Thread> listaHilos;
    
	public ClienteAWS(URL url) {
		this.url = url;
	}
	
	public static void main(String[] args) throws Exception {
        url = new URL(args[0]);
        numHilos = Integer.parseInt(args[1]);
        listaHilos = new ArrayList<Thread>();
        for (int i = 0; i < numHilos; i++) {
        	listaHilos.add(new ClienteAWS(url));
        }
        int tem = 0;
        for (Thread h : listaHilos) {
            h.start();
            tem++;
        }
        System.out.println("Se ejecutaron " + tem + " solicitudes concurrentes.");
    }

    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}
