package br.edu.up.view;
import br.edu.up.models.*;
import br.edu.up.controller.*;
import java.util.Scanner;
public class MainView {
    private Scanner input = new Scanner(System.in);
    public void run(){
        Menu();
    }
    public void Menu(){
        System.out.println("------------------GUIA DE USO---------------------");
        System.out.println("| primeiramente adicione 1 ou mais disciplinas   |");
        System.out.println("| então adicione 1 ou mais professores           |");
        System.out.println("| por fim adicione 1 ou mais alunos              |");
        System.out.println("--------------------------------------------------\n\n");

        System.out.println("----------------------OPÇÕES----------------------");
        System.out.println("| 1) fazer cadastro de professores               |");
        System.out.println("| 2) fazer cadastro de disciplinas               |");
        System.out.println("| 3) fazer cadastro de alunos                    |");
        System.out.println("| 4) mostrar professores                         |");
        System.out.println("| 5) mostrar disciplinas                         |");
        System.out.println("| 6) mostrar alunos                              |");
        System.out.println("--------------------------------------------------");

        int value = input.nextInt();
        switch (value) {
            case 1:
                newProfessor();
                break;
            case 2:
                newDisciplina();
                break;
            case 3:
                newAluno();
                break;
            case 4:
                showProfessor();
                break;
            case 5:
                showDisciplina();
                break;
            case 6:
                showAluno();
                break;
            default:
                System.out.println("Opção indisponivel, fechando sistema...");
                break;
        }
    }

    public void newProfessor(){
        System.out.printf("nome: ");
        String nome = input.nextLine();
    
        // public Professor(String nome, int rg, int matricula, int idLattes, Titulo titulo, Disciplina disciplinas)
    }

    public void newDisciplina(){

    }

    public void newAluno(){

    }

    public void showProfessor(){

    }

    public void showDisciplina(){

    }

    public void showAluno(){

    }


}
