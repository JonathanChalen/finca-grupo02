
# Proyecto Finca - Grupo 02

## 1. Integrantes

- Jonathan Chalen Parraga
- Cristian Alejandro Choez Cumbe
- Jhonny Arellano
- Pendiente

## 2. Descripción del proyecto

El proyecto Finca permite representar parcelas agrícolas mediante la clase `Parcela` y calcular su área en metros cuadrados a partir de la cantidad de hectáreas.

## 3. Instrucciones para ejecutar las pruebas

1. Clonar el repositorio desde GitHub.
2. Abrir el proyecto en IntelliJ IDEA.
3. Esperar a que Maven cargue las dependencias.
4. Abrir el panel Maven.
5. Ejecutar `Lifecycle → test`.
6. Verificar que la ejecución termine con el resultado `BUILD SUCCESS`.

## 4. Clases de prueba

El proyecto incluye la clase `ParcelaTest`, que comprueba el cálculo del área y el rechazo de cantidades de hectáreas no positivas.

También incluye `ParcelaChalenTest`, que verifica que una parcela de 4 hectáreas equivale a 40 000 metros cuadrados.

## 5. Dificultades encontradas y soluciones

Durante el desarrollo se presentó un inconveniente al configurar la dirección del repositorio remoto de GitHub. Se corrigió la dirección para que coincidiera con el nombre del repositorio y se logró publicar el proyecto correctamente. También se ejecutaron las pruebas en IntelliJ IDEA y se obtuvo el resultado `BUILD SUCCESS`.

## 6. Repositorio

Enlace: [Repositorio Finca - Grupo 02](https://github.com/JonathanChalen/finca-grupo02)

## 7. Diagnóstico del código actual

| Pregunta | Respuesta del grupo |
|---|---|
| ¿Qué clase tiene más de un motivo para cambiar? ¿Cuáles son? | La clase Demo, porque crea objetos, realiza operaciones y muestra resultados en consola. |
| ¿Dónde se usa new directamente sobre los records del dominio? | En Demo.java, donde se crean directamente objetos Producto, Cultivo y Animal. |
| ¿Hay umbrales o tarifas escritos como números sueltos dentro de una regla? | Todavía no existen reglas de alertas en el proyecto. |
| ¿Hay alguna herencia que exista solo para reutilizar código? | No. El proyecto utiliza la interfaz sellada Activo, implementada por los records del dominio. |

## 8. Taller 4 - SOLID, Factory y Observer

### Proyecto AquaSense - Grupo 02

AquaSense es un módulo orientado al control de condiciones de piscinas acuícolas. Permite registrar productos, evaluar la calidad del agua y generar alertas cuando se detectan condiciones fuera de los límites configurados.

### Patrones de diseño aplicados

- **Factory:** la clase FabricaProductos crea biomasa de piscina, lotes de camarón e insumos acuícolas con códigos únicos.
- **Observer:** MotorAlertas notifica a los observadores cuando se genera una alerta. Se implementaron ObservadorConsola y ObservadorLista.

### Principios SOLID

- **SRP:** cada clase tiene una responsabilidad específica.
- **OCP:** se pueden agregar nuevas reglas sin modificar el motor de alertas.
- **LSP:** los productos implementan la interfaz Trazable.
- **ISP:** las interfaces tienen métodos específicos y sencillos.
- **DIP:** MotorAlertas trabaja con las abstracciones ReglaAlerta y ObservadorAlertas.

### Reglas de alerta

| Regla | Condición |
|---|---|
| Oxígeno bajo | Oxígeno menor al mínimo configurado. |
| Salinidad fuera de rango | Salinidad menor al mínimo o mayor al máximo. |
| Temperatura alta | Temperatura mayor al máximo configurado. |

Los límites se reciben como parámetros para permitir su configuración.

### Pruebas automatizadas

Se utilizaron JUnit 5 para comprobar las reglas de alerta, sus límites, la creación de productos y las notificaciones del motor.

Para ejecutar las pruebas:

```bash
mvn clean verify
```

### Diagrama UML

El diagrama de clases se encuentra en `docs/diagrama-uml.md`.
