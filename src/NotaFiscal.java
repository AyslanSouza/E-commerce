import java.time.LocalDate;
import java.util.UUID;

public class NotaFiscal {
    
    private UUID chaveAcesso;
    private LocalDate dataEmissao;
    private String nomeCliente;
    private String nomeProduto;
    private int totalQuantity;

    public NotaFiscal(int chaveAcesso, String nomeCliente, String nomeProduto, int totalQuantity){
        this.chaveAcesso = UUID.randomUUID();
        this.dataEmissao = LocalDate.now();
        this.nomeCliente = nomeCliente;
        this.nomeProduto = nomeProduto;
        this.totalQuantity = totalQuantity;
    }

    public UUID getChaveAcesso() {
        return this.chaveAcesso;
    }

    public LocalDate getDataEmissao() {
        return this.dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getProduto() {
        return this.nomeProduto;
    }

    public void setProduto(String produto) {
        this.nomeProduto = produto;
    }

    public int getTotalQuantity() {
        return this.totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

}
