package br.edu.up.tela;
import br.edu.up.modelo.*;
public class View {
    public static void viewOptions(){
        System.out.printf("Bem vindo a bibliotéca Santo Paulinho.\nQual atividade você gostaria de realizar?");
        System.out.printf("\n1)Pegar Livro01\n2)Pegar Livro02\n3)Pegar um livro aleatório\n");
    }
    public static void option (int opt){
        switch (opt) {
            case 1:
                System.out.println("\nTitulo: "+Library.livros[0].getTitulo()+"\nCódigo: "+Library.livros[0].getCodigo()+"\nAutores: "+Library.livros[0].getAutores()+"\nISBN: "+Library.livros[0].getIsbn()+"\nAno: "+Library.livros[0].getAno()+"\n");
                break;
            case 2:
                System.out.println("\nTitulo: "+Library.livros[1].getTitulo()+"\nCódigo: "+Library.livros[1].getCodigo()+"\nAutores: "+Library.livros[1].getAutores()+"\nISBN: "+Library.livros[1].getIsbn()+"\nAno: "+Library.livros[1].getAno()+"\n");
                break;   
            default:
                System.out.println("Esta ação não existe");
                break;
        }
    }

}
