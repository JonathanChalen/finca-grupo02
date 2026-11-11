package ec.edu.uagraria.aquasense.reglas;

import ec.edu.uagraria.aquasense.RegistroAlertas.Alerta;
import ec.edu.uagraria.aquasense.dominio.BiomasaPiscina;

import java.util.Optional;

// Interfaz funcional para evaluar una regla de alerta.
@FunctionalInterface
public interface ReglaAlerta {

    // Evalúa los datos de una piscina y devuelve una alerta si corresponde.
    Optional<Alerta> evaluar(BiomasaPiscina biomasa);
}
