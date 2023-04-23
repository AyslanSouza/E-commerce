import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

//Registra a venda do animal com o comprador 
public class Venda{
    private boolean retirada;
    private FormaPagamento pagamento;
    private LocalDate dataVenda;
    private UUID idCliente;
    private String nomeCliente;
    private Cachorro cachorro;
    private int totalQuantity;
    private NotaFiscal nfe;
    //o que foi comprado

    

    public Venda(FormaPagamento pagamento, LocalDate dataVenda, UUID idCliente, String nomeCliente, Cachorro cachorro, int totalQuantity) {
        //Cadastro o cartão utilizado na compra
        this.pagamento = pagamento;
        this.dataVenda = dataVenda;
        this.idCliente = idCliente;
        this.cachorro = cachorro;
        this.escolherFormaRecebimento();
        this.nfe = new NotaFiscal(this.nomeCliente, this.cachorro.getRaca(), this.totalQuantity);
    }

    public void escolherFormaRecebimento(){
        //Define a forma de entrega da compra
        System.out.println("Escolha uma das opções de entrega: \n 1 -> Retirar no local\n 2 -> Entrega na residência\n 3 -> ");
        Scanner scanner = new Scanner(System.in);
        int formaEntrega = scanner.nextInt();
        scanner.close();

        switch(formaEntrega){
            case 1:
                System.out.print("Você escolheu retirar no local");
                break;
            case 2:
                System.out.print("Você escolheu entregar na sua residencia");
                break;
            default:
                System.out.print("Você escolheu entregar na sua residencia");
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

    public Cachorro getCachorro() {
        return this.cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }
    
    
}