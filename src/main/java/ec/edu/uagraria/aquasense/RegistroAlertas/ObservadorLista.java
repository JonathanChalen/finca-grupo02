
package ec.edu.uagraria.aquasense.RegistroAlertas;

import java.util.ArrayList;
import java.util.List;

// Observador que almacena las alertas en una lista.
public class ObservadorLista implements ObservadorAlertas {

    private final List<Alerta> alertas = new ArrayList<>();

    @Override
    public void actualizar(Alerta alerta) {
        alertas.add(alerta);
    }

    // Devuelve las alertas almacenadas.
    public List<Alerta> obtenerAlertas() {
        return List.copyOf(alertas);
    }
}
