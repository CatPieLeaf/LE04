package br.edu.up.tela;
import br.edu.up.controle.*;
import br.edu.up.modelo.*;

import java.util.Random;
import java.util.Scanner;
public class View {

    
    
    public static void runCode(){
        viewOptions();
        userInputOptions();
    }

    public static void viewOptions(){
        System.out.printf("Bem vindo a bibliotéca Santo Paulinho.\nQual atividade você gostaria de realizar?");
        System.out.printf("\n1)Pegar Livro01\n2)Pegar Livro02\n3)Pegar um livro aleatório\n");
    }

    public static void userInputOptions(){
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        Random rand = new Random();
        int x = rand.nextInt(2)+1;
        
        switch (value) {
            case 1:
                View.optiosOutput(1);    
                break;
            case 2:
                View.optiosOutput(2);  
                break;
            case 3:
                View.optiosOutput(x);
                break;
            default:
                View.optiosOutput(value);  
                break;
            }
        input.close();
    }

    public static void optiosOutput (int opt){
        Livro[] livros = Control.getLivros();
        switch (opt) {
            case 1:
                System.out.printf("\nTitulo: "+livros[0].getTitulo()+"\nCódigo: "+livros[0].getCodigo()+"\nAutores: "+showAutores(1)+"\nISBN: "+livros[0].getIsbn()+"\nAno: "+livros[0].getAno()+"\n");
                break;
            case 2:
                System.out.printf("\nTitulo: "+livros[1].getTitulo()+"\nCódigo: "+livros[1].getCodigo()+"\nAutores: "+showAutores(2)+"\nISBN: "+livros[1].getIsbn()+"\nAno: "+livros[1].getAno()+"\n");
                break;   
            default:
                System.out.println("Esta ação não existe");
                break;
        }
    }
    public static String showAutores(int Index){
        String[] autores1 = Control.getAutoresL1(), autores2 = Control.getAutoresL2();
        String message = "";
        switch (Index) {
            case 1:
                for (int I=0; I < autores1.length; I++) {
                    if (I == autores1.length){
                        message += autores1[I];
                    } else {
                        message += autores1[I] + " & ";
                    }
                }
                break;
            case 2:
                for (int I=0; I < autores2.length; I++) {
                    if (I == autores2.length){
                        message += autores2[I];
                    } else {
                        message += autores2[I] + " & ";
                    }
                }
                break;
        }
    return message;
    }
}
