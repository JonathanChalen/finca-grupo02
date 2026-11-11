package ec.edu.uagraria.aquasense.dominio;

// Record que representa la biomasa de una piscina acuícola.
public record BiomasaPiscina(
        String codigo,
        String nombrePiscina,
        double cantidadKg,
        double oxigenoDisuelto,
        double salinidad,
        double temperatura
) implements Trazable {

    // Valida los datos de la biomasa.
    public BiomasaPiscina {
        if (nombrePiscina == null || nombrePiscina.isBlank()) {
            throw new IllegalArgumentException("El nombre de la piscina es obligatorio");
        }

        if (cantidadKg < 0) {
            throw new IllegalArgumentException("La biomasa no puede ser negativa");
        }
    }
}
