package br.edu.up.controller;
import br.edu.up.models.*;
import java.util.ArrayList;
import java.util.Date;
public class Controle {
    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void addPassageiro(String nome, int rg, Aeronave aeronave, int id_bagagem, String classe_do_assento, int seat_number , Date flightDate){
        Passageiro passageiro = new Passageiro(nome, rg, aeronave, id_bagagem, classe_do_assento, seat_number, flightDate);
        pessoas.add(passageiro);
    }

    public void addComissario(String nome, int rg, int idAeronauticam, int matricula,String[] idiomas, Aeronave aeronave){
        Comissario comissario = new Comissario(nome, rg, idAeronauticam, matricula, idiomas, aeronave);
        pessoas.add(comissario);
    }

    public void addComandante(String nome, int rg, int idAeronauticam, int matricula, int total_horas_voo, Aeronave aeronave){
        Comandante comissario = new Comandante(nome, rg, idAeronauticam, matricula, total_horas_voo, aeronave);
        pessoas.add(comissario);
    }

}
