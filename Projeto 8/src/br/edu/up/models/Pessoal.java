package br.edu.up.models;

public class Pessoal extends Contato {
    private String aniversario;
    public Pessoal(){}

    public Pessoal(int codigo, String nome, String telefone, String aniversario)//?????
    {
        super(codigo, nome, telefone);
        this.setAniversario(aniversario);
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
    
    @Override
    public String toString() {
        return super.toString() + this.aniversario;
    }
}
