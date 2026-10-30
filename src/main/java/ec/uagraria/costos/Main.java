package ec.uagraria.costos;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Lote lote = new Lote(
                "L-01",
                new Banano("Cavendish"),
                4.0,
                List.of(
                        new Insumo("Urea 50 kg", 12, "saco", 32.50),
                        new Insumo("Fungicida", 8, "litro", 21.75),
                        new Insumo("Semilla certificada", 1, "lote", 180.00)
                )
        );

        CalculadoraCostos calc = new CalculadoraCostos();

        System.out.println("Sin estrategia: " + calc.calcular(lote));

        calc.setEstrategia(Estrategias.costoDirecto());
        System.out.println("Costo directo: USD " +
                CalculadoraCostos.redondear(calc.calcular(lote).orElseThrow()));

        calc.setEstrategia(Estrategias.costoConManoDeObra());
        System.out.println("Con mano de obra: USD " +
                CalculadoraCostos.redondear(calc.calcular(lote).orElseThrow()));

        calc.setEstrategia(Estrategias.costoPorHectarea());
        System.out.println("Costo por hectarea: USD " +
                CalculadoraCostos.redondear(calc.calcular(lote).orElseThrow()));

        calc.setEstrategia(Estrategias.costoConSubsidioFertilizante(0.20));
        System.out.println("Con subsidio del 20%: USD " +
                CalculadoraCostos.redondear(calc.calcular(lote).orElseThrow()));

        calc.setEstrategia(Estrategias.conIva(Estrategias.costoConManoDeObra()));
        System.out.println("Con IVA del 15%: USD " +
                CalculadoraCostos.redondear(calc.calcular(lote).orElseThrow()));

        Lote cacao = new Lote(
                "L-02",
                new Cacao("CCN-51", true),
                2.5,
                List.of(
                        new Insumo("Urea 50 kg", 5, "saco", 32.50),
                        new Insumo("Abono organico", 30, "saco", 9.80)
                )
        );

        calc.setEstrategia(Estrategias.costoConManoDeObra());

        System.out.println("Cacao organico - jornales por hectarea: " +
                cacao.jornalesPorHectarea());

        System.out.println("Cacao organico - costo total: USD " +
                CalculadoraCostos.redondear(calc.calcular(cacao).orElseThrow()));
    }
}
