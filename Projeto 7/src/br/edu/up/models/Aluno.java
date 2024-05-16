package br.edu.up.models;
import java.util.ArrayList;
// import java.util.Map;
public class Aluno extends Pessoa{
    private int anoIngresso;
    private String nomeCurso, turno;
    private ArrayList<Disciplina> disciplinasMatriculadas;
    private ArrayList<String> competencias;
    //Inicializa com 1 competência
    public Aluno(String nome, int rg, int matricula, int anoIngresso, String nomeCurso, String turno, Disciplina disciplina, String competencia){
        super(nome, rg, matricula);
        this.setAnoIngresso(anoIngresso);
        this.setNome(nomeCurso);
        this.setTurno(turno);
        this.addToDisciplinasMatri(disciplina);
        this.addCompetencias(competencia);
    }
    //inicializa com mais de uma competência//Utilizando ArrayList
    public Aluno(String nome, int rg, int matricula, int anoIngresso, String nomeCurso, String turno, ArrayList<Disciplina> disciplina, ArrayList<String> competencia){
        super(nome, rg, matricula);
        this.setAnoIngresso(anoIngresso);
        this.setNome(nomeCurso);
        this.setTurno(turno);
        this.setDisciplinaMatri(disciplina);
        this.setCompetencias(competencia);
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public ArrayList<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }
    public void setDisciplinaMatri(ArrayList<Disciplina> disciplinas){
        this.disciplinasMatriculadas = disciplinas;
    }
    public void addToDisciplinasMatri(Disciplina disciplina) {
        this.disciplinasMatriculadas.add(disciplina);
    }


    public ArrayList<String> getCompetencias() {
        return competencias;
    }
    public void setCompetencias(ArrayList<String> competencias){
        this.competencias = competencias;
    }
    public void addCompetencias(String competencias) {
        this.competencias.add(competencias);
    }
    
    
}
