
package ec.uagraria.costos;

import java.util.List;

public record Lote(String codigo, Cultivo cultivo, double hectareas,
                   List<Insumo> insumos) {

    public Lote {
        insumos = List.copyOf(insumos);
    }

    // Calcular el costo de todos los insumos
    public double costoInsumos() {
        double total = 0.0;

        for (Insumo i : insumos) {
            total += i.costo();
        }

        return total;
    }

    // Calcular los jornales según el cultivo
    public int jornalesPorHectarea() {
        return switch (cultivo) {
            case Banano b -> 18;
            case Cacao c when c.organico() -> 25;
            case Cacao c -> 20;
            case Arroz a -> 12 * a.ciclosPorAnio();
        };
    }
}
