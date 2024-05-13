package br.edu.up.models;

public class Tripulacao extends Pessoa{
    private int idAeronauticam, matricula;

    public int getIdAeronauticam() {
        return idAeronauticam;
    }

    public void setIdAeronauticam(int idAeronauticam) {
        this.idAeronauticam = idAeronauticam;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
