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

    public  void exibirPrescricaoAlimentacao() {
        System.out.println("Prescrição de Alimentação:");
        System.out.println("Tipo de ração: " + this.getTipoRacao());
        System.out.printf("Quantidade diária: %.2f gramas%n", this.getQuantidadeDiaria());
        System.out.println("Número de refeições: " + this.getNumeroRefeicoes());
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

}