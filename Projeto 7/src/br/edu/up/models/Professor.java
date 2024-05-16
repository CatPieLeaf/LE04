package br.edu.up.models;

import java.util.ArrayList;

public class Professor extends Pessoa {
    private int idLattes;
    private Titulo titulo;
    private ArrayList<Disciplina> disciplinasMinistradas;
    //inicializa com apenas 1 disciplina
    public Professor(String nome, int rg, int matricula, int idLattes, Titulo titulo, Disciplina disciplinas){
        super(nome, rg, matricula);
        this.setIdLattes(idLattes);
        this.setTitulo(titulo);
        this.addToDisciplinasMinistradas(disciplinas);
    }
    //Inicializa com uma lista de disciplinas
    public Professor(String nome, int rg, int matricula, int idLattes, Titulo titulo, ArrayList<Disciplina> disciplinas){
        super(nome, rg, matricula);
        this.setIdLattes(idLattes);
        this.setTitulo(titulo);
        this.setDisciplinasMinistradas(disciplinas);
    }

    public int getIdLattes() {
        return idLattes;
    }
    public void setIdLattes(int idLattes) {
        this.idLattes = idLattes;
    }
    public Titulo getTitulo() {
        return titulo;
    }
    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public void addToDisciplinasMinistradas(Disciplina disciplina){
        this.disciplinasMinistradas.add(disciplina);
    }
    public ArrayList<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(ArrayList<Disciplina> disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }


    
}
