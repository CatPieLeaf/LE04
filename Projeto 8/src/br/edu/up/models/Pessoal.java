package br.edu.up.models;

public class Pessoal extends Contato {
    private String aniversario;

    public Pessoal(int codigo, String nome, String telefone, String aniversario)//?????
    {
        this.setAniversario(aniversario);
        super.setCodigo(codigo);
        super.setNome(nome);
        super.setTelefone(telefone);
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
    
    @Override
    public String toString() {
        return super.getCodigo() + '\n' + super.getNome() + '\n' + super.getTelefone() +'\n' + this.cnpj;
    }
}
