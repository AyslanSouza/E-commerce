import java.util.ArrayList;
import java.time.LocalDate;
import java.util.UUID;

// Classe responsável por representar um cachorro, incluindo suas informações e histórico médico.
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

    // Exibe os exames realizados no cachorro.
    public void mostarExames(){
        System.out.println("\nExibindo exames para o cachorro: " + this.getRaca() + " --> " + this.getNome() + "\n");
        this.exames.exibirExames();
    }

    // Getter para os exames realizados no cachorro.
    public FichaExame getExames() {
        return this.exames;
    }

    // Setter para os exames realizados no cachorro.
    public void setExames(FichaExame exames) {
        this.exames = exames;
    }

    // Verifica se o cachorro possui pedigree. 
    //(Nesse caso tratado como booleano considerando de maneira simplificada se ele é de raça pura ou não)
    public Boolean isPedigree() {
        return this.pedigree;
    }

    // Setter para o pedigree do cachorro.
    public void setPedigree(Boolean pedigree) {
        this.pedigree = pedigree;
    }

    // Getter para o dono do cachorro.
    public String getDono() {
        return this.dono;
    }

    // Setter para o dono do cachorro.
    public void setDono(String dono) {
        this.dono = dono;
    }

    // Setter para a lista de tratamentos do cachorro.
    public void setTratamento(ArrayList<Tratamento> tratamento) {
        this.tratamento = tratamento;
    }

     // Getter para a lista de veterinários associados ao cachorro.
    public ArrayList<Veterinario> getVeterinarios() {
        return this.veterinarios;
    }

    // Setter para a lista de veterinários associados ao cachorro.
    public void setVeterinarios(ArrayList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    // Adiciona um veterinário à lista de veterinários associados ao cachorro.
    public void addVeterinario(Veterinario veterinario){
        this.veterinarios.add(veterinario);
    }

    // Remove um veterinário da lista de veterinários associados ao cachorro, utilizando o ID do veterinário.
    public Veterinario removeVeterinario(UUID idVeterinario){
        for (Veterinario veterinario : this.veterinarios){
            if (veterinario.getIdVeterinario() == idVeterinario){
                this.veterinarios.remove(veterinario);
                return veterinario;
            }
        }
        return null;
    }

    // Getter para a prescrição de alimentação do cachorro.
    public PrescricaoAlimentacao getAlimentacao() {
        return this.alimentacao;
    }

    // Setter para a prescrição de alimentação do cachorro.
    public void setAlimentacao(PrescricaoAlimentacao alimentacao) {
        this.alimentacao = alimentacao;
    }

    // Verifica se o cachorro está reservado.
    public Boolean isReservado() {
        return this.isReserved;
    }

    // Getter para verificar se o cachorro está reservado.
    public Boolean getIsReserved() {
        return this.isReserved;
    }

    // Setter para marcar o cachorro como reservado ou não.
    public void setIsReserved(Boolean isReserved) {
        this.isReserved = isReserved;
    }

    // Getter para o ID do cachorro.
    public UUID getIdCachorro() {
        return this.idCachorro;
    }

    // Setter para o ID do cachorro.
    public void setIdCachorro(UUID idCachorro) {
        this.idCachorro = idCachorro;
    }

    // Getter para o número do chip do cachorro.
    public String getNChip() {
        return this.nChip;
    }

    // Setter para o número do chip do cachorro.
    public void setNChip(String nChip) {
        this.nChip = nChip;
    }

    // Getter para o nome do cachorro.
    public String getNome() {
        return this.nome;
    }

    // Setter para o nome do cachorro.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o ID do pai do cachorro.
    public String getIdPai() {
        return this.idPai;
    }

    // Setter para o ID do pai do cachorro.
    public void setIdPai(String idPai) {
        this.idPai = idPai;
    }

    // Getter para o ID da mãe do cachorro.
    public String getIdMae() {
        return this.idMae;
    }

    // Setter para o ID da mãe do cachorro.
    public void setIdMae(String idMae) {
        this.idMae = idMae;
    }

    // Getter para a data de nascimento do cachorro.
    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    // Setter para a data de nascimento do cachorro.
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Getter para a raça do cachorro.
    public String getRaca() {
        return this.raca;
    }

    // Setter para a raça do cachorro.
    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Getter para o peso do cachorro.
    public int getPeso() {
        return this.peso;
    }

    // Setter para o peso do cachorro.
    public void setPeso(int peso) {
        this.peso = peso;
    }

    // Verifica se o cachorro está esterilizado.
    public Boolean isEsterilizado() {
        return this.esterilizado;
    }

    // Setter para marcar o cachorro como esterilizado ou não.
    public void setEsterilizado(Boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    // Getter para a lista de tratamentos do cachorro.
    public ArrayList<Tratamento> getTratamento() {
        return this.tratamento;
    }

    // Adiciona um tratamento à lista de tratamentos do cachorro.
    public void addTratamento(Tratamento tratamento) {
        this.tratamento.add(tratamento);
    }

    // Getter para a carteira de vacinação do cachorro.s
    public CarteiraVacinacao getCarteiraVacinacao() {
        return this.carteiraVacinacao;
    }

    // Setter para a carteira de vacinação do cachorro.
    public void setCarteiraVacinacao(CarteiraVacinacao carteiraVacinacao) {
        this.carteiraVacinacao = carteiraVacinacao;
    }

    
    // Getter para o preço do cachorro. 
    public float getPreco() {
        return this.preco;
    }

    // Setter para o preço do cachorro.
    public void setPreco(float preco) {
        this.preco = preco;
    }

    // Getter para verificar se o cachorro está reservado.
    public Boolean isIsReserved() {
        return this.isReserved;
    }

    // Getter para o usuário que reservou o cachorro.
    public Usuario getReservedBy() {
        return this.reservedBy;
    }

    
    // Setter para o usuário que reservou o cachorro.
    public void setReservedBy(Usuario reservedBy) {
        this.reservedBy = reservedBy;
    }
    
}
