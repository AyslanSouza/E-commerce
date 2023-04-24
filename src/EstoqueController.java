import java.util.UUID;
import java.util.ArrayList;

public class EstoqueController {

    private Estoque estoque;

    EstoqueController(){
        this.estoque = new Estoque();
    }

    public void addCachorro(Cachorro cachorro){
        this.estoque.adicionarCachorro(cachorro);
    }

    public void removeCachorroByUUID(UUID cachorroID){
        this.estoque.removerCachorroByUUID(cachorroID);
    }

    public ArrayList<Cachorro> getCachorrosByUUIDs(ArrayList<UUID> listaUUID){
        return this.estoque.getCachorrosByUUIDs(listaUUID);
    }

    public Boolean isAvailablePurchase(Cachorro cachorro){
        if (this.estoque.getCachorroByUUID(cachorro.getIdCachorro()).equals(null)){
            return false;
        }
        else{
            if (cachorro.getReservedBy() != null){
                if (!cachorro.getReservedBy().reservaExpirou(cachorro)){
                    cachorro.getReservedBy().getReservations().remove(cachorro);
                    cachorro.setIsReserved(false);
                    return true;
                }else return false;
            }else return true;
        }
    }
}