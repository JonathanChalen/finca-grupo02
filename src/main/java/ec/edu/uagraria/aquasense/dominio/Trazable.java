package ec.edu.uagraria.aquasense.dominio;

import java.util.UUID;

// Interfaz para los productos que necesitan un código único.
public interface Trazable {

    // Devuelve el código de identificación del producto.
    String codigo();

    // Genera un código único utilizando un prefijo.
    static String generarCodigo(String prefijo) {
        if (prefijo == null || prefijo.isBlank()) {
            throw new IllegalArgumentException("El prefijo no puede estar vacío");
        }

        return prefijo.toUpperCase() + "-"
                + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
}
