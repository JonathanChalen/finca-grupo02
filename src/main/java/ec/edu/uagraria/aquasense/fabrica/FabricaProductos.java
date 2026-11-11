package ec.edu.uagraria.aquasense.fabrica;

import ec.edu.uagraria.aquasense.dominio.BiomasaPiscina;
import ec.edu.uagraria.aquasense.dominio.InsumoAcuicola;
import ec.edu.uagraria.aquasense.dominio.LoteCamaron;
import ec.edu.uagraria.aquasense.dominio.TipoProducto;
import ec.edu.uagraria.aquasense.dominio.Trazable;

// Fábrica encargada de crear los productos de AquaSense.
public class FabricaProductos {

    // Crea un producto según el tipo seleccionado.
    public static Trazable crear(
            TipoProducto tipo,
            String nombre,
            double cantidad,
            double oxigeno,
            double salinidad,
            double temperatura,
            String unidadMedida,
            double precioUnitario,
            int stock,
            int cantidadCamarones,
            String etapaCrecimiento) {

        // Selecciona el producto y genera su código automáticamente.
        return switch (tipo) {
            case BIOMASA_PISCINA -> new BiomasaPiscina(
                    Trazable.generarCodigo("BIO"),
                    nombre,
                    cantidad,
                    oxigeno,
                    salinidad,
                    temperatura
            );

            case LOTE_CAMARON -> new LoteCamaron(
                    Trazable.generarCodigo("CAM"),
                    nombre,
                    cantidadCamarones,
                    etapaCrecimiento
            );

            case INSUMO_ACUICOLA -> new InsumoAcuicola(
                    Trazable.generarCodigo("INS"),
                    nombre,
                    unidadMedida,
                    precioUnitario,
                    stock
            );
        };
    }
}
