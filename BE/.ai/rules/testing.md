# Testing backend

## Objetivo

Todo cambio funcional del backend debe incluir pruebas unitarias que validen el comportamiento esperado.

La cobertura mínima requerida es del **80% en services y controllers**.

## Alcance obligatorio

- Crear pruebas unitarias para todos los `service` que contengan lógica de negocio.
- Crear pruebas unitarias para todos los `controller` que expongan endpoints HTTP.
- Validar casos exitosos y casos de error relevantes.
- Mantener nombres de tests descriptivos y orientados al comportamiento.

## Services

Las pruebas de services deben validar:

- Reglas de negocio.
- Validaciones propias del caso de uso.
- Llamadas esperadas a repositories o dependencias mockeadas.
- Excepciones de negocio, como `ResourceNotFoundException`, `BadRequestException` o similares.
- Conversión correcta entre entity, DTO y response cuando aplique.

Los services deben probarse con mocks usando Mockito.  
No deben depender de una base de datos real.

## Controllers

Las pruebas de controllers deben validar:

- Status HTTP esperado.
- Request body y response body.
- Validaciones con `@Valid`.
- Manejo correcto de errores.
- Llamada al service correspondiente.

Los controllers deben probarse como unidad de la capa web, preferentemente con `@WebMvcTest` y mocks del service.

## Repositories

No crear tests de repositories por defecto.

No testear métodos heredados de Spring Data JPA como:

- `findAll`
- `findById`
- `save`
- `deleteById`

Solo probar repository si existe una query personalizada importante y el enunciado lo justifica.

## Mappers

Testear mappers solo si tienen lógica relevante.

Si el mapper solo copia campos simples, no es obligatorio testearlo de forma aislada si ya queda cubierto desde service o controller.

## Cobertura

La cobertura mínima esperada es:

- `service`: 80% o más.
- `controller`: 80% o más.

La cobertura debe servir como guía, pero no reemplaza buenos casos de prueba.

No escribir tests vacíos o artificiales solo para subir el porcentaje.

## Comandos

Ejecutar tests:

```bash
./mvnw test