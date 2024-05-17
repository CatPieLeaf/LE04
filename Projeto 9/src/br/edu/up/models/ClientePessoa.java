package br.edu.up.models;

public class ClientePessoa extends Cliente{
    private String CPF;
    private double peso, altura;

//Super constructor
    public ClientePessoa( double credito)
    {

    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getSaldo(){
        return super.getSaldo();
    }
    
}
