import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario pessoa2 = new Usuario("Ayslan_Doido_Da_Silva", LocalDate.of(2001,04,11), "AV. Independencia", 2, 4);
        CarteiraVacinacao vacinaRaiva = new CarteiraVacinacao();
        vacinaRaiva.addVacina("raiva", "intravenosa", LocalDate.of(2019, 04, 27));
        Medicacao dorFlex = new Medicacao("Dramim", "Comprimido", "8 em 8 horas", " ");
        Tratamento tratamento1 = new Tratamento(dorFlex, LocalDate.of(2017, 05, 14), LocalDate.of(2023, 06, 19), "Problemas nos ossos", "10 miligramas");
        
        Cachorro cachorro1 = new Cachorro(null, null, null, null, null, null, null, null, vacinaRaiva, 0)
        

        Venda venda1 = new Venda(new FormaPagamento("Titi", 64158654, LocalDate.now(), 696), LocalDate.now(), pessoa1.getIdUsuario(), null, cachorro1, 1);
        

    }
}