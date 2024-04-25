package br.edu.up.modelo;

public class Library {
    private static String[] autoresL1 = {"Cay S. Horstmann","Gary Cornell"}, autoresL2 = {"Harvey Deitel"};
    public static Livro[] livros = 
    {new Livro("Core Java 2", "1598FHK", autoresL1, "0130819336", 2005),
    new Livro("Java, Como programar", "9865PLO", autoresL2, "0130341517", 2015)};
}
