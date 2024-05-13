package br.edu.up.models;

public class Aluno extends Pessoa{
    private int anoIngress;
    private String curso, turno;
    
    public int getAnoIngress() {
        return anoIngress;
    }
    public void setAnoIngress(int anoIngress) {
        this.anoIngress = anoIngress;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}
