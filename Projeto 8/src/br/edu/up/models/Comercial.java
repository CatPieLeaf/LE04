package br.edu.up.models;

public class Comercial extends Contato {
    private String cnpj;

    public Comercial(int codigo, String nome, String telefone, String cnpj)//?????
    {
        this.setCnpj(cnpj);
        super.setCodigo(codigo);
        super.setNome(nome);
        super.setTelefone(telefone);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    @Override
    public String toString() {
        return super.getCodigo() + '\n' + super.getNome() + '\n' + super.getTelefone() +'\n' + this.cnpj;
    }

}
