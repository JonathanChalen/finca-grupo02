package ec.edu.uagraria.aquasense.dominio;

// Record que representa un insumo utilizado en acuicultura.
public record InsumoAcuicola(
        String codigo,
        String nombre,
        String unidadMedida,
        double precioUnitario,
        int stock
) implements Trazable {

    // Valida los datos del insumo.
    public InsumoAcuicola {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del insumo es obligatorio");
        }

        if (unidadMedida == null || unidadMedida.isBlank()) {
            throw new IllegalArgumentException("La unidad de medida es obligatoria");
        }

        if (precioUnitario < 0 || stock < 0) {
            throw new IllegalArgumentException("El precio y el stock no pueden ser negativos");
        }
    }
}
