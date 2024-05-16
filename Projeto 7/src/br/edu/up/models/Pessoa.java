package br.edu.up.models;

public abstract class Pessoa {
    private String nome;
    private int rg;
    private int matricula;
    Pessoa(String nome, int rg, int matricula){
        this.setNome(nome);
        this.setRg(rg);
        this.setMatricula(matricula);
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
    
}
