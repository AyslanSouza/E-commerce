import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * Classe Venda para representar uma venda de cachorros no sistema.
 */
public class Venda{
    private boolean retirada;
    private FormaPagamento pagamento;
    private LocalDate dataVenda;
    private UUID idCliente;
    private String nomeCliente;
    private ArrayList<Cachorro> carrinhoAtual;
    private NotaFiscal nfe;
    private Scanner scanner;
    
    /**
     * Construtor da classe Venda.
     *
     * @param pagamento Forma de pagamento escolhida para a venda.
     * @param dataVenda Data da venda.
     * @param idCliente UUID do cliente que realiza a venda.
     * @param nomeCliente Nome do cliente que realiza a venda.
     * @param scanner Scanner usado para entrada de dados do usuário.
     */
    public Venda(FormaPagamento pagamento, LocalDate dataVenda, UUID idCliente, String nomeCliente, Scanner scanner) {
        this.nomeCliente = nomeCliente;
        this.pagamento = pagamento;
        this.dataVenda = dataVenda;
        this.idCliente = idCliente;
        this.carrinhoAtual = new ArrayList<Cachorro>();
        this.scanner = scanner;
        this.escolherFormaRecebimento();
        this.nfe = null;
    }

    public void gerarNFE(){
        this.nfe = new NotaFiscal(this.nomeCliente, this.carrinhoAtual);
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

    public ArrayList<Cachorro> getCarrinhoAtual() {
        return this.carrinhoAtual;
    }

    public void setCarrinhoAtual(ArrayList<Cachorro> carrinhoAtual) {
        this.carrinhoAtual = carrinhoAtual;
    }

    public NotaFiscal getNfe() {
        return this.nfe;
    }

    public void setNfe(NotaFiscal nfe) {
        this.nfe = nfe;
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

     /**
     * Adiciona um cachorro ao carrinho de compras.
     *
     * @param cachorro Cachorro a ser adicionado ao carrinho.
     */
    public void addCachorro(Cachorro cachorro){
        this.carrinhoAtual.add(cachorro);
    }

    /**
     * Remove um cachorro do carrinho de compras pelo seu UUID.
     *
     * @param cachorroID UUID do cachorro a ser removido.
     */
    public void removeCachorro(UUID cachorroID){
        for (Cachorro cachorro : this.carrinhoAtual){
            if (cachorro.getIdCachorro() == cachorroID){
                this.carrinhoAtual.remove(cachorro);
                break;
            }
        }
    }

    /**
     * Permite ao usuário escolher a forma de recebimento dos cachorros comprados.
     */
    public void escolherFormaRecebimento(){
        //Define a forma de entrega da compra
        
        Boolean entradaValida = false;
        int formaEntrega = 0;

        while(!entradaValida){
            System.out.println("Escolha uma das opcoes de entrega: \n 1 -> Retirar no local\n 2 -> Entrega na residência\n");
            try{
                formaEntrega = this.scanner.nextInt();
                entradaValida = true;
            }catch (InputMismatchException e){
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                this.scanner.nextLine();
            }
        }
       
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
    
}