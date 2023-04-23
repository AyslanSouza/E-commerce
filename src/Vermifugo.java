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
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public String getDosagem() {
        return dosagem;
    }

    @Override
    public String toString() {
        return "Vermifugo{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", principioAtivo='" + principioAtivo + '\'' +
                ", dosagem='" + dosagem + '\'' +
                '}';
    }
}


