import java.util.HashMap;
import java.util.Map;


public class FichaExame {
    private ExameSangue exameSangue; //Ficha de exame de Sangue
    private ExameFezes exameCoco; //Ficha de exame de coco
    private ExameLaudosDisplasias exameLaudosDisplasias; //ficha de exame de laudos Displasias

    public FichaExame(ExameSangue exameSangue, ExameFezes exameCoco, ExameLaudosDisplasias exameLaudosDisplasias) {
        this.exameSangue = exameSangue;
        this.exameCoco = exameCoco;
        this.exameLaudosDisplasias = exameLaudosDisplasias;
    }

    public void exibirExames(){
        Map<String, Object> exames = new HashMap<>();

        exames.put("Exame de fezes", this.exameCoco);
        exames.put("Exame de sangue", this.exameSangue);
        exames.put("Exame de laudos de displasias", this.exameLaudosDisplasias);
        
        for (Map.Entry<String, Object> exame : exames.entrySet()) {
            if (exame.getValue() == null) {
                System.out.println("Este cão não possui " + exame.getKey().toLowerCase());
            } else {
                if (exame.getValue() instanceof ExameFezes) {
                    ((ExameFezes) exame.getValue()).exibirFichaExame();
                } else if (exame.getValue() instanceof ExameSangue) {
                    ((ExameSangue) exame.getValue()).exibirFichaExame();
                } else if (exame.getValue() instanceof ExameLaudosDisplasias) {
                    ((ExameLaudosDisplasias) exame.getValue()).exibirFichaExame();
                }
            }
        }
    }

    public ExameSangue getExameSangue() {
        return this.exameSangue;
    }

    public void setExameSangue(ExameSangue exameSangue) {
        this.exameSangue = exameSangue;
    }

    public ExameFezes getExameCoco() {
        return this.exameCoco;
    }

    public void setExameCoco(ExameFezes exameCoco) {
        this.exameCoco = exameCoco;
    }

    public ExameLaudosDisplasias getExameLaudosDisplasias() {
        return this.exameLaudosDisplasias;
    }

    public void setExameLaudosDisplasias(ExameLaudosDisplasias exameLaudosDisplasias) {
        this.exameLaudosDisplasias = exameLaudosDisplasias;
    }

}
