
# Proyecto Finca - Grupo 02

## 1. Integrantes

- Jonathan Chalen Parraga
- Cristian Alejandro Choez Cumbe
- Jhonny Arellano
- Pendiente

## 2. Descripción del proyecto

El proyecto Finca permite representar parcelas agrícolas mediante la clase `Parcela` y calcular su área en metros cuadrados a partir de la cantidad de hectáreas.

El proyecto también incluye actividades de los Talleres 2 y 3 de Programación 3, relacionadas con la programación orientada a objetos y el cálculo de costos agropecuarios.

## 3. Taller 1 - Parcelas agrícolas

Se implementó la clase `Parcela` para calcular el área de un terreno agrícola.

### Clases de prueba

El proyecto incluye la clase `ParcelaTest`, que comprueba el cálculo del área y el rechazo de cantidades de hectáreas no positivas.

También incluye `ParcelaChalenTest`, que verifica que una parcela de 4 hectáreas equivale a 40 000 metros cuadrados.

## 4. Taller 2 - Activos de una finca

Se desarrolló un programa para representar y calcular el valor de los activos de una finca.

Se utilizaron records, interfaces selladas, enumeraciones y switch con patrones.

El programa permite trabajar con productos, cultivos y animales. También se agregó un cultivo de arroz de Daule como ejemplo adicional.

Para ejecutar este taller, abrir la clase `semana2.finca.Demo` y seleccionar Run.

## 5. Taller 3 - Calculadora de costos

Se desarrolló una calculadora de costos de producción agropecuaria utilizando el patrón Strategy.

El programa permite calcular:

- Costo directo de insumos.
- Costo con mano de obra.
- Costo por hectárea.
- Costo con subsidio al fertilizante.
- Costo con IVA.

También se implementaron seis pruebas unitarias con JUnit 5, las cuales se ejecutaron correctamente.

Para ejecutar este taller, abrir la clase `ec.uagraria.costos.Main` y seleccionar Run.

## 6. Instrucciones para ejecutar las pruebas

1. Clonar el repositorio desde GitHub.
2. Abrir el proyecto en IntelliJ IDEA.
3. Esperar a que Maven cargue las dependencias.
4. Abrir el panel Maven.
5. Ejecutar `Lifecycle → test`.
6. Verificar que la ejecución termine con el resultado `BUILD SUCCESS`.

Para ejecutar las pruebas del Taller 3, abrir `CalculadoraCostosTest` y seleccionar Run.

## 7. Dificultades encontradas y soluciones

Durante el desarrollo se presentó un inconveniente al configurar la dirección del repositorio remoto de GitHub. Se corrigió la dirección para que coincidiera con el nombre del repositorio y se logró publicar el proyecto correctamente.

También se ejecutaron las pruebas en IntelliJ IDEA y se obtuvo el resultado `BUILD SUCCESS`.

En el Taller 3 se comprobó el funcionamiento de las cinco estrategias de cálculo y se ejecutaron seis pruebas unitarias correctamente.

## 8. Repositorio

Enlace: https://github.com/JonathanChalen/finca-grupo02

El repositorio es privado y el acceso depende de los permisos concedidos a sus colaboradores.

La rama `main` contiene el trabajo anterior y la rama `taller-03` contiene el desarrollo del Taller 3.
