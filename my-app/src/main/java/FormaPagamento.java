import java.time.LocalDate;

public class FormaPagamento {
    
    private String nomeTitular;
    private double NSU;
    private LocalDate dataVencimento;
    private double CVV;

    public FormaPagamento(String nomeTitular, double NSU, LocalDate dataVencimento, double CVV) {
        this.nomeTitular = nomeTitular;
        this.NSU = NSU;
        this.dataVencimento = dataVencimento;
        this.CVV = CVV;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getNSU() {
        return this.NSU;
    }

    public void setNSU(double NSU) {
        this.NSU = NSU;
    }

    public LocalDate getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getCVV() {
        return this.CVV;
    }

    public void setCVV(double CVV) {
        this.CVV = CVV;
    }

}
