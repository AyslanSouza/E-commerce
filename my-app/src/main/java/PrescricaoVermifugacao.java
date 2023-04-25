import java.time.LocalDate;

public class PrescricaoVermifugacao{
    private Vermifugo vermifugo;
    private LocalDate dataPrescricao;
    private LocalDate dataProximaVermifugacao;

    public PrescricaoVermifugacao(Vermifugo vermifugo, LocalDate dataPrescricao, int intervaloMeses) {
        this.vermifugo = vermifugo;
        this.dataPrescricao = dataPrescricao;
        this.dataProximaVermifugacao = dataPrescricao.plusMonths(intervaloMeses);
    }

    public Vermifugo getVermifugo() {
        return this.vermifugo;
    }

    public void setVermifugo(Vermifugo vermifugo) {
        this.vermifugo = vermifugo;
    }

    public LocalDate getDataPrescricao() {
        return this.dataPrescricao;
    }

    public void setDataPrescricao(LocalDate dataPrescricao) {
        this.dataPrescricao = dataPrescricao;
    }

    public LocalDate getDataProximaVermifugacao() {
        return this.dataProximaVermifugacao;
    }

    public void setDataProximaVermifugacao(LocalDate dataProximaVermifugacao) {
        this.dataProximaVermifugacao = dataProximaVermifugacao;
    }
}