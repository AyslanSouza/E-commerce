import java.util.ArrayList;
import java.time.LocalDate;

/**
 * Classe CarteiraVacinacao para armazenar informações sobre as vacinas de um cachorro.
 */
public class CarteiraVacinacao{

    // ArrayList para armazenar todas as vacinas na carteira de vacinação.
    private ArrayList<Vacina> vacinas;

    public CarteiraVacinacao() {
        this.vacinas = new ArrayList<>();
    }

    /**
     * Método para adicionar uma vacina à carteira de vacinação.
     *
     * @param nomeVacina Nome da vacina a ser adicionada.
     * @param tipoVacina Tipo da vacina a ser adicionada.
     * @param dataVacinacao Data da aplicação da vacina.
     */
    public void addVacina(String nomeVacina, String tipoVacina, LocalDate dataVacinacao) {
        vacinas.add(new Vacina(nomeVacina, tipoVacina, dataVacinacao));
    }

    /**
     * Método para remover uma vacina da carteira de vacinação pelo nome da vacina.
     *
     * @param nomeVacina Nome da vacina a ser removida.
     * @return A vacina removida, se encontrada, ou null caso contrário.
     */
    public Vacina removerVacina(String nomeVacina) {
        for (Vacina vacina : this.vacinas) {
            if (vacina.getNomeVacina() == nomeVacina){
                this.vacinas.remove(vacina);
                return vacina;
            }
        }
        return null;
    }

    /**
     * Método para listar todas as vacinas presentes na carteira de vacinação.
     */
    public void listarVacinas() {
        for (Vacina vacina : this.vacinas) {
            System.out.println(vacina);
        }
    }

    /**
     * Getter para a lista de vacinas da carteira de vacinação.
     *
     * @return A lista de vacinas na carteira de vacinação.
     */
    public ArrayList<Vacina> getVacinas() {
        return this.vacinas;
    }

    /**
     * Setter para atualizar a lista de vacinas da carteira de vacinação.
     *
     * @param vacinas A nova lista de vacinas para a carteira de vacinação.
     */
    public void setVacinas(ArrayList<Vacina> vacinas) {
        this.vacinas = vacinas;
    }
}