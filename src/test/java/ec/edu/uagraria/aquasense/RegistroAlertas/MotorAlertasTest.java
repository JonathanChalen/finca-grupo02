package ec.edu.uagraria.aquasense.RegistroAlertas;

import ec.edu.uagraria.aquasense.dominio.BiomasaPiscina;
import ec.edu.uagraria.aquasense.reglas.ReglasAquaSense;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Pruebas unitarias para el motor de alertas.
class MotorAlertasTest {

    @Test
    void debeNotificarALosObservadoresCuandoExisteUnaAlerta() {

        MotorAlertas motor = new MotorAlertas();

        ObservadorLista observador = new ObservadorLista();

        motor.agregarRegla(ReglasAquaSense.oxigenoBajo(4.0));
        motor.suscribir(observador);

        BiomasaPiscina piscina = new BiomasaPiscina(
                "BIO-001",
                "Piscina 1",
                1000,
                3.0,
                20,
                28
        );

        motor.evaluar(piscina);

        assertEquals(1, observador.obtenerAlertas().size());
        assertEquals(
                TipoAlerta.OXIGENO_BAJO,
                observador.obtenerAlertas().get(0).tipo()
        );
    }

    @Test
    void noDebeNotificarCuandoNoExisteUnaAlerta() {

        MotorAlertas motor = new MotorAlertas();

        ObservadorLista observador = new ObservadorLista();

        motor.agregarRegla(ReglasAquaSense.oxigenoBajo(4.0));
        motor.suscribir(observador);

        BiomasaPiscina piscina = new BiomasaPiscina(
                "BIO-002",
                "Piscina 2",
                1000,
                5.0,
                20,
                28
        );

        motor.evaluar(piscina);

        assertTrue(observador.obtenerAlertas().isEmpty());
    }
}
