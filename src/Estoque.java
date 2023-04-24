import java.util.ArrayList;
import java.util.UUID;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private Map<String, ArrayList<Cachorro>> cachorros;

    public Estoque(){
        cachorros = new HashMap<>();
    }

    public void adicionarCachorro(Cachorro cachorro) {
        String raca = cachorro.getRaca();
        cachorros.putIfAbsent(raca, new ArrayList<>());
        cachorros.get(raca).add(cachorro);
    }

    public Cachorro removerCachorro(String raca) {
        ArrayList<Cachorro> listaCachorros = cachorros.get(raca);
        if (listaCachorros != null && !listaCachorros.isEmpty()) {
            Cachorro cachorro = listaCachorros.get(0);
            listaCachorros.remove(0);
            return cachorro;
        }
        return null;
    }

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

    public ArrayList<Cachorro> getCachorrosByUUIDs(ArrayList<UUID> listaCachorros) {
        ArrayList<Cachorro> selectedCachorros = new ArrayList<>();

        for (UUID id : listaCachorros) {
            for (ArrayList<Cachorro> cachorros : this.cachorros.values()) {
                for (Cachorro cachorro : cachorros) {
                    if (cachorro.getIdCachorro().equals(id)) {
                        selectedCachorros.add(cachorro);
                    }
                }
            }
        }
        return selectedCachorros;
    }

    public int getQuantidade(String raca) {
        ArrayList<Cachorro> listaCachorros = this.cachorros.get(raca);
        return listaCachorros != null ? listaCachorros.size() : 0;
    }

    public ArrayList<Cachorro> getCachorrosPorRaca(String raca) {
        return this.cachorros.getOrDefault(raca, new ArrayList<>());
    }

    public void mostrarCachorrosDisponiveis() {
        for (ArrayList<Cachorro> listaCachorros : this.cachorros.values()) {
            for (Cachorro cachorro : listaCachorros) {
                System.out.println("Raça: " + cachorro.getRaca());
            }
        }
    }
    
}
