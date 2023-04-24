import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner em java deve ser inicializado e fechado somente após sua utilização.
        Scanner scanner = new Scanner(System.in);

        // Criando carteira de vacinação para um cachorro.
        CarteiraVacinacao vacinaRaiva1 = new CarteiraVacinacao();
        vacinaRaiva1.addVacina("Raiva", "Intravenosa", LocalDate.of(2020, 7, 15));
        CarteiraVacinacao vacinaRaiva2 = new CarteiraVacinacao();
        vacinaRaiva2.addVacina("Raiva", "Intravenosa", LocalDate.of(2021, 10, 22));
        
        // Criando uma medicação que será usada em um tratamento de um cachorro.
        Medicacao dramim = new Medicacao("Dramim", "Comprimido", "8 em 8 horas", " ");
        Tratamento tratamentoOssos = new Tratamento(dramim, LocalDate.of(2017, 5, 14), LocalDate.of(2023, 6, 19), "Problemas nos ossos", "10 miligramas");

        Medicacao antiPulgas = new Medicacao("Anti-Pulgas", "Comprimido", "12 em 12 horas", " ");
        Tratamento tratamentoPulgas = new Tratamento(antiPulgas, LocalDate.of(2022, 7, 5), LocalDate.of(2023, 1, 5), "Pulgas", "5 miligramas");
        
        // ===============Criando os exames para os cachorros===============
        Date dataExameCoco = new Date();
        Examecoco exameCoco = new Examecoco(dataExameCoco, "Pastoso", "Marrom", false, true);

        Date dataExameLaudosDisplasias = new Date();
        ExameLaudosDisplasias exameLaudosDisplasias = new ExameLaudosDisplasias(dataExameLaudosDisplasias, "Coxofemoral", "Grau 1", "Nenhuma observação adicional.");

        Date dataExameSangue = new Date();
        ExameSangue exameSangue = new ExameSangue(dataExameSangue, "AB+", 14.0, 4.5, 6.0, 150.0);

        FichaExame exames = new FichaExame(exameSangue, exameCoco, exameLaudosDisplasias);
        // ====================================================================

        // Criando prescrição de alimentação
        PrescricaoAlimentacao prescricaoAlimentacao1 = new PrescricaoAlimentacao("Ração Premium", 350.0, 2);
        PrescricaoAlimentacao prescricaoAlimentacao2 = new PrescricaoAlimentacao("Ração Super Premium", 450.0, 3);

        // Criando veterinario responsável pelo cachorro.
        Veterinario veterinario1 = new Veterinario("Carlos");
        Veterinario veterinario2 = new Veterinario("Juliana");
        ArrayList<Veterinario> veterinariosResponsaveis1 = new ArrayList<Veterinario>();
        ArrayList<Veterinario> veterinariosResponsaveis2 = new ArrayList<Veterinario>();
        veterinariosResponsaveis1.add(veterinario1);
        veterinariosResponsaveis2.add(veterinario2);

        // Instânciando os objetos de cachorro.
        Cachorro cachorro1 = new Cachorro("2556418", true, "Jorge", "1553", "5674", LocalDate.of(2022, 6, 19), 
        "Poodle", 2, true, vacinaRaiva1, veterinariosResponsaveis1, exames, prescricaoAlimentacao1, 1200);
        Cachorro cachorro2 = new Cachorro("1234567", false, "Luna", "1111", "2222", LocalDate.of(2019, 5, 15),
        "Labrador", 28, true, vacinaRaiva1, veterinariosResponsaveis1, null, prescricaoAlimentacao1, 1500);
        Cachorro cachorro3 = new Cachorro("9876543", true, "Toby", "3333", "4444", LocalDate.of(2018, 11, 11),
        "Golden Retriever", 32, false, vacinaRaiva2, veterinariosResponsaveis2, null, prescricaoAlimentacao2, 2000);
        
        cachorro1.addTratamento(tratamentoOssos);
        cachorro3.addTratamento(tratamentoPulgas);

        EstoqueController estoque = new EstoqueController();
        estoque.addCachorro(cachorro1);
        estoque.addCachorro(cachorro2);
        estoque.addCachorro(cachorro3);

        cachorro1.mostarExames();

        estoque.mostrarCachorrosDisponiveis();
        
        Usuario cliente1 = new Usuario("João", LocalDate.of(2001, 4, 11), "Av. Independência", 2, 4, scanner);
        Usuario cliente2 = new Usuario("Ana", LocalDate.of(2000, 7, 5), "Rua das Flores", 5, 3, scanner);
        
        FormaPagamento cartaoCliente1 = new FormaPagamento("João", 64158654, LocalDate.now(), 696);
        FormaPagamento cartaoCliente2 = new FormaPagamento("Ana", 65988474, LocalDate.now(), 498);
        
        ArrayList<UUID> produtosCliente1 = new ArrayList<UUID>();
        produtosCliente1.add(cachorro1.getIdCachorro());
        produtosCliente1.add(cachorro2.getIdCachorro());
        cliente1.comprarCachorro(produtosCliente1, estoque, cartaoCliente1);
        
        ArrayList<UUID> produtosCliente2 = new ArrayList<UUID>();
        produtosCliente2.add(cachorro3.getIdCachorro());
        cliente2.comprarCachorro(produtosCliente2, estoque, cartaoCliente2);

        scanner.close();

    }

}