
## Laboratorio 03


### Descripcion General

Este directorio contiene las instruciones para el primer ejercicio relacionado con el tema: Diseño de la estructura de la API: rutas y métodos HTTP




#### Actividades

* Descargar repositorio
* Levantar servidor de mocks
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

4. Valida que el servidor de Mocks este disponible accediendo por le navegador a:

`http://localhost:9000`

---

### Creando Peticiones

Crea las peticiones para las siguientes operaciones de un api de Supermercado:

* Crear un producto en el inventario 

* Consultar los productos del inventario

* Eliminar un producto del inventario

* Actualizar un producto en el inventario


1. Abre el archivo `request.http`

2. Crea las estructuras de ejemplo para las operaciones del api de Supermercado
Estructura:

`Metodo {Uris}/{Recurso}   Protocolo `

Debes usar la siguiente URI  `/api/v1`

El objecto *producto* debe tener: id,nombre,descripcion,precio.

Ejemplo: 
```
#Consulta de Usuarios
### 
# GET http://localhost:8000/usuario/4258951087961709784  HTTP/1.1
```

4. Ejecuta tus peticiones.


Documentacion: https://marketplace.visualstudio.com/items?itemName=humao.rest-client