import java.util.ArrayList;
import java.util.UUID;

public class EstoqueController {

    private Estoque estoque;

    public void addCachorro(Cachorro cachorro){
        this.estoque.addCachorro(cachorro);
    }

    public void removeCachorroByUUID(UUID cachorroID){
        this.estoque.removeCachorro(cachorroID);
    }

    public Boolean isAvailablePurchase(UUID cachorroID){
        if (this.estoque.getCachorroByUUID(cachorroID) != null){

        }
    }
}
