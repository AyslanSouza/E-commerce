import java.util.ArrayList;
import java.time.LocalDate;
import java.util.UUID;

public class Cachorro {

    private UUID idCachorro;
    private String nChip;
    private Boolean pedigree;
    private String nome;
    private String idPai;
    private String idMae;
    private String dono;
    private LocalDate dataNascimento;
    private String raca;
    private int peso;
    private Boolean esterilizado;
    private CarteiraVacinacao carteiraVacinacao;
    private ArrayList<Tratamento> tratamento;
    private ArrayList<Veterinario> veterinarios;
    private PrescricaoAlimentacao alimentacao;
    private Boolean isReserved;

    public Cachorro(String nChip, Boolean pedigree, String nome, String idPai, String idMae, LocalDate dataNascimento, String raca, 
                    Boolean esterilizado, CarteiraVacinacao carteiraVacinacao, int peso) {
                        
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
        this.isReserved = false;
        this.dono = null;
    }

    public Boolean isPedigree() {
        return this.pedigree;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    public void setTratamento(ArrayList<Tratamento> tratamento) {
        this.tratamento = tratamento;
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return this.veterinarios;
    }

    public void setVeterinarios(ArrayList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    public PrescricaoAlimentacao getAlimentacao() {
        return this.alimentacao;
    }

    public void setAlimentacao(PrescricaoAlimentacao alimentacao) {
        this.alimentacao = alimentacao;
    }

    public Boolean isReservado() {
        return this.isReserved;
    }

    public Boolean getIsReserved() {
        return this.isReserved;
    }

    public void setIsReserved(Boolean isReserved) {
        this.isReserved = isReserved;
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

    public Boolean getPedigree() {
        return this.pedigree;
    }

    public void setPedigree(Boolean pedigree) {
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

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
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

    public void addTratamento(Tratamento tratamento) {
        this.tratamento.add(tratamento);
    }

    public CarteiraVacinacao getCarteiraVacinacao() {
        return this.carteiraVacinacao;
    }

    public void setCarteiraVacinacao(CarteiraVacinacao carteiraVacinacao) {
        this.carteiraVacinacao = carteiraVacinacao;
    }
    
}
