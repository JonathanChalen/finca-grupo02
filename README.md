# Proyecto Finca - Grupo 02

## 1. Integrantes

- Jonathan Chalen Parraga
- Cristian Alejandro Choez Cumbe
- Jhonny Arellano
- Pendiente

## 2. Descripción del proyecto

El proyecto Finca permite representar parcelas agrícolas mediante la clase `Parcela` y calcular su área en metros cuadrados a partir de la cantidad de hectáreas.

También incluye AquaSense, un módulo orientado a gestionar productos acuícolas y generar alertas sobre las condiciones del agua.

## 3. Instrucciones para ejecutar las pruebas

1. Clonar el repositorio desde GitHub.
2. Abrir el proyecto en IntelliJ IDEA.
3. Esperar a que Maven cargue las dependencias.
4. Abrir el panel Maven.
5. Ejecutar `Lifecycle → clean` y después `Lifecycle → verify`.
6. Comprobar que aparezca `BUILD SUCCESS`.

## 4. Clases de prueba

El proyecto incluye las siguientes pruebas:

- `ParcelaTest`: comprueba el cálculo del área y las validaciones.
- `ParcelaChalenTest`: verifica que una parcela de 4 hectáreas equivale a 40 000 metros cuadrados.
- `FabricaProductosTest`: comprueba la creación de productos mediante Factory.
- `MotorAlertasTest`: verifica las notificaciones de los observadores.
- `ReglasAquaSenseTest`: comprueba las condiciones de las reglas de alertas.

En total, se ejecutaron 14 pruebas con 0 errores y 0 fallos.

## 5. Dificultades encontradas y soluciones

Durante el desarrollo se presentaron inconvenientes con la configuración del repositorio remoto y la organización de algunos paquetes. Se realizaron los ajustes necesarios y se verificó el funcionamiento del proyecto mediante las pruebas de Maven.

## 6. Repositorio

[Repositorio Finca - Grupo 02](https://github.com/JonathanChalen/finca-grupo02)

El repositorio es privado y el acceso depende de los permisos concedidos a sus colaboradores.

## 7. Diagnóstico del código actual

| Pregunta | Respuesta del grupo |
|---|---|
| ¿Qué clase tiene más de un motivo para cambiar? | La clase Demo, porque crea objetos, realiza operaciones y muestra resultados en consola. |
| ¿Dónde se usa `new` directamente sobre los records del dominio? | En Demo.java, donde se crean objetos Producto, Cultivo y Animal. |
| ¿Hay umbrales o tarifas escritos como números sueltos dentro de una regla? | En el diagnóstico inicial todavía no existían reglas de alertas. |
| ¿Hay alguna herencia que exista solo para reutilizar código? | No. El proyecto utiliza la interfaz sellada Activo, implementada por los records del dominio. |

## 8. Taller 4 - SOLID, Factory y Observer

Se desarrolló el módulo AquaSense para gestionar productos acuícolas y generar alertas cuando las condiciones del agua salen de los límites configurados.

### Productos del módulo

- `BiomasaPiscina`: representa información de una piscina acuícola.
- `LoteCamaron`: representa un lote de camarones.
- `InsumoAcuicola`: representa los insumos utilizados en la producción.

También se implementó la interfaz `Trazable` para generar códigos de identificación.

### Patrones de diseño aplicados

- **Factory:** la clase `FabricaProductos` se encarga de crear los productos y generar sus códigos.
- **Observer:** `MotorAlertas` notifica cuando se genera una alerta mediante `ObservadorConsola` y `ObservadorLista`.

### Principios SOLID

- **SRP:** cada clase tiene una responsabilidad específica.
- **OCP:** permite agregar nuevas reglas sin modificar el motor de alertas.
- **LSP:** los productos implementan la interfaz `Trazable`.
- **ISP:** las interfaces tienen métodos específicos.
- **DIP:** `MotorAlertas` trabaja con las abstracciones `ReglaAlerta` y `ObservadorAlertas`.

### Reglas de alerta

El sistema cuenta con tres reglas configurables:

- Oxígeno bajo: detecta cuando el oxígeno está por debajo del mínimo establecido.
- Salinidad fuera de rango: detecta cuando la salinidad está fuera de los límites configurados.
- Temperatura alta: detecta cuando la temperatura supera el máximo establecido.

Los límites se reciben mediante parámetros para permitir su configuración.

### Pruebas y documentación

Se utilizaron pruebas unitarias con JUnit 5 para comprobar la creación de productos, las reglas de alertas y las notificaciones del motor.

La ejecución de `clean verify` finalizó correctamente con 14 pruebas aprobadas.

El diagrama UML se encuentra en `docs/diagrama-uml.md`.