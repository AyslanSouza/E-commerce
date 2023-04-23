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
        return vermifugo;
    }

    public LocalDate getDataPrescricao() {
        return dataPrescricao;
    }

    public LocalDate getDataProximaVermifugacao() {
        return dataProximaVermifugacao;
    }

    @Override
    public String toString() {
        return "PrescricaoVermifugacao{" +
                ", vermifugo=" + vermifugo +
                ", dataPrescricao=" + dataPrescricao +
                ", dataProximaVermifugacao=" + dataProximaVermifugacao +
                '}';
    }
}