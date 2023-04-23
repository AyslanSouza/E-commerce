import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.UUID;

public class Cachorro {

    private UUID idCachorro;
    private String nChip;
    private Boolean pedigree;
    private String nome;
    private String idPai;
    private String idMae;
    private String dono;
    private LocalDateTime dataNascimento;
    private String raca;
    private int peso;
    private Boolean esterilizado;
    private CarteiraVacinacao carteiraVacinacao;
    private ArrayList<Tratamento> tratamento;
    private ArrayList<Veterinario> veterinarios;
    private PrescricaoAlimentacao alimentacao;

    public Cachorro(String idCachorro, String nChip, Boolean pedigree, String nome, String idPai, String idMae, LocalDateTime dataNascimento, String raca, Boolean esterilizado, ArrayList<String> medicacao, CarteiraVacinacao carteiraVacinacao, int peso) {
        this.idCachorro = UUID.randomUUID();
        this.nChip = nChip;
        this.pedigree = pedigree;
        this.nome = nome;
        this.idPai = idPai;
        this.idMae = idMae;
        this.dataNascimento = dataNascimento;
        this.raca = raca;
        this.esterilizado = esterilizado;
        this.carteiraVacinacao = carteiraVacinacao;
        this.tratamento = new ArrayList<Tratamento>();
        this.peso = peso;
    }

    public UUID getIdCachorro() {
        return this.idCachorro;
    }

    public void setIdCachorro(UUID idCachorro) {
        this.idCachorro = idCachorro;
    }

    public String getNChip() {
        return this.nChip;
    }

    public void setNChip(String nChip) {
        this.nChip = nChip;
    }

    public String getPedigree() {
        return this.pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdPai() {
        return this.idPai;
    }

    public void setIdPai(String idPai) {
        this.idPai = idPai;
    }

    public String getIdMae() {
        return this.idMae;
    }

    public void setIdMae(String idMae) {
        this.idMae = idMae;
    }

    public LocalDateTime getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Boolean isEsterilizado() {
        return this.esterilizado;
    }

    public Boolean getEsterilizado() {
        return this.esterilizado;
    }

    public void setEsterilizado(Boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    public ArrayList<Tratamento> getTratamento() {
        return this.tratamento;
    }

    public void setTratamento(ArrayList<Tratamento> tratamentos) {
        this.tratamento = tratamentos;
    }

    public CarteiraVacinacao getCarteiraVacinacao() {
        return this.carteiraVacinacao;
    }

    public void setCarteiraVacinacao(CarteiraVacinacao carteiraVacinacao) {
        this.carteiraVacinacao = carteiraVacinacao;
    }
    
}
