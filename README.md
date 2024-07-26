# PruebaDineroFacil# DineroFacil.com Project

## Descripción

Este proyecto consiste en una aplicación para la empresa DineroFacil.com, que se dedica a prestar pequeñas sumas de dinero a personas naturales. La aplicación está dividida en dos partes principales: el backend, desarrollado con Spring Boot y SQL Server, y el frontend, desarrollado con Angular.

## Tabla de Contenidos

1. [Diseño de la Base de Datos](#diseño-de-la-base-de-datos)
2. [Backend](#backend)
   - [Instalación](#instalación-del-backend)
   - [Ejecución](#ejecución-del-backend)
3. [Frontend](#frontend)
   - [Librería Angular `template-test-ng`](#librería-angular-template-test-ng)
   - [Proyecto Angular `test-app-ng`](#proyecto-angular-test-app-ng)
   - [Instalación](#instalación-del-frontend)
   - [Ejecución](#ejecución-del-frontend)
4. [Pruebas Unitarias](#pruebas-unitarias)
5. [Instrucciones Generales](#instrucciones-generales)

## Diseño de la Base de Datos

El modelo de la base de datos incluye las siguientes tablas:

- Clientes
- Referencias
- InformaciónLaboral
- LíneasCredito
- SolicitudesCredito

![Modelo de la Base de Datos](Proyecto_Prueba_Back\BD\Diagrama tablas.png)

# Frontend

## Librería Angular `template-test-ng`

La librería `template-test-ng` proporciona una estructura básica para la aplicación, incluyendo componentes para el encabezado, menú, cuerpo y pie de página.

### Componentes

- **HeaderComponent**: Muestra el nombre de la aplicación y el logo.
- **MenuComponent**: Proporciona un espacio para enlaces de navegación.
- **BodyComponent**: Espacio de trabajo principal donde se mostrarán los CRUDs.
- **FooterComponent**: Muestra el correo electrónico de contacto.

## Proyecto Angular `test-app-ng`

El proyecto `test-app-ng` utiliza la librería `template-test-ng` ejecuta la aplicacion 'ng serve --project=test-app-ng'




