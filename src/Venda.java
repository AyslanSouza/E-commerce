import java.time.LocalDate;
//Registra a venda do animal com o comprador 
public class Venda{
    private boolean retirada;
    private FormaPagamento pagamento;
    private LocalDate dataVenda;
    private Usuario usuario;
    private Cachorro cachorro;
    private NotaFiscal nfe;
    //o que foi comprado

    public Venda(FormaPagamento pagamento, int digito, LocalDate dataVenda, Usuario usuario, Cachorro cachorro, NotaFiscal nfe) {
        //Define a forma de entrega da compra
        switch(digito){
            case 1:
                retirada = true;
                System.out.print("Você escolheu retirar no local");
                break;
            case 2:
                retirada = false;
                System.out.print("Você escolheu entregar na sua residencia");
                break;
            default:
                retirada = false;
                System.out.print("Você escolheu entregar na sua residencia");
        }
        //Cadastro o cartão utilizado na compra
        this.pagamento = pagamento;
        this.dataVenda = dataVenda;
        this.usuario = usuario;
        this.cachorro = cachorro;
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

    public Usuario getUsuario() {
        return this.usuario;
    }

    public Cachorro getCachorro() {
        return this.cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }
    
    
}