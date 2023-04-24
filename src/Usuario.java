import java.util.Date;
import java.util.UUID;
import java.time.LocalDate;
import java.util.Map;
import java.util.ArrayList;

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
            cachorro.setReservedBy(this);
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

    public Map<Cachorro,Long> getReservations() {
        return this.reservations;
    }

    public void setReservations(Map<Cachorro,Long> reservations) {
        this.reservations = reservations;
    }

    public int getReservaLimite() {
        return this.reservaLimite;
    }

    public void setReservaLimite(int reservaLimite) {
        this.reservaLimite = reservaLimite;
    }

    public long getReservaDuracao() {
        return this.reservaDuracao;
    }

    public void setReservaDuracao(long reservaDuracao) {
        this.reservaDuracao = reservaDuracao;
    }

    public void comprarCachorro(ArrayList<UUID> listaUUID, EstoqueController estoqueController, FormaPagamento formaPagamento){
        ArrayList<Cachorro> cachorrosComprar = estoqueController.getCachorrosByUUIDs(listaUUID);

        Venda venda = new Venda(formaPagamento, LocalDate.of(2017, 05, 14), this.getIdUsuario(), this.getNome());

        for (Cachorro cachorro : cachorrosComprar){
            if (estoqueController.isAvailablePurchase(cachorro)){
                //tratamento de exceção
                try{
                    venda.addCachorro(cachorro);
                    estoqueController.removeCachorroByUUID(cachorro.getIdCachorro());
                    System.out.println("Venda realizada com sucesso.");
                }
                catch (Exception e){
                    System.out.println("Não foi possível realizar a venda");
                }
            }
        }
        venda.gerarNFE();
        venda.getNfe().consultaItens();
    }

    public void reservarCachorro(ArrayList<UUID> listaUUID, EstoqueController estoqueController, FormaPagamento formaPagamento){
        ArrayList<Cachorro> cachorrosReservar = estoqueController.getCachorrosByUUIDs(listaUUID);
        for (Cachorro cachorro : cachorrosReservar){
            if (estoqueController.isAvailablePurchase(cachorro)){
                //tratamento de exceção
                try{
                    cachorro.setIsReserved(true);
                    cachorro.setReservedBy(this);
                    System.out.println("Reserva realizada com sucesso.");
                }
                catch (Exception e){
                    System.out.println("Não foi possível realizar a venda");
                }
            }
        }
    }

}
