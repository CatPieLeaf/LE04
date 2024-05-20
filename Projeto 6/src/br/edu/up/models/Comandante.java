package br.edu.up.models;

public class Comandante extends Tripulacao{
    private int total_horas_voo;
    public Comandante(){}
    public Comandante(String nome, int rg, int idAeronauticam, int matricula, int total_horas_voo, Aeronave aeronave)
    {
        super.setNome(nome);
        super.setRg(rg);
        super.setAeronave(aeronave);
        //---Pessoa
        super.setIdAeronauticam(idAeronauticam);
        super.setMatricula(matricula);
        //---Tripulação
        this.setTotal_horas_voo(total_horas_voo);
        //---Comodante
    }

    public int getTotal_horas_voo() {
        return total_horas_voo;
    }

    public void setTotal_horas_voo(int total_horas_voo) {
        this.total_horas_voo = total_horas_voo;
    }
}
