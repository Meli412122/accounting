# Clean Code backend

## Estilo Java

- Prohibido usar `var`.
- Usar nombres en ingles para clases, metodos, variables, logs y excepciones.
- Evitar ternarios complejos.
- Prohibidos ternarios anidados.
- Lambdas y streams estan permitidos solo si son faciles de leer para un dev Junior/Trainee.
- Si un stream requiere varias condiciones o transformaciones, preferir un loop claro.

## Diseno

- Evitar constructores gigantes.
- Evitar clases dios.
- Evitar metodos largos.
- Extraer constantes para numeros o strings usados en reglas.
- No dejar numeros magicos dentro de `if`, `for`, `while` o validaciones.
- Usar nombres expresivos antes que comentarios explicativos.
- Aplicar SOLID y Clean Code.

## Errores

- No silenciar excepciones.
- No capturar excepciones sin accion clara.
- Usar excepciones de dominio cuando exista una alternativa especifica.

## Complejidad y rendimiento

- Antes de implementar lógica con colecciones, estimar la complejidad Big O.
- Evitar bucles anidados innecesarios si el problema puede resolverse con `Map`, `Set` o agrupaciones.
- Evitar llamadas a repository dentro de loops.
- Si se necesita buscar repetidamente por id, nombre o código, precargar datos y usar `Map`.
- Si se necesita validar pertenencia, usar `Set` en vez de recorrer listas varias veces.
- Si se necesita ordenar, usar `sort` o `stream().sorted()` y considerar que cuesta `O(n log n)`.
- No optimizar prematuramente si el volumen es chico y la solución simple es clara.
- Priorizar claridad, pero evitar soluciones claramente `O(n²)` cuando una solución `O(n)` sea sencilla.
- Cubrir casos borde con tests unitarios.