package br.edu.up.models;
import java.util.ArrayList;
public class Disciplina {
    private String nome;
    private int id;
    private ArrayList<String> competenciasNecessarias;
    private ArrayList<String> competenciasComplementares;
    private String curriculo;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    //Inicializa com apenas 1 aluno
    public Disciplina(String nome, int id, ArrayList<String> competenciasNecessarias, ArrayList<String> competenciaComplementares, String curriculo, Professor professor, Aluno aluno){
        this.setNome(nome);
        this.setId(id);
        this.setCompetenciasNecessarias(competenciasNecessarias);
        this.setCompetenciasComplementares(competenciaComplementares);
        this.setCurriculo(curriculo);//set o curriculo ao qual a disciplina pertence
        this.setProfessor(professor);
        this.alunos.add(aluno);//apenas 1 Aluno
    }
    //Inicializa com uma lista de alunos
    public Disciplina(String nome, int id, ArrayList<String> competenciasNecessarias, ArrayList<String> competenciaComplementares, String curriculo, Professor professor, ArrayList<Aluno> alunos){
        this.setNome(nome);
        this.setId(id);
        this.setCompetenciasNecessarias(competenciasNecessarias);
        this.setCompetenciasComplementares(competenciaComplementares);
        this.setCurriculo(curriculo);//set o curriculo ao qual a disciplina pertence
        this.setProfessor(professor);
        this.setAlunos(alunos);//lista de Alunos
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getCompetenciasNecessarias() {
        return competenciasNecessarias;
    }
    public void setCompetenciasNecessarias(ArrayList<String> competenciasNecessarias) {
        this.competenciasNecessarias = competenciasNecessarias;
    }

    public ArrayList<String> getCompetenciasComplementares() {
        return competenciasComplementares;
    }
    public void setCompetenciasComplementares(ArrayList<String> competenciasComplementares) {
        this.competenciasComplementares = competenciasComplementares;
    }

    public String getCurriculo() {
        return curriculo;
    }
    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public void addToAlunos(Aluno alunos) {
        this.alunos.add(alunos);
    }
}
