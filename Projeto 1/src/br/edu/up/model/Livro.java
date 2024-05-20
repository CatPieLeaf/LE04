package br.edu.up.model;

public class Livro {
    
    //Modelos conversam entre si.
    private String codigo, titulo, isbn;
    private int ano;
    private String[] autores;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public Livro(String titulo, String codigo, String[] autores, String isbn, int ano){
        this.titulo = titulo;
        this.codigo = codigo;
        this.autores = autores;
        this.isbn = isbn;
        this.ano = ano;
    }
}
