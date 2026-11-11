package ec.edu.uagraria.aquasense.RegistroAlertas;

// Interfaz para los componentes que reciben notificaciones.
@FunctionalInterface
public interface ObservadorAlertas {

    // Recibe una alerta cuando el sistema detecta un problema.
    void actualizar(Alerta alerta);
}
