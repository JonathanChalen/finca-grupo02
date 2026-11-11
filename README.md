# Proyecto Finca - Grupo 02

## 1. Integrantes

- Jonathan Chalen Parraga
- Cristian Alejandro Choez Cumbe
- Jhonny Arellano
- Pendiente

## 2. Descripción del proyecto

El proyecto Finca permite representar parcelas agrícolas mediante la clase `Parcela` y calcular su área en metros cuadrados a partir de la cantidad de hectáreas.

Además, se incorpora el módulo AquaSense, orientado a representar información de una producción acuícola, gestionar productos y generar alertas cuando se presentan condiciones que requieren atención.

## 3. Instrucciones para ejecutar las pruebas

1. Clonar el repositorio desde GitHub.
2. Abrir el proyecto en IntelliJ IDEA.
3. Esperar a que Maven cargue las dependencias.
4. Abrir el panel Maven.
5. Ejecutar `Lifecycle → clean` y después `Lifecycle → verify`.
6. Verificar que la ejecución termine con el resultado `BUILD SUCCESS`.

## 4. Clases de prueba

El proyecto incluye la clase `ParcelaTest`, que comprueba el cálculo del área y el rechazo de cantidades de hectáreas no positivas.

También incluye `ParcelaChalenTest`, que verifica que una parcela de 4 hectáreas equivale a 40 000 metros cuadrados.

Para el módulo AquaSense se incorporaron las siguientes pruebas:

- `FabricaProductosTest`: comprueba la creación de productos mediante Factory.
- `MotorAlertasTest`: verifica la notificación de los observadores.
- `ReglasAquaSenseTest`: comprueba las condiciones de las tres reglas de alertas.

En total, se ejecutaron 14 pruebas con 0 errores y 0 fallos.

## 5. Dificultades encontradas y soluciones

Durante el desarrollo se presentó un inconveniente al configurar la dirección del repositorio remoto de GitHub. Se corrigió la dirección para que coincidiera con el nombre del repositorio y se logró publicar el proyecto correctamente.

También se presentaron ajustes en la organización de los paquetes y clases del módulo AquaSense. Finalmente, se ejecutaron las pruebas desde IntelliJ IDEA mediante Maven y se obtuvo el resultado `BUILD SUCCESS`.

## 6. Repositorio

Enlace: [Repositorio Finca - Grupo 02](https://github.com/JonathanChalen/finca-grupo02)

El repositorio es privado y el acceso depende de los permisos concedidos a sus colaboradores.

## 7. Taller 4 - Principios SOLID, Factory y Observer

En este taller se desarrolló el módulo AquaSense, aplicando principios de programación orientada a objetos y patrones de diseño.

### 7.1. Productos del módulo AquaSense

Se crearon tres tipos de productos:

- `BiomasaPiscina`: representa la información de una piscina acuícola.
- `LoteCamaron`: representa un lote de camarones.
- `InsumoAcuicola`: representa los insumos utilizados en la producción.

También se implementó la interfaz `Trazable` para generar códigos de identificación.

### 7.2. Patrón Factory

Se implementó la clase `FabricaProductos`, encargada de crear los productos y generar sus códigos automáticamente.

### 7.3. Patrón Observer

Se implementó un sistema de alertas con dos observadores:

- `ObservadorConsola`: muestra las alertas en la consola.
- `ObservadorLista`: almacena las alertas generadas.

### 7.4. Reglas de alertas

El sistema cuenta con tres reglas configurables:

- Oxígeno bajo: detecta cuando el oxígeno disuelto está por debajo del mínimo establecido.
- Salinidad fuera de rango: detecta cuando la salinidad está fuera de los límites configurados.
- Temperatura alta: detecta cuando la temperatura supera el máximo establecido.

### 7.5. Principios SOLID

Durante el desarrollo se aplicaron los principios SOLID para organizar mejor las responsabilidades de las clases, facilitar la ampliación del sistema y reducir las dependencias directas.

### 7.6. Pruebas y documentación

Se utilizaron pruebas unitarias con JUnit 5 para comprobar el funcionamiento de la fábrica y las reglas de alertas.

También se elaboró un diagrama UML para representar las clases y sus relaciones.

El diagrama se encuentra en:

`docs/diagrama-uml.md`

La ejecución de Maven mediante `clean verify` finalizó correctamente con 14 pruebas aprobadas.