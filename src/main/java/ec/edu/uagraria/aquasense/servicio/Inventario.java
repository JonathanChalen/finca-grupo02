package ec.edu.uagraria.aquasense.servicio;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

// Administra los registros y el despacho del inventario.
public class Inventario {

    // Lista que almacena los registros.
    private final List<ItemInventario> registros = new ArrayList<>();

    // Cola que organiza los elementos pendientes de despacho.
    private final Deque<ItemInventario> colaDespacho = new ArrayDeque<>();

    // Registra un nuevo elemento en el inventario.
    public void registrar(ItemInventario item) {
        registros.add(item);
    }

    // Obtiene los códigos únicos y los ordena.
    public Set<String> codigosUnicos() {
        Set<String> codigos = new TreeSet<>();

        for (ItemInventario item : registros) {
            codigos.add(item.codigo());
        }

        return codigos;
    }

    // Calcula la cantidad total agrupada por tipo.
    public Map<String, Double> totalPorTipo() {
        Map<String, Double> totales = new TreeMap<>();

        for (ItemInventario item : registros) {
            totales.merge(item.tipo(), item.cantidad(), Double::sum);
        }

        return totales;
    }

    // Ordena los registros de mayor a menor cantidad.
    public List<ItemInventario> ordenadosPorCantidad() {
        List<ItemInventario> copia = new ArrayList<>(registros);

        copia.sort(
                Comparator.comparingDouble(ItemInventario::cantidad)
                        .reversed()
                        .thenComparing(ItemInventario::codigo)
        );

        return copia;
    }

    // Agrega un elemento al final de la cola de despacho.
    public void encolarDespacho(ItemInventario item) {
        colaDespacho.offerLast(item);
    }

    // Retira y devuelve el siguiente elemento pendiente.
    public Optional<ItemInventario> despacharSiguiente() {
        return Optional.ofNullable(colaDespacho.pollFirst());
    }

    // Consulta cuántos elementos están pendientes.
    public int pendientesDespacho() {
        return colaDespacho.size();
    }

    // Devuelve una copia de los registros.
    public List<ItemInventario> registros() {
        return List.copyOf(registros);
    }
}