import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class NotaFiscal {
    
    private UUID chaveAcesso;
    private LocalDate dataEmissao;
    private String nomeCliente;
    private ArrayList <Cachorro> cachorrosComprados;
    private int totalQuantity;

    public NotaFiscal(String nomeCliente, ArrayList <Cachorro> cachorrosComprados){
        this.chaveAcesso = UUID.randomUUID();
        this.dataEmissao = LocalDate.now();
        this.nomeCliente = nomeCliente;
        this.cachorrosComprados = cachorrosComprados;
        this.totalQuantity = this.cachorrosComprados.size();
    }

    public void consultaItens(){
        for (Cachorro cachorro : this.cachorrosComprados){
            String output = String.format("%s --> %s", cachorro.getNome(), cachorro.getRaca());
            System.out.println(output);
        }
        String output = String.format("Total de Produtos: %d", this.getTotalQuantity());
        System.out.println(output);
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

    public ArrayList<Cachorro> getProduto() {
        return this.cachorrosComprados;
    }

    public void setProduto(ArrayList<Cachorro> cachorrosComprados) {
        this.cachorrosComprados = cachorrosComprados;
    }

    public int getTotalQuantity() {
        return this.totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

}
