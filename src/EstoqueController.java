import java.util.UUID;
import java.util.ArrayList;


/**
 * Classe responsável por controlar as operações de um estoque de cachorros.
 */
public class EstoqueController {

    private Estoque estoque;

    EstoqueController(){
        this.estoque = new Estoque();
    }

    /**
     * Adiciona um cachorro ao estoque.
     *
     * @param cachorro O cachorro a ser adicionado.
     */
    public void addCachorro(Cachorro cachorro){
        System.out.println("Adicionando cachorro ao sistema: " + cachorro.getRaca() + " --> " + cachorro.getNome());
        this.estoque.adicionarCachorro(cachorro);
    }

    /**
     * Remove um cachorro do estoque pelo UUID.
     *
     * @param cachorroID O UUID do cachorro a ser removido.
     * @return O cachorro removido ou null se não encontrado.
     */
    public Cachorro removeCachorroByUUID(UUID cachorroID){
        Cachorro cachorroRemovido = this.estoque.removerCachorroByUUID(cachorroID);
        return cachorroRemovido;
    }

    /**
     * Retorna uma lista de cachorros com base em uma lista de UUIDs.
     *
     * @param listaUUID A lista de UUIDs dos cachorros.
     * @return A lista de cachorros correspondentes aos UUIDs.
     */
    public ArrayList<Cachorro> getCachorrosByUUIDs(ArrayList<UUID> listaUUID){
        return this.estoque.getCachorrosByUUIDs(listaUUID);
    }

    /**
     * Verifica se um cachorro está disponível para compra.
     *
     * @param cachorro O cachorro a ser verificado.
     * @return true se o cachorro estiver disponível, false caso contrário.
     */
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

    /**
     * Exibe os cachorros disponíveis no estoque.
     */
    public void mostrarCachorrosDisponiveis(){
        System.out.println("***************EXIBINDO CACHORROS DISPONÍVEIS*****************");
        this.estoque.mostrarCachorrosDisponiveis();
        System.out.println("***************************************************************\n");
    }

    /**
     * Retorna o estoque associado ao controlador.
     *
     * @return O estoque.
     */
    public Estoque getEstoque() {
        return this.estoque;
    }

    /**
     * Define o estoque associado ao controlador.
     *
     * @param estoque O estoque a ser definido.
     */
    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

}