import java.util.UUID;

public class Veterinario{
    
    private UUID idVeterinario;
    private String nome;

    public Veterinario(String nome) {
        this.idVeterinario = UUID.randomUUID();
        this.nome = nome;
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