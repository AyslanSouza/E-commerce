import java.util.Date;

public class ExameLaudosDisplasias {
    
    private Date dataExame;
    private String tipoDisplasia;
    private String grauDisplasia;
    private String observacoes;
    
    public ExameLaudosDisplasias(Date dataExame, String tipoDisplasia, String grauDisplasia, String observacoes) {
       
        this.dataExame = dataExame;
        this.tipoDisplasia = tipoDisplasia;
        this.grauDisplasia = grauDisplasia;
        this.observacoes = observacoes;
    }

    public void exibirFichaExame() {
        System.out.println("=================FICHA DE EXAME DISPLASIA=================");
        System.out.println("");
        System.out.println("Data do exame: " + dataExame);
        System.out.println("Tipo de displasia: " + tipoDisplasia);
        System.out.println("Grau de displasia: " + grauDisplasia);
        System.out.println("Observações: " + observacoes);
        System.out.println("=======================================================\n");
    }

    public Date getDataExame() {
        return this.dataExame;
    }

    public void setDataExame(Date dataExame) {
        this.dataExame = dataExame;
    }

    public String getTipoDisplasia() {
        return this.tipoDisplasia;
    }

    public void setTipoDisplasia(String tipoDisplasia) {
        this.tipoDisplasia = tipoDisplasia;
    }

    public String getGrauDisplasia() {
        return this.grauDisplasia;
    }

    public void setGrauDisplasia(String grauDisplasia) {
        this.grauDisplasia = grauDisplasia;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

}