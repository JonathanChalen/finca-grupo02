
package ec.edu.uagraria.aquasense.RegistroAlertas;

import java.time.LocalDateTime;

// Record que representa una alerta generada por AquaSense.
public record Alerta(
        TipoAlerta tipo,
        String mensaje,
        LocalDateTime fecha
) {
}
