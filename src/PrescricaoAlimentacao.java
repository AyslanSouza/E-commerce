public class PrescricaoAlimentacao
{
    private String tipoRacao;
    private double quantidadeDiaria;
    private int numeroRefeicoes;

    public PrescricaoAlimentacao(String tipoRacao, double quantidadeDiaria, int numeroRefeicoes) {
        this.tipoRacao = tipoRacao;
        this.quantidadeDiaria = quantidadeDiaria;
        this.numeroRefeicoes = numeroRefeicoes;
    }

    public String getTipoRacao() {
        return this.tipoRacao;
    }

    public void setTipoRacao(String tipoRacao) {
        this.tipoRacao = tipoRacao;
    }

    public double getQuantidadeDiaria() {
        return this.quantidadeDiaria;
    }

    public void setQuantidadeDiaria(double quantidadeDiaria) {
        this.quantidadeDiaria = quantidadeDiaria;
    }

    public int getNumeroRefeicoes() {
        return this.numeroRefeicoes;
    }

    public void setNumeroRefeicoes(int numeroRefeicoes) {
        this.numeroRefeicoes = numeroRefeicoes;
    }

    @Override
    public String toString() {
        return "PrescricaoAlimentacao{" +
                ", tipoRacao='" + tipoRacao + '\'' +
                ", quantidadeDiaria=" + quantidadeDiaria +
                ", numeroRefeicoes=" + numeroRefeicoes +
                '}';
    }
}