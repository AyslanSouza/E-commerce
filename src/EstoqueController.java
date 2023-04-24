import java.util.UUID;
import java.util.ArrayList;

public class EstoqueController {

    private Estoque estoque;

    EstoqueController(){
        this.estoque = new Estoque();
    }

    public void addCachorro(Cachorro cachorro){
        System.out.println("Adicionando cachorro ao sistema: " + cachorro.getRaca() + " --> " + cachorro.getNome());
        this.estoque.adicionarCachorro(cachorro);
    }

    public Cachorro removeCachorroByUUID(UUID cachorroID){
        Cachorro cachorroRemovido = this.estoque.removerCachorroByUUID(cachorroID);
        return cachorroRemovido;
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
                if (cachorro.getReservedBy().reservaExpirou(cachorro)){
                    cachorro.getReservedBy().getReservas().remove(cachorro);
                    cachorro.setIsReserved(false);
                    return true;
                } else return false;
            }else return true;
        }
    }

    public void mostrarCachorrosDisponiveis(){
        System.out.println("***************EXIBINDO CACHORROS DISPONÍVEIS*****************");
        this.estoque.mostrarCachorrosDisponiveis();
        System.out.println("***************************************************************\n");
    }

    public Estoque getEstoque() {
        return this.estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

}