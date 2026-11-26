package ec.edu.uagraria.aquasense.servicio;

// Clase para probar el funcionamiento del inventario.
public class DemoTaller7 {

    public static void main(String[] args) {

        // Creamos el inventario.
        Inventario inventario = new Inventario();

        // Registramos productos de AquaSense.
        inventario.registrar(new ItemInventario(
                "BIO-001", "BiomasaPiscina", "Piscina 1", 250.0));

        inventario.registrar(new ItemInventario(
                "BIO-002", "BiomasaPiscina", "Piscina 2", 180.0));

        inventario.registrar(new ItemInventario(
                "CAM-001", "LoteCamaron", "Lote de camarón A", 500.0));

        inventario.registrar(new ItemInventario(
                "INS-001", "InsumoAcuicola", "Alimento balanceado", 100.0));

        // Registramos nuevamente un código para comprobar los duplicados.
        inventario.registrar(new ItemInventario(
                "BIO-001", "BiomasaPiscina", "Piscina 1", 250.0));

        // Mostramos la cantidad de registros.
        System.out.println("=== INVENTARIO AQUASENSE ===");
        System.out.println("Total de registros: "
                + inventario.registros().size());

        // Mostramos los códigos sin duplicados.
        System.out.println("\nCódigos únicos:");
        System.out.println(inventario.codigosUnicos());

        // Mostramos los totales por tipo.
        System.out.println("\nTotal por tipo:");
        System.out.println(inventario.totalPorTipo());

        // Mostramos los registros ordenados.
        System.out.println("\nInventario ordenado por cantidad:");
        inventario.ordenadosPorCantidad().forEach(System.out::println);

        // Agregamos los elementos a la cola de despacho.
        inventario.ordenadosPorCantidad().forEach(
                inventario::encolarDespacho
        );

        // Mostramos los elementos pendientes.
        System.out.println("\nPendientes de despacho: "
                + inventario.pendientesDespacho());

        // Despachamos el primer elemento.
        System.out.println("\nElemento despachado:");
        System.out.println(inventario.despacharSiguiente());

        // Mostramos los pendientes después del despacho.
        System.out.println("Pendientes después del despacho: "
                + inventario.pendientesDespacho());
    }
}

