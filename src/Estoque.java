import java.util.ArrayList;
import java.util.UUID;

public class Estoque {
    //Lista de cachorros cadastrados no sistema
    private ArrayList<Cachorro> cachorrosCadastrados;

    public Estoque(){
        cachorrosCadastrados = new ArrayList<Cachorro>();
    }

    public ArrayList<Cachorro> getCachorrosCadastrados() {
        return this.cachorrosCadastrados;
    }

    public void setCachorrosCadastrados(ArrayList<Cachorro> cachorrosCadastrados) {
        this.cachorrosCadastrados = cachorrosCadastrados;
    }

    public void addCachorro(Cachorro cachorro) {
        this.cachorrosCadastrados.add(cachorro);
    }
    
    public void removeCachorro(UUID cachorroUUID) {
        for (Cachorro cachorro : this.cachorrosCadastrados){
            if (cachorro.getIdCachorro() == cachorroUUID){
                this.cachorrosCadastrados.remove(cachorro);
            }
        }
    }

    public void showCachorros(){
        for (Cachorro cachorro : this.cachorrosCadastrados){
            String registroCachorro = String.format("Nome: %s ID: %s", cachorro.getNome(), cachorro.getIdCachorro());
            System.out.println(registroCachorro);
        }
    }

    public String getCachorroByUUID(UUID cachorroUUID){
        for (Cachorro cachorro : this.cachorrosCadastrados){
            if (cachorro.getIdCachorro() == cachorroUUID) {
                return cachorro.getNome();
            }
        }
        return null; 
    }

    
}
