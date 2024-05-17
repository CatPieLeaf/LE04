package br.edu.up.models;

public class Cidade {
    private String nome, UF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String uF) {
        UF = uF;
    }
    
    @Override
    public String toString() {
        return this.getNome() + "\n" + this.getUF() + "\n";
    }
}
