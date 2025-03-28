# PARCIAL 2

## Descripcion

Este proyecto implementa un sistema de microservicios que proporciona dos servicios para la búsqueda de elementos en listas de cadenas: búsqueda lineal y búsqueda binaria. El sistema está diseñado con un service proxy que distribuye las solicitudes entre dos instancias de los servicios de ordenamiento usando un algoritmo de round-robin. Además, incluye un cliente web que permite a los usuarios invocar los servicios de manera asíncrona.
 

## Logrado en el parcial
- Se implemento MathService
- No se pudo crear el Service
- Se logro correr en local
- Se implemento el Mathservice en al nube pero no mas eso
## Imagenes De prueba
# En la imagen a contnuacion se ve el link que nos provee AWS junto a su prueba en postman

![image](https://github.com/user-attachments/assets/e8c2fe5c-3554-4256-b85f-27c374ecc7b2)

# La otra prueba que se hace es la de no encontrar un numero

![image](https://github.com/user-attachments/assets/b8dc13e2-7604-4df4-8c22-4282d4992323)

# Y por ultimo la prueba de busqueda binaria

![image](https://github.com/user-attachments/assets/beae6cc2-c742-44e2-8c5c-37a9b4e2b6d0)


# Y asi se ve si se busca directamente en el browser

![image](https://github.com/user-attachments/assets/656f4f84-0358-4b1b-9448-5349fce31160)


## Como correr
- Primero
```
git clone https://github.com/koket987/AREPPARCIAL2.git
```
- Segundo
```
mvn clean install
```
- Tercero
```
mvn spring-boot:run 
```
- Cuarto
ingresar a ``` localhost:8080 ``` e ingresar los datos que quieras un ejemplo es
localhost:8080/linearsearch?list=10,20,13,40,60&value=99
la salida esperada es:
{
 "operation": "linearSearch",
 "inputlist": "10,20,13,40,60",
 "value": "99"
 "output":  "-1"
}
La otra forma es con busqueda binaria que seria:
localhost:8080/binarysearch?list=10,20,13,40,60&value=13
y la respuesta esperada es:
{
 "operation": "binarySearch",
 "inputlist": "10,20,13,40,60",
 "value": "13"
 "output":  "2"
}
## Arquitectura del Sistema
- Service Proxy
- Math Services
- Búsqueda Lineal: Implementa la búsqueda lineal de un valor en una lista de cadenas.
- Búsqueda Binaria: Implementa la búsqueda binaria de un valor en una lista ordenada de cadenas.
- Cliente Web: Un formulario HTML para recibir entradas del usuario y hacer llamadas a los servicios a través del proxy.


## Requisitos
- Java 17 o superior
- Spring Boot
- AWS EC2
## Autor

- [Santiago Rodríguez](https://github.com/Koket987)
