package br.edu.up.models;
public class Aeronave{
    private int codigo, quantidade_assentos;
    private String tipo;

    public Aeronave(int codigo, int quantidade_assentos, String tipo){
        this.setCodigo(codigo);
        this.setQuantidade_assentos(quantidade_assentos);
        this.setTipo(tipo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade_assentos() {
        return quantidade_assentos;
    }

    public void setQuantidade_assentos(int quantidade_assentos) {
        this.quantidade_assentos = quantidade_assentos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}