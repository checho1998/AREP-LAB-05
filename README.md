# LABORATORIO AREP - 05

En este repositorio se realiza un servidor web (tipo Apache) en Java, que soporta múltiples solicitudes seguidas concurrentes. El servidor debe ser capaz de entregar páginas html e imágenes tipo jpg, Igualmente el servidor debe proveer un framework IoC para la construcción de aplicaciones web a partir de POJOS, utilizando los Sockts desde el servidor.

## Link Heroku

En este link se encuentra el desarrollo del trabajo desplegado en Heroku

JPG EJEMPLO:

- https://lab-arep-05.herokuapp.com/carro.jpg

Como se puede ver en esta imagen:

![Imagenes](https://github.com/checho1998/AREP-LAB-05/blob/master/imagenes/Carro.PNG)

 HTML EJEMPLOS:
 
- https://lab-arep-05.herokuapp.com/Perdido.html
- https://lab-arep-05.herokuapp.com/bienvenido.html

Como se puede ver en estas imagenes:

![Imagenes](https://github.com/checho1998/AREP-LAB-05/blob/master/imagenes/perdido.PNG)

![Imagenes](https://github.com/checho1998/AREP-LAB-05/blob/master/imagenes/bienvenido.PNG)

## Como Instalar y Correr el Codigo

- Debe estar en el directorio donde quiere traer el repositorio
- Para traer el repositorio a el directorio que usted desee, debe abrir la consola del PC e ingresar este codigo:
```
$ git clone https://github.com/checho1998/Libreria-Numeros-Complejos.git
```
- luego debe ingresar el siguiente codigo para limpiar y compilar el programa desde el directorio donde este el programa
```
$ mvn clean install 
```
- Podria tambien usar el siguiente codigo para provar las pruebas y ver su completa funcionalidad
```
$ mvn test
```
- Para correr el programa desde windows puede correr desde su cmd este codigo
```
mvn exec:java -Dexec.mainClass="com.example.Main" [-Dexec.args="argument1"]
```

![Imagenes](https://github.com/checho1998/AREP-LAB-04/blob/master/imagenes/correr.PNG)


## Construido en lenguaje
  
  - Java (V8)
  
## Ejecutar Pruebas

Las pruebas estan desarrolladas con la dependencia de JUnit 5, por lo tanto es necesario tenerla
en el pc donde se corran.

## Autor

- Sergio Alejandro Nuñez Mendivelso
