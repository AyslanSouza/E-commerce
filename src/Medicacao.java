public class Medicacao{
    
    private String nome;
    private String tipo;
    private String posologia;
    private String composicao;

    public Medicacao(String nome, String tipo, String posologia, String composicao) {
        this.nome = nome;
        this.tipo = tipo;
        this.posologia = posologia;
        this.composicao = composicao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPosologia() {
        return this.posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public String getComposicao() {
        return this.composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }
}