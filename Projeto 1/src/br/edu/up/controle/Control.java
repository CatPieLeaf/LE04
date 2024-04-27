package br.edu.up.controle;
import br.edu.up.modelo.*;

public class Control {
    private static String[] autoresL1 = {"Cay S. Horstmann","Gary Cornell"}, autoresL2 = {"Harvey Deitel"};
    private static Livro[] livros = 
    {new Livro("Core Java 2", "1598FHK", autoresL1, "0130819336", 2005),
    new Livro("Java, Como programar", "9865PLO", autoresL2, "0130341517", 2015)};

    public Control(){}

    public Livro[] getLivros() {
        return livros;
    }
    public String[] getAutoresL1() {
        return autoresL1;
    }
    public static String[] getAutoresL2() {
        return autoresL2;
    }
}
