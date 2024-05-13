package br.edu.up.tela;

import br.edu.up.controle.ControleEstante;
import br.edu.up.modelo.Livro;
import br.edu.up.util.Prompt;

import java.util.Random;

public class Menu {

    private ControleEstante controle = new ControleEstante();

    public Menu() {
    }

    public void runCode() {
        viewOptions();
        userInputOptions();
    }

    public void viewOptions() {
        System.out.printf("Bem vindo a biblioteca.\nO Que você gostaria de fazer?");
        System.out.printf("\n1. Pegar Livro 1\n2. Pegar Livro 2\n3. Pegar um livro aleatório\n");
    }

    public void userInputOptions() {
        int choice = Prompt.lerInteiro();
        Random rand = new Random();
        int x = rand.nextInt(2) + 1;
        switch (choice) {
            case 1:
                optionsOutput(1);
                break;
            case 2:
                optionsOutput(2);
                break;
            case 3:
                optionsOutput(x);
                break;
            default:
                optionsOutput(choice);
                break;
        }
    }

    public void optionsOutput(int option) {
        Livro[] livros = controle.getLivros();
        if (option == 1) {
            System.out.printf("\nTitulo: " + livros[0].getTitulo() + "\nCódigo: " + livros[0].getCodigo()
                    + "\nAutores: " + showAutores(1) + "\nISBN: " + livros[0].getIsbn() + "\nAno: " + livros[0].getAno()
                    + "\n");
        } else if (option == 2) {
            System.out.printf("\nTitulo: " + livros[1].getTitulo() + "\nCódigo: " + livros[1].getCodigo()
                    + "\nAutores: " + showAutores(2) + "\nISBN: " + livros[1].getIsbn() + "\nAno: " + livros[1].getAno()
                    + "\n");
        } else {
            System.out.println("Esta ação não existe");
        }
    }

    public String showAutores(int Index) {
        String[] autores1 = controle.getAutoresL1(), autores2 = controle.getAutoresL2();
        String autores = "";
        if (Index == 1) {
            for (int i = 0; i < autores1.length; i++) {
                if (i != 0)
                    autores += " & ";
                autores += autores1[i];
            }
            limpar();
        } else if (Index == 2) {
            for (int i = 0; i < autores2.length; i++) {
                if (i != 0)
                    autores += " & ";
                autores += autores1[i];
            }
            limpar();
        }

        return autores;

    }

    public static void limpar() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO().start().waitFor();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
