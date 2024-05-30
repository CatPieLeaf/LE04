package br.edu.up.controller;
import java.util.ArrayList;
import br.edu.up.models.*;
public class Controller {
    private ArrayList<Professor> professores = new ArrayList<Professor>();

    
    public String listProfessores() {
        String list = "";
        for (int i = 0; i < professores.size(); i++) {
            list += "\n ("+i+") Professores "+ professores.get(i).getNome();
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
