import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Usuario pessoa1 = new Usuario("Titi", LocalDate.of(2001,04,11), "AV. Independencia", 2, 4);
        CarteiraVacinacao vacinaRaiva = new CarteiraVacinacao();
        vacinaRaiva.addVacina("raiva", "intravenosa", LocalDate.of(2019, 04, 27));
        Medicacao dorFlex = new Medicacao("Dramim", "Comprimido", "8 em 8 horas", " ");
        Tratamento tratamento1 = new Tratamento(dorFlex, LocalDate.of(2017, 05, 14), LocalDate.of(2023, 06, 19), "Problemas nos ossos", "10 miligramas");
        Cachorro cachorro1 = new Cachorro("2556418", true, "jorge", "1553", "5674", LocalDate.of(2022, 06 , 19), "Poodle", true, vacinaRaiva, 1500);
        cachorro1.addTratamento(tratamento1);
        
        Cachorro cachorro2 = new Cachorro("2565864", false, "Tobias", "1564", "5674", LocalDate.of(2023, 06 , 19), "Vira-lata", false, vacinaRaiva, 2000);

        ArrayList<UUID> produtos = new ArrayList<UUID>();
        produtos.add(cachorro1.getIdCachorro());
        produtos.add(cachorro2.getIdCachorro());


        FormaPagamento brazino = new FormaPagamento("Titi", 64158654, LocalDate.now(), 696);

        EstoqueController estoque1 = new EstoqueController();
        estoque1.addCachorro(cachorro1);
        estoque1.addCachorro(cachorro2);

        pessoa1.comprarCachorro(produtos, estoque1, brazino);

    }

}