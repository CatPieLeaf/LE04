package br.edu.up.models;

public class ClienteEmpresa extends Cliente {
    private String cnpj, inscEstadual;
    private int anoFundacao;
//Super constructor
    public ClienteEmpresa(double credito){

    }

    public double getSaldo(){
        return super.getSaldo();
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscEstadual() {
        return inscEstadual;
    }
    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }
    public int getAnoFundacao() {
        return anoFundacao;
    }
    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    
}
