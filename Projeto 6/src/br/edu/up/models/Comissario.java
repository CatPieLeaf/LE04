package br.edu.up.models;
import java.util.ArrayList;
public class Comissario extends Tripulacao{
    private ArrayList<String> idiomas;

    public Comissario(){}
    public Comissario(String nome, int rg, int idAeronauticam, int matricula,ArrayList<String> idiomas, Aeronave aeronave)
    {
        super.setNome(nome);
        super.setRg(rg);
        super.setAeronave(aeronave);
        //---Pessoa
        super.setIdAeronauticam(idAeronauticam);
        super.setMatricula(matricula);
        //---Tripulação
        this.idiomas = idiomas;
        //---Idiomas
        //Adiciona o array[] ao ArrayList<> 
    }

    //Pessoas podem aprender um idioma novo, então pode ser preciso fazer a adição de novos idiomas
    public void addIdioma(String idiomas){
        this.idiomas.add(idiomas);
    }
    public void removeIdioma(String idiomas){
        this.idiomas.remove(idiomas);
    }
}
