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
    private FichaExame exames;
    private PrescricaoAlimentacao alimentacao;
    private Boolean isReserved;
    private Usuario reservedBy;
    private float preco;

    public Cachorro(String nChip, Boolean pedigree, String nome, String idPai, String idMae, LocalDate dataNascimento, 
                    String raca, int peso, Boolean esterilizado, CarteiraVacinacao carteiraVacinacao, 
                    ArrayList<Veterinario> veterinarios, FichaExame exames, PrescricaoAlimentacao alimentacao, float preco){
        this.idCachorro = UUID.randomUUID();
        this.nChip = nChip;
        this.pedigree = pedigree;
        this.nome = nome;
        this.idPai = idPai;
        this.idMae = idMae;
        this.dono = null;
        this.dataNascimento = dataNascimento;
        this.raca = raca;
        this.peso = peso;
        this.esterilizado = esterilizado;
        this.carteiraVacinacao = carteiraVacinacao;
        this.tratamento = new ArrayList<Tratamento>();
        this.veterinarios = veterinarios;
        this.exames = exames;
        this.alimentacao = alimentacao;
        this.isReserved = false;
        this.reservedBy = null;
        this.preco = preco;
    }

    public void mostarExames(){
        System.out.println("\nExibindo exames para o cachorro: " + this.getRaca() + " --> " + this.getNome() + "\n");
        this.exames.exibirExames();
    }

    public FichaExame getExames() {
        return this.exames;
    }

    public void setExames(FichaExame exames) {
        this.exames = exames;
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

    public void addVeterinario(Veterinario veterinario){
        this.veterinarios.add(veterinario);
    }

    public Veterinario removeVeterinario(UUID idVeterinario){
        for (Veterinario veterinario : this.veterinarios){
            if (veterinario.getIdVeterinario() == idVeterinario){
                this.veterinarios.remove(veterinario);
                return veterinario;
            }
        }
        return null;
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

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Boolean isIsReserved() {
        return this.isReserved;
    }

    public Usuario getReservedBy() {
        return this.reservedBy;
    }

    public void setReservedBy(Usuario reservedBy) {
        this.reservedBy = reservedBy;
    }
    
}
