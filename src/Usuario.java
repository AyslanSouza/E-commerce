import java.util.Date;
import java.util.UUID;

public class Usuario {

    private UUID idUsuario;
    private String nome;
    private Date nascimento;
    private String endereco;

    public Usuario(UUID idUsuario, String nome, Date nascimento, String endereco) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereco = endereco;
    }

    public UUID getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void comprarCachorro(Cachorro cachorro, EstoqueController estoqueController){
        if (estoqueController.isAvailablePurchase(cachorro.getIdCachorro())){

        }
    }

    public void reservarCachorro(Cachorro cachorro){

    }

}
