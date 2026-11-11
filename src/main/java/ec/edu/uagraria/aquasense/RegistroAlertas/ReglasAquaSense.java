
package ec.edu.uagraria.aquasense.reglas;

import ec.edu.uagraria.aquasense.RegistroAlertas.Alerta;
import ec.edu.uagraria.aquasense.RegistroAlertas.TipoAlerta;

import java.time.LocalDateTime;
import java.util.Optional;

// Contiene las reglas para controlar la calidad del agua.
public class ReglasAquaSense {

    // Genera una alerta si el oxígeno está por debajo del límite.
    public static ReglaAlerta oxigenoBajo(double minimo) {
        return biomasa -> biomasa.oxigenoDisuelto() < minimo
                ? Optional.of(new Alerta(
                TipoAlerta.OXIGENO_BAJO,
                "Oxígeno bajo en la piscina " + biomasa.nombrePiscina(),
                LocalDateTime.now()))
                : Optional.empty();
    }

    // Genera una alerta si la salinidad está fuera del rango permitido.
    public static ReglaAlerta salinidadFueraRango(double minimo, double maximo) {
        return biomasa -> biomasa.salinidad() < minimo || biomasa.salinidad() > maximo
                ? Optional.of(new Alerta(
                TipoAlerta.SALINIDAD_FUERA_RANGO,
                "Salinidad fuera de rango en la piscina " + biomasa.nombrePiscina(),
                LocalDateTime.now()))
                : Optional.empty();
    }

    // Genera una alerta si la temperatura supera el límite.
    public static ReglaAlerta temperaturaAlta(double maximo) {
        return biomasa -> biomasa.temperatura() > maximo
                ? Optional.of(new Alerta(
                TipoAlerta.TEMPERATURA_ALTA,
                "Temperatura alta en la piscina " + biomasa.nombrePiscina(),
                LocalDateTime.now()))
                : Optional.empty();
    }
}
