import java.util.UUID;
import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Classe Usuario para representar um usuário no sistema de compra e reserva de cachorros.
 */
public class Usuario {

    private UUID idUsuario;
    private String nome;
    private LocalDate nascimento;
    private String endereco;

    private Map<Cachorro, Long> reservas;
    private int reservaLimite;
    private long reservaDuracao;

    private Scanner scanner;

    /**
     * Construtor da classe Usuario.
     *
     * @param nome Nome do usuário.
     * @param nascimento Data de nascimento do usuário.
     * @param endereco Endereço do usuário.
     * @param reservaDuracaoHoras Duração da reserva em horas.
     * @param reservaLimite Limite de reservas permitidas para o usuário.
     * @param scanner Scanner usado para entrada de dados do usuário.
     */
    public Usuario(String nome, LocalDate nascimento, String endereco, int reservaDuracaoHoras, int reservaLimite, Scanner scanner){
        this.idUsuario = UUID.randomUUID();
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.reservaDuracao = reservaDuracaoHoras * 60 * 60 * 1000;
        this.reservaLimite = reservaLimite;
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
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

    public Map<Cachorro,Long> getReservas() {
        return this.reservas;
    }

    public void setReservas(Map<Cachorro,Long> reservas) {
        this.reservas = reservas;
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

    /**
     * Método para realizar a compra de cachorros.
     *
     * @param listaUUID Lista de UUIDs dos cachorros a serem comprados.
     * @param estoqueController Controlador de estoque responsável pela gestão de cachorros disponíveis.
     * @param formaPagamento Forma de pagamento escolhida para a compra.
     */
    public void comprarCachorro(ArrayList<UUID> listaUUID, EstoqueController estoqueController, FormaPagamento formaPagamento){
        System.out.println("Executando compra para o Usuário: " + this.getNome() + "\n");
        ArrayList<Cachorro> cachorrosComprar = estoqueController.getCachorrosByUUIDs(listaUUID);

        Venda venda = new Venda(formaPagamento, LocalDate.now(), this.getIdUsuario(), this.getNome(), this.getScanner());

        Boolean vendaValida = true;
        for (Cachorro cachorro : cachorrosComprar){
            try{
                if(!estoqueController.isAvailablePurchase(cachorro) && cachorro.getReservedBy() != this){
                    throw new ReservedException("Cachorro " + cachorro.getNome() + " já esta reservado pelo usuário "+ cachorro.getReservedBy().getNome());
                }else{
                    venda.addCachorro(cachorro);
                    estoqueController.removeCachorroByUUID(cachorro.getIdCachorro());
                }
            }
            catch (ReservedException e){
                System.out.println(e.getMessage());
                System.out.println("Não foi possível realizar a venda");
                vendaValida = false;
            }
        }
        if (vendaValida){
            System.out.println("Gerando nota fiscal");
            venda.gerarNFE();
            venda.getNfe().resumoNFE();
            System.out.println("Venda realizada com sucesso.");
        }
    }

    /**
     * Método para reservar cachorros.
     *
     * @param listaUUID Lista de UUIDs dos cachorros a serem reservados.
     * @param estoqueController Controlador de estoque responsável pela gestão de cachorros disponíveis.
     * @param formaPagamento Forma de pagamento escolhida para a reserva.
     */
    public void reservarCachorro(ArrayList<UUID> listaUUID, EstoqueController estoqueController, FormaPagamento formaPagamento){
        System.out.println("Executando reserva para o Usuário: " + this.getNome() + "\n");
        ArrayList<Cachorro> cachorrosReservar = estoqueController.getCachorrosByUUIDs(listaUUID);
        Boolean reservaValida = true;
        for (Cachorro cachorro : cachorrosReservar){
            try{
                if (!estoqueController.isAvailablePurchase(cachorro)){
                    throw new ReservedException("Cachorro " + cachorro.getNome() + " já esta reservado pelo usuário "+ cachorro.getReservedBy().getNome());
                }else{
                    cachorro.setIsReserved(true);
                    cachorro.setReservedBy(this);
                }
            }catch (ReservedException e){
                System.out.println(e.getMessage());
                reservaValida = false;
                System.out.println("Não foi possível realizar a venda");
            }
        }
        if (reservaValida){
            System.out.println("Reserva realizada com sucesso.");
        }
    }

    /**
     * Método para verificar se a reserva de um cachorro expirou.
     *
     * @param cachorro Cachorro cuja reserva será verificada.
     * @return Verdadeiro se a reserva expirou, falso caso contrário.
     */
    public boolean reservaExpirou(Cachorro cachorro) {
        
        if (this.reservas != null){
            Long reservationTime = this.reservas.get(cachorro);            
            long currentTime = System.currentTimeMillis();
            return (currentTime - reservationTime) > this.reservaDuracao;
        }

        return false;
    }

}
