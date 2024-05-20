package br.edu.up.controller;

import br.edu.up.modelos.Livro;

public class ControleEstande {

    private Livro[] livros;

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

}
