
## Laboratorio 


### Descripcion General

Este directorio contiene las instruciones para el primer ejercicio relacionado con el tema: Ejemplos prácticos de diseño de APIs REST


#### Actividades

*  Descargar repositorio
*  Levantar servidor de Mocks
*  Consumir los apis de ejemplos


### Configuracion

Antes de Iniciar debes de iniciar asegurarse que cuenta con todo lo necesario para el laboratorio


#### Que se necesita

* Acceso a un navegador de Internet
* Tener instalado Visual Studio Code
* Tener instalado un Cliente de Api's
* Tener instalado Docker, Docker Compose, Git.
* Tener configurada una clave SSH
* Tener configurada Git
* Tener configurado Docker
* Tener configurada Docker Compose

---

### Descargar el repositorio de Github

1. Accede a por medio del navegador a la direccion: 
https://github.com/academia-consultec/api-design

2. Desplegar el boton `Code` y seleccionar `HTTPS` copiando con la url:

`https://github.com/academia-consultec/api-design.git`

3. Abre la terminal  

4. En la terminal ve al directorio del trabajo de tu usuario 

`cd /Users/{NombreUsuario}`

5. Crea un nuevo directorio y acceder al directorio

```
mkdir academia-consultec
cd academia-consultec
```

6. Clona el repositorio

git clone https://github.com/academia-consultec/api-design.git



### Aprovisione el entorno 

1. Accede a la carpeta 

`lab-10` 

2. Abre el archivo 

`docker-compose.yml`

3. levanta el entorno ejecutando en la terminal 

`docker compose up`

4. Valida que el servidor de Mocks este disponible accediendo por le navegador a:

`http://localhost:9000`

----
### Diseno API de Producto

1. Crea un api de producto con las siguientes condiciones:
* Una operacion de login 
* Una operacion de consulta de producto
* Una operacion de consulta de producto por id
* Deben usar una autorizacion 

2. Crear un mock services

### API en Python

1. Entra  a la carpeta de python

2. Revisa el archivo main.py

3. Crea la imagen

`docker build -t api-product .`

4. Valida la creacion de la imagen

` docker images `

5. Ejecuta el contenedor

`docker run -p 8000:8000 api-product`

6. Prueba las Operaciones