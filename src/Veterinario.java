import java.util.UUID;

public class Veterinario{
    
    private String nome;
    private UUID idVeterinario;

    public Veterinario(String nome, UUID idVeterinario) {
        this.nome = nome;
        this.idVeterinario = idVeterinario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getIdVeterinario() {
        return this.idVeterinario;
    }

    public void setIdVeterinario(UUID idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

}