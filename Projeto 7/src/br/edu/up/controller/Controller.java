package br.edu.up.controller;
import java.util.ArrayList;
import br.edu.up.models.*;
public class Controller {

    
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    
    public String listDisciplinas() {
        String list = "";
        for (int i = 0; i < disciplinas.size(); i++) {
            list += "\n ("+i+") Disciplina = "+ disciplinas.get(i).getNome();
        }
        return list;
    }
    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public void addDisciplinas(Disciplina disciplinas) {
        this.disciplinas.add(disciplinas);
    }

    private ArrayList<Professor> professores = new ArrayList<Professor>();
    
    public String listProfessores() {
        String list = "";
        for (int i = 0; i < professores.size(); i++) {
            list += "\n ("+i+") Professores "+ professores.get(i).getNome() + " Disciplina do professor:" + professores.get(i).getDisciplinasMinistradas().get(i).getNome()/*THIS IS THE MOST EVIL THING THAT I HAVE EVER DONE*/;
        }
        return list;
    }
    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }
    public void addProfessores(Professor professores) {
        this.professores.add(professores);
    }

    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public String listAlunos() {
        String list = "";
        for (int i = 0; i < alunos.size(); i++) {
            list += "\n ("+i+") Aluno "+ alunos.get(i).getNome();
        }
        return list;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void addAlunos(Aluno alunos) {
        this.alunos.add(alunos);
    }
}
