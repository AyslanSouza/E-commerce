import java.time.LocalDate;

public class Tratamento{

    private Medicacao medicacao;
    private LocalDate inicioTratamento;
    private LocalDate fimTratamento;
    private String justificativa;
    private String dosagem;

    public Tratamento(Medicacao medicacao, LocalDate inicioTratamento, LocalDate fimTratamento, String justificativa, String dosagem) {
        this.medicacao = medicacao;
        this.inicioTratamento = inicioTratamento;
        this.fimTratamento = fimTratamento;
        this.justificativa = justificativa;
        this.dosagem = dosagem;
    }

    public Medicacao getMedicacao() {
        return this.medicacao;
    }

    public void setMedicacao(Medicacao medicacao) {
        this.medicacao = medicacao;
    }

    public LocalDate getInicioTratamento() {
        return this.inicioTratamento;
    }

    public void setInicioTratamento(LocalDate inicioTratamento) {
        this.inicioTratamento = inicioTratamento;
    }

    public LocalDate getFimTratamento() {
        return this.fimTratamento;
    }

    public void setFimTratamento(LocalDate fimTratamento) {
        this.fimTratamento = fimTratamento;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getDosagem() {
        return this.dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }
}