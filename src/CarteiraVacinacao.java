import java.util.ArrayList;
import java.time.LocalDate;

public class CarteiraVacinacao{

    private ArrayList<Vacina> vacinas;

    public CarteiraVacinacao() {
        this.vacinas = new ArrayList<>();
    }

    public void addVacina(String nomeVacina, String tipoVacina, LocalDate dataVacinacao) {
        vacinas.add(new Vacina(nomeVacina, tipoVacina, dataVacinacao));
    }

    public void listarVacinas() {
        for (Vacina vacina : this.vacinas) {
            System.out.println(vacina);
        }
    }
}