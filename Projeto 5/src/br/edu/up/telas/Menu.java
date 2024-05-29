package br.edu.up.telas;

import java.util.Scanner;
import java.util.ArrayList;

import br.edu.up.controle.*;
import br.edu.up.modelos.*;
import br.edu.up.util.*;

public class Menu {
    ControleEventos controle = new ControleEventos();
    ArrayList<Evento> eventos = controle.getEventos();
    ArrayList<Pessoa> pessoa = controle.getPessoa();

    int totalIngressos = 0;

    public void run(){
        while (true) {
            System.out.println("1: fazer reserva");
            System.out.println("2: criar evento");
            System.out.println("3: ver todos os eventos e quantos ingressos foram comprados");            
            System.out.println("4: ver detalhamento dos eventos");
            System.out.println("5: fazer reserva");
            

            Scanner scanner = new Scanner(System.in);
            
            int escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                criarEvento();
                break;
                case 2:
                fazerReserva();
                break;
                case 3:
                verNomeDeEventos();
                break;
                case 4:
                verDetalhesDeEventos();
                break;
                case 5:
                fazerReserva();
                break;
                case 6:
                verTodos();
                break;
                default:
                break;
            }
        }
    }

    public void criarEvento(){            
                Prompt.imprimir("me diga qual é o nome do evento");
                String nome = Prompt.lerLinha();
                Prompt.imprimir("me diga a data do evento no modelo 00/00/0000");
                String data = Prompt.lerLinha();
                Prompt.imprimir("me diga o local onde o evento vai acontecer (bairro, rua, numero)");
                String local = Prompt.lerLinha();
                Prompt.imprimir("qual sera a capacidade maxima do lcoal?");
                int capacidadeMax = Prompt.lerInteiro();
                Prompt.imprimir("qual sera o valor unitario do ingresso");
                double valorIngresso = Prompt.lerDecimal();
                Evento novoevento = new Evento(nome, data, local, capacidadeMax, totalIngressos, valorIngresso);
                eventos.add(novoevento);
    }

    public void verNomeDeEventos(){
        for(Evento evento : eventos){
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            String detalhesEvento = "Nome: " + evento.getNome() + "    ingressos: " + totalIngressos;
            System.out.println(detalhesEvento);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void verDetalhesDeEventos(){
        for(Evento evento : eventos){
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
            String detalhesEvento = "Nome: " + evento.getNome() +
                                    ", Data: " + evento.getData() +
                                    ", Local: " + evento.getLocal() +
                                    ", Capacidade máxima: " + evento.getLotacaoMaxima() +
                                    ", Valor ingresso: " + evento.getPrecoIngresso();
            System.out.println(detalhesEvento);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    


    public void fazerReserva(){
        System.out.println("me diga o nome do evento");
        String nomeEvento = Prompt.lerLinha();
        System.out.println("me diga seu nome");
        String nome = Prompt.lerLinha();
        System.out.println("me diga quantidade de pessoas q vai ter");
        int quantidade = Prompt.lerInteiro();
        System.out.println("me diga a hora de chegada");
        String hora = Prompt.lerLinha();
        Evento eventoSelecionado = null;
        totalIngressos =+ quantidade; 
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                eventoSelecionado = evento;
                break;
            }
        }

        if (eventoSelecionado == null) {
            System.out.println("Evento não encontrado.");
            return;
        }
        
        double valor = eventoSelecionado.getPrecoIngresso() * quantidade;
        System.out.println("o valor total é " + valor);

        Pessoa novaPessoa = new Pessoa(nome, quantidade, hora, valor);
        pessoa.add(novaPessoa);
    }

    public void verTodos(){
        Scanner scan = new Scanner(System.in);
        System.out.println("me diga o nome do evento para ver todos os participantes");
        String nome = scan.nextLine();
        Evento getevento = null;
        for (Evento evento: eventos){
            if(evento.getNome().equalsIgnoreCase(nome)){
                getevento = evento;
                for (Evento pessoasEvento: eventos) {
                        if () {
                            
                        }
                    }
                }
            }
        }
    }
}

/*public void verTodos(){
        Scanner scan = new Scanner(System.in);
        System.out.println("me diga o nome do evento para ver todos os participantes");
        String nomeEvento = scan.nextLine();
        Evento eventoSelecionado = null;

        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nomeEvento)) {
                eventoSelecionado = evento;
                break;
            }
        }

        if (eventoSelecionado == null) {
            System.out.println("Evento não encontrado.");
            return;
        }

        System.out.println("Lista de participantes do evento " + eventoSelecionado.getNome() + ":");
        for (Pessoa p : pessoa) {
            // Assumindo que a Pessoa tem um método getEvento() para pegar o evento associado
            if (p.getEvento().equals(eventoSelecionado)) {
                System.out.println("Nome: " + p.getNome() + ", Quantidade: " + p.getQuantidade() + ", Hora de chegada: " + p.getHoraChegada());
            }
        }
    } */