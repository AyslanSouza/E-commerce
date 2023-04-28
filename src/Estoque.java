import java.util.ArrayList;
import java.util.UUID;
import java.util.HashMap;
import java.util.Map;

public class Estoque {

    // Mapa de ArrayLists de Cachorro agrupados por raça
    private Map<String, ArrayList<Cachorro>> cachorros;

    public Estoque(){
        cachorros = new HashMap<>();
    }

    /**
     * Adiciona um cachorro ao estoque.
     *
     * @param cachorro O cachorro a ser adicionado.
     */
    public void adicionarCachorro(Cachorro cachorro) {
        String raca = cachorro.getRaca();
        cachorros.putIfAbsent(raca, new ArrayList<>());
        cachorros.get(raca).add(cachorro);
    }

    /**
     * Remove um cachorro do estoque pela raça.
     *
     * @param raca A raça do cachorro a ser removido.
     * @return O cachorro removido ou null se não houver cachorros dessa raça.
     */
    public Cachorro removerCachorro(String raca) {
        ArrayList<Cachorro> listaCachorros = cachorros.get(raca);
        if (listaCachorros != null && !listaCachorros.isEmpty()) {
            Cachorro cachorro = listaCachorros.get(0);
            listaCachorros.remove(0);
            return cachorro;
        }
        return null;
    }

    /**
     * Remove um cachorro do estoque pelo UUID.
     *
     * @param cachorroUUID O UUID do cachorro a ser removido.
     * @return O cachorro removido ou null se não for encontrado.
     */
    public Cachorro removerCachorroByUUID(UUID cachorroUUID) {
        for (ArrayList<Cachorro> listaCachorros : cachorros.values()) {
            for (int i = 0; i < listaCachorros.size(); i++) {
                Cachorro cachorro = listaCachorros.get(i);
                if (cachorro.getIdCachorro().equals(cachorroUUID)) {
                    listaCachorros.remove(i);
                    return cachorro;
                }
            }
        }
        return null;
    }

    /**
     * Retorna um cachorro pelo UUID.
     *
     * @param cachorroUUID O UUID do cachorro a ser buscado.
     * @return O cachorro encontrado ou null se não for encontrado.
     */
    public Cachorro getCachorroByUUID(UUID cachorroUUID) {
        for (ArrayList<Cachorro> listaCachorros : cachorros.values()) {
            for (int i = 0; i < listaCachorros.size(); i++) {
                Cachorro cachorro = listaCachorros.get(i);
                if (cachorro.getIdCachorro().equals(cachorroUUID)) {
                    return cachorro;
                }
            }
        }
        return null;
    }

    /**
     * Retorna uma lista de cachorros pelos UUIDs.
     *
     * @param listaCachorros A lista de UUIDs dos cachorros a serem buscados.
     * @return Uma lista de cachorros encontrados.
     */
    public ArrayList<Cachorro> getCachorrosByUUIDs(ArrayList<UUID> listaCachorros) {
        ArrayList<Cachorro> selectedCachorros = new ArrayList<>();

        for (UUID id : listaCachorros) {
            for (ArrayList<Cachorro> cachorros : this.cachorros.values()) {
                for (Cachorro cachorro : cachorros) {
                    if (cachorro.getIdCachorro() == id) {
                        selectedCachorros.add(cachorro);
                    }
                }
            }
        }
        return selectedCachorros;
    }

    /**
     * Retorna a quantidade de cachorros de uma determinada raça.
     *
     * @param raca A raça dos cachorros a serem contados.
     * @return A quantidade de cachorros da raça.
     */
    public int getQuantidade(String raca) {
        ArrayList<Cachorro> listaCachorros = this.cachorros.get(raca);
        return listaCachorros != null ? listaCachorros.size() : 0;
    }

    /**
     * Retorna uma lista de cachorros por raça.
     *
     * @param raca A raça dos cachorros a serem buscados.
     * @return Uma lista de cachorros da raça.
     */
    public ArrayList<Cachorro> getCachorrosPorRaca(String raca) {
        return this.cachorros.getOrDefault(raca, new ArrayList<>());
    }

    /**
     * Exibe os cachorros disponíveis no estoque.
     */
    public void mostrarCachorrosDisponiveis() {
        for (ArrayList<Cachorro> listaCachorros : this.cachorros.values()) {
            for (Cachorro cachorro : listaCachorros) {
                if (!cachorro.isIsReserved()){
                    System.out.println("Raça: " + cachorro.getRaca() + " Nome: " + cachorro.getNome());
                }
            }
        }
    }

    /**
     * Retorna o mapa de cachorros do estoque.
     *
     * @return O mapa de cachorros.
     */
    public Map<String,ArrayList<Cachorro>> getCachorros() {
        return this.cachorros;
    }

    /**
     * Define o mapa de cachorros do estoque.
     *
     * @param cachorros O mapa de cachorros a ser definido.
     */
    public void setCachorros(Map<String,ArrayList<Cachorro>> cachorros) {
        this.cachorros = cachorros;
    }
    
}
