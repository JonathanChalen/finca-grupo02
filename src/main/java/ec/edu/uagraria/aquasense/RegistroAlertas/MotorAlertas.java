package ec.edu.uagraria.aquasense.RegistroAlertas;

import ec.edu.uagraria.aquasense.dominio.BiomasaPiscina;
import ec.edu.uagraria.aquasense.reglas.ReglaAlerta;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Motor encargado de ejecutar las reglas y notificar las alertas.
public class MotorAlertas {

    private final List<ReglaAlerta> reglas = new ArrayList<>();
    private final List<ObservadorAlertas> observadores = new ArrayList<>();

    // Permite agregar reglas de evaluación.
    public void agregarRegla(ReglaAlerta regla) {
        reglas.add(regla);
    }

    // Permite suscribir observadores al sistema.
    public void suscribir(ObservadorAlertas observador) {
        observadores.add(observador);
    }

    // Evalúa las reglas y notifica cuando se genera una alerta.
    public void evaluar(BiomasaPiscina biomasa) {
        for (ReglaAlerta regla : reglas) {
            Optional<Alerta> resultado = regla.evaluar(biomasa);

            resultado.ifPresent(alerta -> {
                for (ObservadorAlertas observador : observadores) {
                    observador.actualizar(alerta);
                }
            });
        }
    }
}
