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

    public Vacina removerVacina(String nomeVacina) {
        for (Vacina vacina : this.vacinas) {
            if (vacina.getNomeVacina() == nomeVacina){
                this.vacinas.remove(vacina);
                return vacina;
            }
        }
        return null;
    }

    public void listarVacinas() {
        for (Vacina vacina : this.vacinas) {
            System.out.println(vacina);
        }
    }

    public ArrayList<Vacina> getVacinas() {
        return this.vacinas;
    }

    public void setVacinas(ArrayList<Vacina> vacinas) {
        this.vacinas = vacinas;
    }
}