package ec.edu.uagraria.aquasense.dominio;

// Record que representa un lote de camarones.
public record LoteCamaron(
        String codigo,
        String nombre,
        int cantidadCamarones,
        String etapaCrecimiento
) implements Trazable {

    // Valida los datos del lote.
    public LoteCamaron {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del lote es obligatorio");
        }

        if (cantidadCamarones < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }

        if (etapaCrecimiento == null || etapaCrecimiento.isBlank()) {
            throw new IllegalArgumentException("La etapa de crecimiento es obligatoria");
        }
    }
}
