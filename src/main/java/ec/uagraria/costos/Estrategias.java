package ec.uagraria.costos;

public final class Estrategias {

    public static final double VALOR_JORNAL = 18.50;
    public static final double IVA = 0.15;

    private Estrategias() {
    }

    // Estrategia 1: costo directo
    public static EstrategiaCosto costoDirecto() {
        return lote -> lote.costoInsumos();
    }

    // Estrategia 2: costo con mano de obra
    public static EstrategiaCosto costoConManoDeObra() {
        return lote -> lote.costoInsumos()
                + lote.jornalesPorHectarea() * lote.hectareas() * VALOR_JORNAL;
    }

    // Estrategia 3: costo por hectárea
    public static EstrategiaCosto costoPorHectarea() {
        return lote -> costoConManoDeObra().calcular(lote) / lote.hectareas();
    }

    // Estrategia 4: costo con subsidio al fertilizante
    public static EstrategiaCosto costoConSubsidioFertilizante(double porcentaje) {
        return lote -> {
            double descuento = lote.insumos().stream()
                    .filter(i -> i.nombre().toLowerCase().contains("urea"))
                    .mapToDouble(Insumo::costo)
                    .sum() * porcentaje;

            return costoConManoDeObra().calcular(lote) - descuento;
        };
    }

    // Estrategia 5: costo con IVA
    public static EstrategiaCosto conIva(EstrategiaCosto base) {
        return lote -> base.calcular(lote) * (1 + IVA);
    }
}
