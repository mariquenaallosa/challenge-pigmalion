# Ejercicio Técnico

Este repositorio contiene la resolución del ejercicio técnico que consiste en determinar si un número `X` puede formarse mediante la suma de dos elementos de un array.

---

## 📌 Lenguaje y herramientas

- **Lenguaje:** Java
- **Versión utilizada:** JDK 17 (compatible con Java 11+)
- **Entorno de desarrollo:** IntelliJ IDEA
- **Dependencias:** Ninguna (proyecto Java puro, sin Maven ni Gradle)

---

## 📁 Archivos incluidos

- `SumCheckerFast.java` → Algoritmo simple implementado con doble bucle anidado. Prioriza rapidez de desarrollo.
- `SumCheckerOptimized.java` → Algoritmo eficiente utilizando `HashSet` para buscar complementos en una pasada. Prioriza rendimiento.

---

## 📌 Suposiciones realizadas

- El array puede contener números repetidos.
- No se permite usar el **mismo índice** dos veces.
- Dos valores iguales pueden sumarse si están en posiciones distintas.
- El objetivo es retornar un valor booleano (`true` o `false`) indicando si existe alguna combinación válida.
- Se desarrollan **dos enfoques**, como lo solicita el enunciado: uno que minimiza el tiempo de desarrollo, y otro que optimiza recursos y tiempo de ejecución.

