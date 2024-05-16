package br.edu.up.models;

public class Comercial extends Contato {
    private String cnpj;

    public Comercial(){

    }
    public Comercial(int codigo, String nome, String telefone, String cnpj)//?????
    {
        super(codigo, nome, telefone);
        this.setCnpj(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    @Override
    public String toString() {
        return super.toString() + this.cnpj;
    }

}
