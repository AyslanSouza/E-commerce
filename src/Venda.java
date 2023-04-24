import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;
import java.util.ArrayList;

//Registra a venda do animal com o comprador 
public class Venda{
    private boolean retirada;
    private FormaPagamento pagamento;
    private LocalDate dataVenda;
    private UUID idCliente;
    private String nomeCliente;
    private ArrayList<Cachorro> cachorrosComprados;
    private NotaFiscal nfe;
    
    public Venda(FormaPagamento pagamento, LocalDate dataVenda, UUID idCliente, String nomeCliente) {
        //Cadastro o cartão utilizado na compra
        this.pagamento = pagamento;
        this.dataVenda = dataVenda;
        this.idCliente = idCliente;
        this.cachorrosComprados = new ArrayList<Cachorro>();
        this.escolherFormaRecebimento();
        this.nfe = null;
    }

    public void gerarNFE(){
        this.nfe = new NotaFiscal(this.nomeCliente, this.cachorrosComprados);
    }

    public boolean isRetirada() {
        return this.retirada;
    }

    public boolean getRetirada() {
        return this.retirada;
    }

    public void setRetirada(boolean retirada) {
        this.retirada = retirada;
    }
    public void setPagamento(FormaPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public UUID getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(UUID idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public ArrayList<Cachorro> getCachorrosComprados() {
        return this.cachorrosComprados;
    }

    public void setCachorrosComprados(ArrayList<Cachorro> cachorrosComprados) {
        this.cachorrosComprados = cachorrosComprados;
    }

    public NotaFiscal getNfe() {
        return this.nfe;
    }

    public void setNfe(NotaFiscal nfe) {
        this.nfe = nfe;
    }
    //o que foi comprado


    public void addCachorro(Cachorro cachorro){
        this.cachorrosComprados.add(cachorro);
    }

    public void removeCachorro(UUID cachorroID){
        for (Cachorro cachorro : this.cachorrosComprados){
            if (cachorro.getIdCachorro() == cachorroID){
                this.cachorrosComprados.remove(cachorro);
                break;
            }
        }
    }

    public void escolherFormaRecebimento(){
        //Define a forma de entrega da compra
        System.out.println("Escolha uma das opcoes de entrega: \n 1 -> Retirar no local\n 2 -> Entrega na residência\n");
        Scanner scanner = new Scanner(System.in);
        int formaEntrega = scanner.nextInt();
        scanner.close();

        switch(formaEntrega){
            case 1:
                System.out.print("Você escolheu retirar no local\n");
                break;
            case 2:
                System.out.print("Você escolheu entregar na sua residencia\n");
                break;
            default:
                System.out.print("Você escolheu entregar na sua residencia\n");
        }
    }

    public FormaPagamento getPagamento() {
        return this.pagamento;
    }


    public LocalDate getDataVenda() {
        return this.dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getUsuario() {
        return this.nomeCliente;
    }
    
}