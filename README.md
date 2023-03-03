#  Bici Palma

## Introducción
Vamos a construir un prototipo de la aplicación que gestiona una estación donde se anclan las bicicletas del servicio BiciPalma.

![image](diagrama/diagrama_clases_UML_biciPalma.png)

## Funcionalidades
#### Bicicleta
- Nos permite crear una bicicleta con su ID

#### Anclaje
- Nos permite crear un anclaje
- Saber si el anclaje está ocupado o no
- Anclar bicicletas
- Poder liberar bicicletas

#### Anclajes
- Nos permite crear anclajes dentro del anclaje
- Saber la cantidad de anclajes con los que contamos
- Poder ocupar un anclaje
- Saber si el anclaje está ocupado o no
- Poder liberar el anclaje
- Seleccionar un anclaje aleatorio

#### Tarjeta De Usuario
- Nos permite crear una tarjeta de usuario
- Activarla

#### Estación
- Nos permite crear una estación con un ID, dirección y el número de anclajes. 
- Saber la cantidad de anclajes libres con los que contamos.
- Leer la tarjeta de usuario para saber si está activada.
- Saber que bicicleta ha sido retirada y el número de anclaje que ha sido liberado.

## Prerequisitos
- Java 11
- Maven

## Instalación

Para instalar las dependencias de maven ejecuta:
```
mvn install
```

## Créditos

Este proyecto a sido creado por Manuel Ortega.

## Contacto
Github: https://github.com/ManuOrt/biciPalma

Email: mortegamarti@cifpfbmoll.eu
