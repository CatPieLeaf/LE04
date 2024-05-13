package br.edu.up.models;

public abstract class Contato {
    private int codigo;
    private String nome, telefone;
    
    public Contato(int codigo, String nome, String telefone)
    {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setTelefone(telefone);
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return this.codigo + '\n' + this.nome + '\n' + this.telefone +'\n';
    }
}
