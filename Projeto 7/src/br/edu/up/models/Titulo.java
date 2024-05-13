package br.edu.up.models;

public class Titulo {
    private String nome_Instituicao, nome_Titulo_Obtido, titulo_Trabalho_Conclusao;
    private int ano_conclusao;
    
    public Titulo(String nome_Instituicao, String nome_Titulonome_Titulo_Obtido, String titulo_Trabalho_Conclusao, int ano_conclusao){
        this.setAno_conclusao(ano_conclusao);
        this.setNome_Instituicao(nome_Instituicao);
        this.setNome_Titulo_Obtido(nome_Titulonome_Titulo_Obtido);
        this.setTitulo_Trabalho_Conclusao(titulo_Trabalho_Conclusao);
    }

    public String getNome_Instituicao() {
        return nome_Instituicao;
    }
    public void setNome_Instituicao(String nome_Instituicao) {
        this.nome_Instituicao = nome_Instituicao;
    }
    public String getNome_Titulo_Obtido() {
        return nome_Titulo_Obtido;
    }
    public void setNome_Titulo_Obtido(String nome_Titulo_Obtido) {
        this.nome_Titulo_Obtido = nome_Titulo_Obtido;
    }
    public String getTitulo_Trabalho_Conclusao() {
        return titulo_Trabalho_Conclusao;
    }
    public void setTitulo_Trabalho_Conclusao(String titulo_Trabalho_Conclusao) {
        this.titulo_Trabalho_Conclusao = titulo_Trabalho_Conclusao;
    }
    public int getAno_conclusao() {
        return ano_conclusao;
    }
    public void setAno_conclusao(int ano_conclusao) {
        this.ano_conclusao = ano_conclusao;
    }

}
