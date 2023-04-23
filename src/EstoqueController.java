import java.util.UUID;

public class EstoqueController {

    private Estoque estoque;

    public void addCachorro(Cachorro cachorro){
        this.estoque.adicionarCachorro(cachorro);
    }

    public void removeCachorroByUUID(UUID cachorroID){
        this.estoque.removerCachorroByUUID(cachorroID);
    }

    public Boolean isAvailablePurchase(Cachorro cachorro, int quantity){
        if ((this.estoque.getCachorroByUUID(cachorro.getIdCachorro()) == null) || 
            (this.estoque.getQuantidade(cachorro.getRaca()) >= quantity) || 
            (cachorro.isReservado())){
            return false;
        }
        else{
            return true;
        }
    }
}
