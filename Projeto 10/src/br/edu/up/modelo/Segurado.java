package br.edu.up.modelo;

public class Segurado {
    private String nome;
    private String RG;
    private String sexo;
    private String telefone;
    private String endereço;
    private String CEP;
    private String Cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public Segurado(String nome, String rG, String sexo, String telefone, String endereço, String cEP, String cidade) {
        this.nome = nome;
        RG = rG;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereço = endereço;
        CEP = cEP;
        Cidade = cidade;
    }

}
