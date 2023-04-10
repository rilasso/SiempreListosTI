
## Laboratorio 02


### Descripcion General

Este directorio contiene las instruciones para el primer ejercicio relacionado con el tema: Conceptos básicos de REST y su utilización en el diseño de APIs



#### Actividades

* Descargar repositorio
* Levantar servidor de diagramas
* Crear Diagrama de estructura de Apis
* Crear Ejemplos de peticiones de Apis


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

`lab-02` 

2. Abre el archivo 

`docker-compose.yml`

3. levanta el entorno ejecutando en la terminal 

`docker compose up`

4. Valida que el servidor de Diagramas este disponible accediendo por le navegador a:

`http://localhost:9080`

----

### Diagramando APIs

1. Abre el navegador

2. Crear un diagrama de flujo colocando identificando los siguientes elementos:

Documentacion:`https://mermaid.js.org/syntax/flowchart.html`

* Recursos 
* Verbos HTTP 
* URI's 
* Representacion del Recurso 


Ejemplo:
``` mermaid
flowchart LR
    A[Verbo] --> B(Uris)
    B --> C{Recurso}
    C -->|Peticion| D[path]
    C -->|Respuesta| E[json]
```


Para las siguientes operaciones de un api de Supermercado:

* Crear un producto en el inventario (Agrega Diagrama debajo)

* Consultar los productos del inventario

* Eliminar un producto del inventario

* Actualizar un producto en el inventario
