import java.time.LocalDate;

public class Vacina{

    private String nomeVacina;
    private String tipoVacina;
    private LocalDate dataVacinacao;

    public Vacina(String nomeVacina, String tipoVacina, LocalDate dataVacinacao) {
        this.nomeVacina = nomeVacina;
        this.tipoVacina = tipoVacina;
        this.dataVacinacao = dataVacinacao;
    }

    @Override
    public String toString() {
        return String.format("Vacina: %s Tipo de Vacina: %s Data de vacinação: %s", this.nomeVacina, this.tipoVacina, this.dataVacinacao);
    }
}