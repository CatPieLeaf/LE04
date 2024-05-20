package br.edu.up.controller;
import br.edu.up.models.*;
import java.util.ArrayList;
import java.util.Date;
public class Controle {
    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private int quantidadeComis=0, quantidadePass=0, quantidadeComan=0;

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public int getQuantidadeComis() {
        return quantidadeComis;
    }

    public void setQuantidadeComis(int quantidadeComis) {
        this.quantidadeComis = quantidadeComis;
    }

    public int getQuantidadePass() {
        return quantidadePass;
    }

    public void setQuantidadePass(int quantidadePass) {
        this.quantidadePass = quantidadePass;
    }

    public int getQuantidadeComan() {
        return quantidadeComan;
    }

    public void setQuantidadeComan(int quantidadeComan) {
        this.quantidadeComan = quantidadeComan;
    }

    public void addPassageiro(String nome, int rg, Aeronave aeronave, int id_bagagem, String classe_do_assento, int seat_number , Date flightDate){
        Passageiro passageiro = new Passageiro(nome, rg, aeronave, id_bagagem, classe_do_assento, seat_number, flightDate);
        pessoas.add(passageiro);
    }

    public void addComissario(String nome, int rg, int idAeronauticam, int matricula,ArrayList<String> idiomas, Aeronave aeronave){
        Comissario comissario = new Comissario(nome, rg, idAeronauticam, matricula, idiomas, aeronave);
        pessoas.add(comissario);
    }

    public void addComandante(String nome, int rg, int idAeronauticam, int matricula, int total_horas_voo, Aeronave aeronave){
        Comandante comissario = new Comandante(nome, rg, idAeronauticam, matricula, total_horas_voo, aeronave);
        pessoas.add(comissario);
    }

    public void verifyMinimum(){
        // minimo de 3 tripulantes, 1 comandante e 2 comissários(as) e 4 passageiros
        for (Pessoa pessoa : pessoas) {
            Comissario a = new Comissario();
            Comandante b = new Comandante();
            Passageiro c = new Passageiro();

            if(pessoa.getClass() == a.getClass()){
                //Comissario
                this.quantidadeComis ++;
            } else if(pessoa.getClass() == b.getClass()){
                //Comissario
                this.quantidadeComan ++;
            } else if(pessoa.getClass() == c.getClass()){
                //Comissario
                this.quantidadePass ++;
            }
            
        }
    }

}
