package ec.edu.uagraria.aquasense.fabrica;

import ec.edu.uagraria.aquasense.dominio.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Pruebas unitarias para la fábrica de productos.
class FabricaProductosTest {

    @Test
    void debeCrearBiomasaPiscina() {
        Trazable producto = FabricaProductos.crear(
                TipoProducto.BIOMASA_PISCINA,
                "Piscina 1",
                1000,
                5,
                20,
                28,
                "",
                0,
                0,
                0,
                ""
        );

        assertInstanceOf(BiomasaPiscina.class, producto);
        assertNotNull(producto.codigo());
        assertTrue(producto.codigo().startsWith("BIO-"));
    }

    @Test
    void debeCrearLoteCamaron() {
        Trazable producto = FabricaProductos.crear(
                TipoProducto.LOTE_CAMARON,
                "Lote 1",
                0,
                0,
                0,
                0,
                "",
                0,
                0,
                5000,
                "Engorde"
        );

        assertInstanceOf(LoteCamaron.class, producto);
        assertNotNull(producto.codigo());
        assertTrue(producto.codigo().startsWith("CAM-"));
    }

    @Test
    void debeCrearInsumoAcuicola() {
        Trazable producto = FabricaProductos.crear(
                TipoProducto.INSUMO_ACUICOLA,
                "Alimento balanceado",
                0,
                0,
                0,
                0,
                "Kilogramos",
                2.50,
                100,
                0,
                ""
        );

        assertInstanceOf(InsumoAcuicola.class, producto);
        assertNotNull(producto.codigo());
        assertTrue(producto.codigo().startsWith("INS-"));
    }
}
