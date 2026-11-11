package ec.edu.uagraria.aquasense.reglas;

import ec.edu.uagraria.aquasense.dominio.BiomasaPiscina;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Pruebas unitarias para las reglas de AquaSense.
class ReglasAquaSenseTest {

    // Crea una piscina con valores de prueba.
    private BiomasaPiscina crearPiscina(
            double oxigeno,
            double salinidad,
            double temperatura) {

        return new BiomasaPiscina(
                "BIO-001",
                "Piscina 1",
                1000,
                oxigeno,
                salinidad,
                temperatura
        );
    }

    @Test
    void debeGenerarAlertaCuandoElOxigenoEsBajo() {
        var regla = ReglasAquaSense.oxigenoBajo(4.0);

        assertTrue(regla.evaluar(crearPiscina(3.9, 20, 28)).isPresent());
    }

    @Test
    void noDebeGenerarAlertaEnElLimiteDeOxigeno() {
        var regla = ReglasAquaSense.oxigenoBajo(4.0);

        assertTrue(regla.evaluar(crearPiscina(4.0, 20, 28)).isEmpty());
    }

    @Test
    void debeGenerarAlertaCuandoLaSalinidadEstaFueraDeRango() {
        var regla = ReglasAquaSense.salinidadFueraRango(5.0, 35.0);

        assertTrue(regla.evaluar(crearPiscina(5, 4.9, 28)).isPresent());
        assertTrue(regla.evaluar(crearPiscina(5, 35.1, 28)).isPresent());
    }

    @Test
    void noDebeGenerarAlertaEnLosLimitesDeSalinidad() {
        var regla = ReglasAquaSense.salinidadFueraRango(5.0, 35.0);

        assertTrue(regla.evaluar(crearPiscina(5, 5.0, 28)).isEmpty());
        assertTrue(regla.evaluar(crearPiscina(5, 35.0, 28)).isEmpty());
    }

    @Test
    void debeGenerarAlertaCuandoLaTemperaturaEsAlta() {
        var regla = ReglasAquaSense.temperaturaAlta(32.0);

        assertTrue(regla.evaluar(crearPiscina(5, 20, 32.1)).isPresent());
    }

    @Test
    void noDebeGenerarAlertaEnElLimiteDeTemperatura() {
        var regla = ReglasAquaSense.temperaturaAlta(32.0);

        assertTrue(regla.evaluar(crearPiscina(5, 20, 32.0)).isEmpty());
    }
}
