# Design Patterns Backend

## Objetivo

Elegir el patrón de diseño que mejor resuelva el problema del enunciado.

No aplicar patrones por decoración. El patrón debe mejorar claridad, extensibilidad o separación de responsabilidades.

## Decisión rápida

### Creacionales

Usar cuando el problema sea crear objetos.

- `Factory Method`: crear distintos objetos según tipo sin llenar el código de `new`.
- `Abstract Factory`: crear familias de objetos relacionados.
- `Builder`: construir objetos con muchos campos o pasos.
- `Prototype`: clonar objetos base y modificar algunos datos.
- `Singleton`: en Spring no implementarlo manualmente; los beans ya suelen ser singleton.

### Estructurales

Usar cuando el problema sea conectar, adaptar o componer clases.

- `Adapter`: adaptar una clase, API o librería con interfaz incompatible.
- `Facade`: simplificar un flujo complejo detrás de una operación simple.
- `Decorator`: agregar comportamiento sin modificar la clase original.
- `Composite`: tratar objetos simples y compuestos de la misma forma.
- `Proxy`: controlar acceso, permisos, carga diferida o llamadas costosas.
- `Bridge`: separar dos dimensiones que varían independientemente.
- `Flyweight`: compartir datos comunes entre muchos objetos similares.

### Comportamiento

Usar cuando el problema sea variar reglas, algoritmos o responsabilidades.

- `Strategy`: muchas formas intercambiables de calcular, validar o ejecutar una regla.
- `State`: el comportamiento cambia según el estado interno de una entidad.
- `Chain of Responsibility`: varias validaciones o handlers en cadena.
- `Command`: encapsular una acción como objeto ejecutable.
- `Observer`: varios objetos reaccionan ante un evento.
- `Template Method`: flujo con pasos fijos y algunos pasos variables.
- `Mediator`: centralizar comunicación entre varios objetos.
- `Iterator`: recorrer colecciones ocultando estructura interna.
- `Memento`: guardar y restaurar estados anteriores.
- `Visitor`: agregar operaciones sobre una jerarquía sin modificar sus clases.

## Casos típicos de parcial

- Muchos `if/else` por tipo de operación: evaluar `Strategy`.
- Muchas validaciones en orden: evaluar `Chain of Responsibility`.
- Estados como `PENDING`, `APPROVED`, `CANCELLED`: evaluar `State`.
- Crear objetos distintos según tipo: evaluar `Factory Method`.
- Armar DTO o entidad compleja: evaluar `Builder`.
- Conectar una API externa o clase incompatible: evaluar `Adapter`.
- Controller o service coordinando demasiados pasos: evaluar `Facade`.
- Agregar validación/logging/comportamiento extra: evaluar `Decorator`.

## Reglas Spring Boot

- No implementar Singleton manual.
- `@Service`, `@Component`, `@Repository` y `@Configuration` ya son administrados por Spring.
- `Strategy`: interfaz + varias implementaciones `@Component` o `@Service`.
- `Chain of Responsibility`: interfaz de handler + lista inyectada de handlers.
- `Factory Method`: clase factory que selecciona implementación según tipo.
- `Adapter`: clase que traduce entre una interfaz externa y una interna.
- `Facade`: service que coordina varios pasos y expone una operación simple.

## Criterio final

Antes de codificar, decidir:

1. Qué problema del enunciado requiere patrón.
2. Qué categoría corresponde: creacional, estructural o comportamiento.
3. Qué patrón encaja mejor.
4. Qué clases representan el patrón.
5. Qué tests demuestran que el comportamiento funciona.

Si dos patrones parecen posibles, elegir el más simple de explicar y mantener.