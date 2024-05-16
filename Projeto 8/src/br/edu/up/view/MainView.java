package br.edu.up.view;

import br.edu.up.models.Agenda;
import br.edu.up.models.Comercial;
import br.edu.up.models.Pessoal;
import br.edu.up.models.Contato;

import java.util.ArrayList;

public class MainView {
    public MainView(){
        run();
    }
    //Fazer algo decente, fazer um programa CRUD
    public void run() {
        Comercial comercio1 = new Comercial(01, "PETS LTDA", "(41) 99147-2421", "142.410-40/0001" );
        Comercial comercio2 = new Comercial(02, "hamburguer LTDA", "(41) 99234-2551", "159.305-08/0001" );
        Pessoal pessoa1 = new Pessoal(03, "Rafael Josué dermantes Capartes Falastes", "(52) 99573-6785", "17-12-5032");
        Pessoal pessoa2 = new Pessoal(04, "Skibidi toilet", "(69) 99666-1243", "12-04-2022");
        Agenda agenda = new Agenda();
        agenda.addCont(comercio1);
        agenda.addCont(comercio2);
        agenda.addCont(pessoa1);
        agenda.addCont(pessoa2);
        System.err.println(agenda.Listar());
    }
}
