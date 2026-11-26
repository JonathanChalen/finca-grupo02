package ec.edu.uagraria.aquasense.servicio;

// Representa un registro del inventario.
public record ItemInventario(
        String codigo,
        String tipo,
        String descripcion,
        double cantidad
) {

    // Valida que la cantidad no sea negativa.
    public ItemInventario {
        if (cantidad < 0) {
            throw new IllegalArgumentException(
                    "La cantidad no puede ser negativa"
            );
        }
    }
}