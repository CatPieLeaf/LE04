package br.edu.up.models;

public class Professor extends Pessoa {
    private int idCurriculo;
    //Os professores possuem número de identificação do seu currículo Lattes 
    private String titulo;
    
    public int getIdCurriculo() {
        return idCurriculo;
    }
    public void setIdCurriculo(int idCurriculo) {
        this.idCurriculo = idCurriculo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
