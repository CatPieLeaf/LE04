package br.edu.up.telas;

import br.edu.up.controles.ControleEstande;
import br.edu.up.modelos.Livro;
import java.util.Scanner;

public class Menu {

    ControleEstande control = new ControleEstande();
    Livro[] livros = new Livro[5];

    // Método para executar o menu da estante de livros
    public void run() {
        // Mensagem inicial
        while (true) {
            System.out.println("Em uma estante de livros tem 5 modulares   ");
            System.out.println(colored(15, 195, 255, "-------------------------------------------"));
            System.out.println(colored(15, 195, 255, "| " + "1. Push = inserir livro                  |"));
            System.out.println(colored(15, 195, 255, "| " + "2. Pop = remover livro                   |"));
            System.out.println(colored(15, 195, 255, "| " + "3. Peek = visualizar livro               |"));
            System.out.println(colored(15, 195, 255, "| " + "4. Listar = listar todos os livros       |"));
            System.out.println(colored(15, 195, 255, "| " + "5. Sair                                  |"));
            System.out.println(colored(15, 195, 255, "-------------------------------------------"));
            // Instanciação do controle da estante e do scanner

            Scanner scanner = new Scanner(System.in);

            // Leitura da escolha do usuário
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 999999:
                    sans();
                    break;
                case 1:
                    colocarLivros();
                    break;
                case 2:
                    removerLivros();
                    break;
                case 3:
                    visualizarLivros();
                    break;
                case 4:
                    Livro[] livros = control.getLivros();

                    for (int i = 0; i < 5; i++) {
                        if (livros[i] != null) {
                            String srt = " Título: " + livros[i].getTitulo() + " Autores: " + livros[i].getAutores()
                                    + " Ano: " + livros[i].getAno() + " Código: " + livros[i].getCodigo() + " ISBN: "
                                    + livros[i].getIsbn();
                            System.out.println(srt);
                        } else
                            System.out.println("livro na posiçao " + i + " esta vazio");
                    }
                    break;
                case 5:

                    // Sair do menu
                    break;
                default:
                    break;
            }
            scanner.close();
        }
    }

    public void colocarLivros() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            if (livros[i] == null) {
                System.out.println("me diga qual é o titulo do livro");
                String titulo = scanner.nextLine();

                System.out.println("autores: ");
                String autores = scanner.nextLine();

                System.out.println("codigo: ");
                String codigo = scanner.nextLine();

                System.out.println("ano: ");
                int ano = scanner.nextInt();
                scanner.nextLine();

                System.out.println("isbn: ");
                String isbn = scanner.nextLine();

                livros[i] = new Livro(codigo, titulo, autores, isbn, ano);
                System.out.println("Livro inserido:");
                System.out.println(livros[i].getAno());
                break;
            }
        }
        scanner.close();
        control.setLivros(livros);
        limpar();
    }

    public void removerLivros() {
        for (int i = livros.length - 1; i >= 0; i--) {
            if (livros[i] != null) {
                livros[i] = null;
                break;
            }
        }
        limpar();
    }

    public void visualizarLivros() {
        System.out.println("me diga de 1 a 5 qual livro vc quer ver");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                limpar();
                System.out.println(colored(255, 0, 0, "-------------------------------------------------------"));
                System.out.println("Autores = " + livros[0].getAutores() + "Titulo = " + livros[0].getTitulo()
                        + "   codigo = " + livros[0].getCodigo() + "   ano = " + livros[0].getAno() + "   Isbn = "
                        + livros[0].getIsbn());
                System.out.println(colored(255, 0, 0, "-------------------------------------------------------"));
                break;
            case 2:
                limpar();
                System.out.println(colored(255, 0, 0, "-------------------------------------------------------"));
                System.out.println("Autores = " + livros[1].getAutores() + "Titulo = " + livros[1].getTitulo()
                        + "   codigo = " + livros[1].getCodigo() + "   ano = " + livros[1].getAno() + "   Isbn = "
                        + livros[1].getIsbn());
                System.out.println(colored(255, 0, 0, "-------------------------------------------------------"));
                break;
            case 3:
                limpar();
                System.out.println(colored(255, 0, 0, "-------------------------------------------------------"));
                System.out.println("Autores = " + livros[2].getAutores() + "Titulo = " + livros[2].getTitulo()
                        + "   codigo = " + livros[2].getCodigo() + "   ano = " + livros[2].getAno() + "   Isbn = "
                        + livros[2].getIsbn());
                System.out.println(colored(255, 0, 0, "-------------------------------------------------------"));
                break;
            case 4:
                limpar();
                System.out.println(colored(255, 0, 0, "-------------------------------------------------------"));
                System.out.println("Autores = " + livros[3].getAutores() + "Titulo = " + livros[3].getTitulo()
                        + "   codigo = " + livros[3].getCodigo() + "   ano = " + livros[3].getAno() + "   Isbn = "
                        + livros[3].getIsbn());
                System.out.println(colored(255, 0, 0, "-------------------------------------------------------"));
                break;
            case 5:
                limpar();
                System.out.println(colored(255, 0, 0, "-------------------------------------------------------"));
                System.out.println("Autores = " + livros[4].getAutores() + "Titulo = " + livros[4].getTitulo()
                        + "   codigo = " + livros[4].getCodigo() + "   ano = " + livros[4].getAno() + "   Isbn = "
                        + livros[4].getIsbn());
                System.out.println(colored(255, 0, 0, "-------------------------------------------------------"));
                break;

            default:
                break;

        }
        scanner.close();
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

    public void sans() {
        System.out.println("ze");
    }
}
