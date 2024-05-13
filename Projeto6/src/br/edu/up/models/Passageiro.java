package br.edu.up.models;
import java.util.Date;

public class Passageiro extends Pessoa{
    private int id_Bagagem; 
    private Passagem passagem;

    public Passageiro(String nome, int rg, Aeronave aeronave, int id_bagagem, String classe_do_assento, int seat_number , Date flightDate){
        
        super.setNome(nome);
        super.setRg(rg);
        super.setAeronave(aeronave);
        //---Pessoa
        this.setId_Bagagem(id_bagagem);
        //---Passageiro
        this.setPassagem(passagem = new Passagem(classe_do_assento, seat_number, flightDate));
        //---Passagem
        // Passagem( String classe_do_assento, int seat_number ,Date flightDate)
        //
        //
        // Declaração de Passageiro
        // new Passageiro(nome, rg, aeronave, id_bagagem, classe_do_assento, seat_number, flightDate)
    }

    public int getId_Bagagem() {
        return id_Bagagem;
    }

    public void setId_Bagagem(int id_Bagagem) {
        this.id_Bagagem = id_Bagagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }
}
