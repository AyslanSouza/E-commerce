import java.util.Date;
import java.util.UUID;
import java.time.LocalDate;
import java.util.Map;

public class Usuario {

    private UUID idUsuario;
    private String nome;
    private LocalDate nascimento;
    private String endereco;

    private Map<Cachorro, Long> reservations;
    private int reservaLimite;
    private long reservaDuracao;

    public Usuario(String nome, LocalDate nascimento, String endereco, int reservaDuracaoHoras, int reservaLimite){
        this.idUsuario = UUID.randomUUID();
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.reservaDuracao = reservaDuracaoHoras * 60 * 60 * 1000;
        this.reservaLimite = reservaLimite;
    }

    public boolean reservarCachorro(Cachorro cachorro) {
        if (reservations.size() < this.reservaLimite) {
            cachorro.setIsReserved(true);
            reservations.put(cachorro, System.currentTimeMillis());
            return true;
        }
        return false;
    }

    public boolean reservaExpirou(Cachorro cachorro) {
        Long reservationTime = reservations.get(cachorro);
        if (reservationTime != null) {
            long currentTime = System.currentTimeMillis();
            return (currentTime - reservationTime) > this.reservaDuracao;
        }
        return false;
    }

    public UUID getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void comprarCachorro(Cachorro cachorro, EstoqueController estoqueController, FormaPagamento formaPagamento, int totalQuantity){
        if (estoqueController.isAvailablePurchase(cachorro, totalQuantity)){
            try{
                Venda venda = new Venda(formaPagamento, LocalDate.now(), this.getIdUsuario(), this.getNome(), cachorro, totalQuantity);
                estoqueController.removeCachorroByUUID(cachorro.getIdCachorro());
                System.out.println("Venda realizada com sucesso.\n Resumo do pedido:");

            }
            catch (Exception e){
                System.out.println("Não foi possível realizar a venda");
            }
        }
    }

    public void reservarCachorro(Cachorro cachorro, EstoqueController estoqueController, FormaPagamento formaPagamento, int totalQuantity){
        if (estoqueController.isAvailablePurchase(cachorro, totalQuantity)){
            try{
                Venda venda = new Venda(formaPagamento, LocalDate.now(), this.getIdUsuario(), this.getNome(), cachorro, totalQuantity);
                estoqueController.removeCachorroByUUID(cachorro.getIdCachorro());
                System.out.println("Venda realizada com sucesso.\n Resumo do pedido:");

            }
            catch (Exception e){
                System.out.println("Não foi possível realizar a venda");
            }
        }
    }

}
