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

    public void resumoNFE(){
        System.out.println("=== Resumo da Nota Fiscal ===");
        System.out.println("Chave de Acesso: " + this.getChaveAcesso());
        System.out.println("Data de Emissão: " + this.getDataEmissao());
        System.out.println("Nome do Cliente: " + this.getNomeCliente());
        System.out.println("\nCachorros comprados:");

        int precoTotal = 0;
    
        for (Cachorro cachorro : this.cachorrosComprados) {
            precoTotal += cachorro.getPreco();
            String output = String.format("Nome: %s | Raça: %s | ID: %s | Preço: R$%.2f",
                    cachorro.getNome(), cachorro.getRaca(), cachorro.getIdCachorro(), cachorro.getPreco());
            System.out.println(output);
        }
    
        System.out.println("\nTotal de Produtos: " + this.getTotalQuantity());
        System.out.println("\nPreço total: " + precoTotal);
        System.out.println("==============================");
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
