package ec.edu.uagraria.aquasense.RegistroAlertas;

// Observador que muestra las alertas en la consola.
public class ObservadorConsola implements ObservadorAlertas {

    @Override
    public void actualizar(Alerta alerta) {
        System.out.println("ALERTA: " + alerta.tipo());
        System.out.println("Mensaje: " + alerta.mensaje());
        System.out.println("Fecha: " + alerta.fecha());
    }
}
