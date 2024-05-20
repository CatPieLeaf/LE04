package br.edu.up.view;

import br.edu.up.controller.ControleEstande;
import br.edu.up.model.Livro;
import br.edu.up.util.Prompt;

public class Menu {

    ControleEstande control = new ControleEstande();
    Livro[] livros = new Livro[5];

    // Método para executar o menu da estante de livros
    public void run() {
        // Mensagem inicial
        int state = 1;
        while (state == 1) {
            System.out.println("\nEm uma estante de livros tem 5 modulares   ");
            System.out.println(colored(15, 195, 255, "-------------------------------------------"));
            System.out.println(colored(15, 195, 255, "| " + "[Push] = Inserir livro                  |"));
            System.out.println(colored(15, 195, 255, "| " + "[Pop] = Remover livro                   |"));
            System.out.println(colored(15, 195, 255, "| " + "[Peek] = Visualizar livro               |"));
            System.out.println(colored(15, 195, 255, "| " + "[Listar] = Listar todos os livros       |"));
            System.out.println(colored(15, 195, 255, "| " + "[Sair] = Encerrar                       |"));
            System.out.println(colored(15, 195, 255, "-------------------------------------------"));
            // Instanciação do controle da estante e do scanner

            // Leitura da escolha do usuário
            String escolha = Prompt.lerLinha().toLowerCase();;

            switch (escolha) {
                case "push":
                    colocarLivros();
                    break;
                case "pop":
                    removerLivros();
                    break;
                case "peek":
                    visualizarLivros();
                    break;
                case "pistar":
                    listarLivros();
                    break;
                default:
                    state = 0;
                    break;
            }
        }
    }

    public void listarLivros() {
        for (int i = 0; i < 5; i++) {
            if (livros[i] != null) {
                Prompt.imprimir(colored(255, 0, 0, "-------------------------------------------------------"));
                Prompt.imprimir("Autores = " + livros[i].getAutores() + "  Titulo = " + livros[i].getTitulo()
                    + "  Codigo = " + livros[i].getCodigo() + "  Ano = " + livros[i].getAno() + "  ISBN = "
                    + livros[i].getIsbn());
                Prompt.imprimir(colored(255, 0, 0, "-------------------------------------------------------"));
            } else {
                Prompt.imprimir(colored(255, 0, 0, "-------------------------------------------------------"));
                Prompt.imprimir("Não há um livro na posição " + (i+1));
                Prompt.imprimir(colored(255, 0, 0, "-------------------------------------------------------"));
            }
        }
    }

    public void colocarLivros() {
        for (int i = 0; i < 5; i++) {
            if (livros[i] == null) {
                String titulo = Prompt.lerLinha("Insira o titulo do livro");

                String autores = Prompt.lerLinha("Insira os autores do livro: ");

                String codigo = Prompt.lerLinha("Insira o código do livro: ");

                int ano = Prompt.lerInteiro("Insira o ano do livro: ");

                String isbn = Prompt.lerLinha("Insira o ISBN do livro: ");

                livros[i] = new Livro(codigo, titulo, autores, isbn, ano);
                System.out.println("Livro inserido:");
                System.out.println(livros[i].getAno());
                break;
            }
        }
        control.setLivros(livros);
        limpar();
    }

    public void removerLivros() {
        for (int i = livros.length - 1; i >= 0; i--) {
            if (livros[i] != null) {
                livros[i] = null;
                Prompt.imprimir("Livro removido com sucesso!");
                break;
            }
        }
        limpar();
    }

    public void visualizarLivros() {
        int escolha = Prompt.lerInteiro("Escolha qual livro você gostaria de visualizar (1 a 5)");
        limpar();
        if (escolha > 5) Prompt.imprimir("O limite é de 1 a 5");
        else if(livros[escolha-1] == null) Prompt.imprimir("Livro não encontrado!");
        else {
            Prompt.imprimir(colored(255, 0, 0, "-------------------------------------------------------"));
            Prompt.imprimir("Autores = " + livros[escolha-1].getAutores() + "  Titulo = " + livros[escolha-1].getTitulo()
                + "  Codigo = " + livros[escolha-1].getCodigo() + "  Ano = " + livros[escolha-1].getAno() + "  ISBN = "
                + livros[escolha-1].getIsbn());
            Prompt.imprimir(colored(255, 0, 0, "-------------------------------------------------------"));
        }
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

    public static String colored(int r, int g, int b, String text) {
        r = Math.max(0, Math.min(r, 255));
        g = Math.max(0, Math.min(g, 255));
        b = Math.max(0, Math.min(b, 255));
        return String.format("\033[38;2;%d;%d;%dm%s\033[0m", r, g, b, text);
    }

    public static String colored(int r, int g, int b, String text, int rb, int gb, int bb) {
        r = Math.max(0, Math.min(r, 255));
        g = Math.max(0, Math.min(g, 255));
        b = Math.max(0, Math.min(b, 255));
        rb = Math.max(0, Math.min(rb, 255));
        gb = Math.max(0, Math.min(gb, 255));
        bb = Math.max(0, Math.min(bb, 255));
        return String.format("\033[38;2;%d;%d;%dm\033[48;2;%d;%d;%dm%s\033[0m", r, g, b, rb, gb, bb, text);
    }
}
