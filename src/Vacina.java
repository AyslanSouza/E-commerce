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

    public String getNomeVacina() {
        return this.nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getTipoVacina() {
        return this.tipoVacina;
    }

    public void setTipoVacina(String tipoVacina) {
        this.tipoVacina = tipoVacina;
    }

    public LocalDate getDataVacinacao() {
        return this.dataVacinacao;
    }

    public void setDataVacinacao(LocalDate dataVacinacao) {
        this.dataVacinacao = dataVacinacao;
    }
}