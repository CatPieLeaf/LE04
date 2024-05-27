package br.edu.up.modelos;

public class Pessoa {
    private String nome;
    private int quantidadeDePessoas;
    private String hora;
    private double valor;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }
    public void setQuantidadeDePessoas(int quantidadeDePessoas) {
        this.quantidadeDePessoas = quantidadeDePessoas;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Pessoa(String nome, int quantidadeDePessoas, String hora, double valor) {
        this.nome = nome;
        this.quantidadeDePessoas = quantidadeDePessoas;
        this.hora = hora;
        this.valor = valor;
    }

    
    
    
}
