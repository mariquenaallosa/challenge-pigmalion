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
- `SumChecker.java` → Archivo principal que actúa como `main`, con un menú interactivo en consola para elegir algoritmo y conjunto de prueba.

---

## 📌 Suposiciones realizadas

- El array puede contener números repetidos.
- No se permite usar el **mismo índice** dos veces.
- Dos valores iguales pueden sumarse si están en posiciones distintas.
- El objetivo es retornar un valor booleano (`true` o `false`) indicando si existe alguna combinación válida.
- Se desarrollan **dos enfoques**, como lo solicita el enunciado: uno que minimiza el tiempo de desarrollo, y otro que optimiza recursos y tiempo de ejecución.

---

## ▶️ Instrucciones de ejecución

1. Abrir los archivos en un entorno como IntelliJ, VS Code o Replit. Actualmente se encuentra en Replit https://replit.com/@mariquenaallosa/challenge-pigmalion?v=1 
2. Ejecutar `SumChecker.java`, que incluye un menú en consola para elegir qué algoritmo correr (`Fast` o `Optimized`) y con qué array de prueba.
3. El resultado se imprime en consola.


