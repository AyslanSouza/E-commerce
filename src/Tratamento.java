import java.time.LocalDateTime;

public class Tratamento{
    private Medicacao medicacao;
    private LocalDateTime inicioTratamento;
    private LocalDateTime fimTratamento;
    private String justificativa;
    private String dosagem;

    public Tratamento(Medicacao medicacao, LocalDateTime inicioTratamento, LocalDateTime fimTratamento, String justificativa, String dosagem) {
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

    public LocalDateTime getInicioTratamento() {
        return this.inicioTratamento;
    }

    public void setInicioTratamento(LocalDateTime inicioTratamento) {
        this.inicioTratamento = inicioTratamento;
    }

    public LocalDateTime getFimTratamento() {
        return this.fimTratamento;
    }

    public void setFimTratamento(LocalDateTime fimTratamento) {
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