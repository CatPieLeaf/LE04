package br.edu.up.models;

public class Endereco {
    private String rua, numero, bairro, cep;
    private Cidade cidade;

    public Endereco(String rua, String numero, String bairro, String cep, Cidade cidade){
        this.setRua(rua);
        this.setNumero(numero);
        this.setBairro(bairro);
        this.setCep(cep);
        this.setCidade(cidade);
    }


    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString(){
        return " " + this.getRua() + "\n" + this.getNumero() + "\n" + this.getBairro() + "\n" + this.getCep() + "\n" + this.cidade.toString();
    }
}
