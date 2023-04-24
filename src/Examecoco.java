import java.util.Date;

public class Examecoco {
    private Date dataExame;
    private String aspecto;
    private String cor;
    private boolean presencaSangue;
    private boolean presencaMuco;
    
    public Examecoco(Date dataExame, String aspecto, String cor, boolean presencaSangue, boolean presencaMuco) {
        this.dataExame = dataExame;
        this.aspecto = aspecto;
        this.cor = cor;
        this.presencaSangue = presencaSangue;
        this.presencaMuco = presencaMuco;
    }

    public void exibirFichaExame() {
        System.out.println("Ficha de Exame de Coco:");
        System.out.println("Data do exame: " + dataExame);
        System.out.println("Aspecto: " + aspecto);
        System.out.println("Cor: " + cor);
        System.out.println("Presença de sangue: " + (presencaSangue ? "Sim" : "Não"));
        System.out.println("Presença de muco: " + (presencaMuco ? "Sim" : "Não"));
    }
    
    public Date getDataExame() {
        return dataExame;
    }
    
    public void setDataExame(Date dataExame) {
        this.dataExame = dataExame;
    }
    
    public String getAspecto() {
        return aspecto;
    }
    
    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public boolean isPresencaSangue() {
        return presencaSangue;
    }
    
    public void setPresencaSangue(boolean presencaSangue) {
        this.presencaSangue = presencaSangue;
    }
    
    public boolean isPresencaMuco() {
        return presencaMuco;
    }
    
    public void setPresencaMuco(boolean presencaMuco) {
        this.presencaMuco = presencaMuco;
    }

    public boolean getPresencaSangue() {
        return this.presencaSangue;
    }

    public boolean getPresencaMuco() {
        return this.presencaMuco;
    }
}

