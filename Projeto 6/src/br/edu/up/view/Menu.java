package br.edu.up.view;
import br.edu.up.models.*;
import br.edu.up.controller.*;
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class Menu {
    // Um aeroporto precisa-se registrar informações sobre as diferentes pessoas que nele trafegam.
    // criar um programa que permita ao usuário realizar as operações necessários para o controle do tráfego.
    // isso inclui, cadastrar 1 voo, quantos pessoas vão no avião? a tripulação e os passageiros. 
    // Pelo menos 1 de cada
    private Scanner input = new Scanner(System.in);
    private Date data;
    private Aeronave aeronave = new Aeronave( 1, 180, "comercial");
    private Controle controller = new Controle();

    public void run(){
        flightDate();
        actions();
        input.close();
    }

    public void actions(){
        System.out.println("----------------------------ACTIONS------------------------------------------------");
        System.out.println("| Escolha uma ação:                                                               |");
        System.out.println("| 1) adicionar passageiro                                                         |");
        System.out.println("| 2) adicionar comissário                                                         |");
        System.out.println("| 3) adicionar Comandante                                                         |");
        System.out.println("| 4) decolar (Requer no minimo 1 comandante, 1 comissário e 1 passageiro)         |");
        System.out.println("| 5) cancelar voo                                                                 |");
        System.out.println("-----------------------------------------------------------------------------------");
        int value = input.nextInt();
        input.nextLine();
        switch (value) {
            case 1:
                addPassageiroView();
                break;
            case 2:
                addComissarioView();
                break;
            case 3:
                addComandanteView();
                break;
            case 4:
                decolar();
                break;
            case 5:
                cancelar();
                break;
        
            default:
                System.out.println("Valor desconhecido, fechando o programa...");
                break;
        }
    }


    //  adicionar passageiro");
    public void addPassageiroView(){
        System.out.println("Adicione o nome da pessoa");
        String nome = input.nextLine();
        System.out.println("Adicione o rg");
        int rg = input.nextInt();
        input.nextLine();
        System.out.println("Adicione o id da bagagem");
        int id_Bagagem = input.nextInt();
        input.nextLine();
        System.out.println("Adicione o tipo do assento do passageiro\n-Comum\n-Vip\n");
        String classe_do_assento = input.nextLine();
        System.out.println("Adicione o numero do assento");
        int nAssento = input.nextInt();
        input.nextLine();
        controller.addPassageiro(nome, rg, aeronave, id_Bagagem, classe_do_assento, nAssento, data);
        actions();
    }
    //  adicionar comissário");
    public void addComissarioView(){
        System.out.println("Adicione o nome da pessoa");
        String nome = input.nextLine();
        System.out.println("Adicione o rg");
        int rg = input.nextInt();
        input.nextLine();
        System.out.println("Adicione o id da Aeronautica");
        int idAeronauticam = input.nextInt();
        input.nextLine();
        System.out.println("Adicione a Matricula do Comissario");
        int matricula = input.nextInt();
        input.nextLine();
        System.out.println("Quantos idiomas o comissario sabe?");
        int valor = input.nextInt();
        input.nextLine();
        ArrayList<String> idiomas = new ArrayList<String>();
        for (int i = 0; i < valor; i++) {
            System.out.println("Escreva o idioma no qual ele sabe: ");
            idiomas.add(input.nextLine());
        }
        for (int i = 0; i < valor; i++) {
            System.out.println("O Comissario sabe falar "+idiomas.get(i).toString());
        }
        controller.addComissario(nome, rg, idAeronauticam, matricula, idiomas, this.aeronave);
        actions();
    }
    //  adicionar Comandante");
    public void addComandanteView(){
        System.out.println("Adicione o nome da pessoa");
        String nome = input.nextLine();
        System.out.println("Adicione o rg");
        int rg = input.nextInt();
        input.nextLine();
        System.out.println("Adicione o id da Aeronautica");
        int idAeronauticam = input.nextInt();
        input.nextLine();
        System.out.println("Adicione a Matricula do Comandante");
        int matricula = input.nextInt();
        input.nextLine();
        System.out.println("Quantas horas o Comandante tem de experiência?");
        int total_horas_voo = input.nextInt();
        
        controller.addComandante(nome, rg, idAeronauticam, matricula, total_horas_voo, aeronave);
        actions();
    }

    //  decolar (Requer no minimo 1 comandante, 2 comissários e 5 passageiros)");
    public void decolar(){
        controller.verifyMinimum();
        if (controller.getQuantidadeComan()>=1 && controller.getQuantidadeComis() >= 1 && controller.getQuantidadePass() >= 1){
            System.out.println("O avião decolou com sucesso\n tendo "+controller.getQuantidadeComan()+" Comandate(s)/ "+controller.getQuantidadeComis()+" comissários/ "+controller.getQuantidadePass()+" passageiros \n");
            flightDate();
        } else {
            System.out.println("O avião não pode decolar ainda, requerimentos minimos precisam ser atendidos");
            System.out.println("Comandantes (minimo 1) = "+controller.getQuantidadeComan());
            System.out.println("Comissários (minimo 1) = "+controller.getQuantidadeComis());
            System.out.println("Passageiros (minimo 1) = "+controller.getQuantidadePass());
        }
        actions();
    }
    //  cancelar voo");
    public void cancelar(){
        System.out.println("O voo foi cancelado");
    }

    @SuppressWarnings("deprecation")
    public void flightDate()
    {    
        System.out.println("Decida a data no qual o avião comercial ira decolar: ");
        System.out.println("Ano de decolagem");
        int year = input.nextInt();

        System.out.println("Mês(1 - 12)");
        int month = input.nextInt()-1;

        System.out.println("Dia(1 - 31)");
        int day = input.nextInt();
        
        System.out.println("Horas(0-24)");
        int hour = input.nextInt();

        System.out.println("Minutos(0-59)");
        int minutes = input.nextInt();
        
        this.data = new Date();
        this.data.setYear(year);
        this.data.setMonth(month);
        this.data.setDate(day);
        this.data.setHours(hour);
        this.data.setMinutes(minutes);
        System.out.println("A data do voo esta marcada para:\n"+data.getDate()+"/"+(data.getMonth()+1)+"/"+data.getYear()+"\n"+ data.getHours() +":"+ data.getMinutes());
    }
}
