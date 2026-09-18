# Instrucciones para agentes de backend

Alcance: `BE/**`.

## Contexto del proyecto

El proyecto ya tiene una arquitectura base creada.

- Respetar la estructura existente.
- No renombrar paquetes ni carpetas.
- No mover clases existentes salvo que sea necesario para cumplir el enunciado.
- Usar las carpetas ya creadas:
  - `controller`
  - `service`
  - `service/impl`
  - `repository`
  - `entity`
  - `dto`
  - `mapper`
  - `exception`
  - `config`
- Ya existe manejo global de errores. Usarlo en vez de crear otro.
- Ya existe configuración de H2.
- No agregar PostgreSQL, Flyway, Swagger, Security ni dependencias nuevas salvo que el enunciado lo exija.

## Lectura

- Para preguntas simples, diagnósticos o navegación sin editar código: leer solo este archivo.
- Para cambios funcionales de backend: leer las rules relevantes antes de editar:
  - `BE/.ai/rules/backend-architecture.md`
  - `BE/.ai/rules/clean-code.md`
  - `BE/.ai/rules/testing.md`
  - `BE/.ai/rules/design-patterns.md`
- No duplicar en este archivo el detalle que vive en las rules.

## Reglas críticas

- Respetar el flujo `Controller -> Service -> Repository`.
- Mantener controllers finos; la lógica de negocio vive en services.
- Usar DTOs para entrada y salida de la API.
- No exponer entidades JPA desde controllers.
- Inyectar interfaces cuando existan.
- Usar `@RequiredArgsConstructor` y dependencias `private final`.
- No usar field injection con `@Autowired`.
- No usar `var` ni ternarios anidados.
- CORS debe estar centralizado por defecto.
- No usar `@CrossOrigin` en controllers salvo excepción justificada.
- El parcial exige patrones de diseño: elegir el patrón según `BE/.ai/rules/design-patterns.md`, no por decoración.
- Agregar pruebas unitarias para services y controllers cuando el cambio sea funcional.
- Mantener cobertura mínima del 80% en services y controllers.

## Skill del stack

- `BE/.ai/skills/spring-backend/SKILL.md`: usar para crear o modificar features Spring Boot.

Usar solo esta skill cuando la tarea sea funcional de backend. No cargar skills de más.

## Validación

Para cambios funcionales de backend:

```bash
mvnw.cmd -q test