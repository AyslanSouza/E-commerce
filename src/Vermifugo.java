public class Vermifugo {
    private String nome;
    private String marca;
    private String principioAtivo;
    private String dosagem;

    public Vermifugo(String nome, String marca, String principioAtivo, String dosagem) {
        this.nome = nome;
        this.marca = marca;
        this.principioAtivo = principioAtivo;
        this.dosagem = dosagem;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrincipioAtivo() {
        return this.principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public String getDosagem() {
        return this.dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }
}


