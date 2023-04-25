import java.util.Date;

public class ExameSangue {
    
    private Date dataExame;
    private String tipoSangue;
    private double hemoglobina;
    private double hemacias;
    private double leucocitos;
    private double plaquetas;
    
    public ExameSangue(Date dataExame, String tipoSangue, double hemoglobina, double hemacias, double leucocitos, double plaquetas) {
        this.dataExame = dataExame;
        this.tipoSangue = tipoSangue;
        this.hemoglobina = hemoglobina;
        this.hemacias = hemacias;
        this.leucocitos = leucocitos;
        this.plaquetas = plaquetas;
    }

    public void exibirFichaExame() {
        System.out.println("=================FICHA EXAME DE SANGUE=================");
        System.out.println("Data do exame: " + dataExame);
        System.out.println("Tipo de sangue: " + tipoSangue);
        System.out.printf("Hemoglobina: %.2f g/dL%n", hemoglobina);
        System.out.printf("Hemácias: %.2f milhões/mcL%n", hemacias);
        System.out.printf("Leucócitos: %.2f mil/mcL%n", leucocitos);
        System.out.printf("Plaquetas: %.2f mil/mcL%n", plaquetas);
        System.out.println("=======================================================\n");
    }

    public Date getDataExame() {
        return this.dataExame;
    }

    public void setDataExame(Date dataExame) {
        this.dataExame = dataExame;
    }

    public String getTipoSangue() {
        return this.tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public double getHemoglobina() {
        return this.hemoglobina;
    }

    public void setHemoglobina(double hemoglobina) {
        this.hemoglobina = hemoglobina;
    }

    public double getHemacias() {
        return this.hemacias;
    }

    public void setHemacias(double hemacias) {
        this.hemacias = hemacias;
    }

    public double getLeucocitos() {
        return this.leucocitos;
    }

    public void setLeucocitos(double leucocitos) {
        this.leucocitos = leucocitos;
    }

    public double getPlaquetas() {
        return this.plaquetas;
    }

    public void setPlaquetas(double plaquetas) {
        this.plaquetas = plaquetas;
    }

}
