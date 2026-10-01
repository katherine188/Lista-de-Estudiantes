# Ejercicio Estudiantes - Lista Simplemente Enlazada

## Descripción

Este proyecto implementa una lista simplemente enlazada para almacenar información de estudiantes.

Cada estudiante contiene los siguientes datos:

- CI
- Nombre
- Apellido
- Sexo
- Año
- Mes de cumpleaños
- Militante de la UJC
- Becado

El proyecto fue desarrollado en Java utilizando nodos y una lista simplemente enlazada.

## Estructura del proyecto

El proyecto está compuesto por las siguientes clases:

- `Estudiante.java`: contiene los datos de cada estudiante.
- `Nodo.java`: representa cada nodo de la lista y almacena un estudiante y la referencia al siguiente nodo.
- `ListaEstudiantes.java`: contiene la implementación de la lista y sus operaciones.
- `Main.java`: contiene los datos de prueba y ejecuta las operaciones.

## Operaciones implementadas

### 1. Agregar estudiante

El método `agregar()` permite insertar un estudiante al final de la lista.

Para cada estudiante se almacenan sus datos y se crea un nuevo nodo que queda enlazado con el resto de la lista.

### 2. Cumpleaños

El método `Cumpleaños(String mes)` recibe como parámetro el nombre de un mes.

Recorre la lista de estudiantes y busca aquellos cuyo mes de cumpleaños coincide con el mes indicado.

El método devuelve los nombres de los estudiantes que cumplen años en ese mes.

Por ejemplo, al buscar el mes "Marzo", se muestran:

- Ana
- Maria
- Sofia

### 3. Cantidad de militantes de la UJC

El método `CantMilitantes()` busca los estudiantes que son militantes de la UJC.

Los militantes se muestran ordenados según su año de forma ascendente, comenzando por el estudiante con el año menor.

Ejemplo:

```text
Pedro Hernandez - 2001
Luis Garcia - 2003
Ana Gomez - 2004
Maria Rodriguez - 2005

### 4. Cantidad de estudiantes becados
El método CantBecados() recorre la lista y cuenta cuantos estudiantes tienen la condición de becado. El método devuelve un número entero con la cantidad total de estudiantes becados
Luis Garcia - 2003
Ana Gomez - 2004
Maria Rodriguez - 2005
