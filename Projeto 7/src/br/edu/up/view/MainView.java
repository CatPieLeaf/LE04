package br.edu.up.view;
import br.edu.up.models.*;
import br.edu.up.controller.*;

import java.util.ArrayList;
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

    public void insertDisciplina(){

    }

    public void newProfessor(){
        System.out.printf("nome do professor: ");
        String nome = input.nextLine();
        System.out.printf("RG do professor: ");
        int rg = input.nextInt();
        System.out.printf("Matricula do professor: ");
        int matricula = input.nextInt();
        System.out.printf("Id Lattes do professor: ");
        int idLattes = input.nextInt();
        System.out.printf("Titulo do professor: ");
        Titulo titulo;
        System.out.printf("Disciplina no qual ele ensina: ");
        Disciplina disciplina;
        
        // new Professor(String nome, int rg, int matricula, int idLattes, Titulo titulo, Disciplina disciplinas)
    }

    public void newDisciplina(){
        System.out.printf("nome da disciplina: ");
        String nome = input.nextLine();
        System.out.printf("Id da disciplina: ");
        int id = input.nextInt();
        System.out.printf("Quantas competências NECESARIAS a matéria possui?: ");
        int quantidade1 = input.nextInt();

        ArrayList<String> competenciasNecessarias = new ArrayList<String>();
        
        for (int index = 0; index < quantidade1; index++) {   
            System.out.printf("Adicione uma competência NECESARIA ao curso: ");     
            competenciasNecessarias.add(input.nextLine());
        }
        
        System.out.printf("Quantas competências COMPLEMENTARES a matéria possui?: ");
        int quantidade2 = input.nextInt();

        ArrayList<String> competenciaComplementares = new ArrayList<String>();
        
        for (int index = 0; index < quantidade2; index++) {   
            System.out.printf("Adicione uma competência COMPLEMENTAR ao curso: ");     
            competenciaComplementares.add(input.nextLine());
        }
        
        System.out.printf("Qual o Curriculo da matéria?: ");
        String curriculo = input.nextLine();

        // (String nome, int id, ArrayList<String> competenciasNecessarias, ArrayList<String> competenciaComplementares, String curriculo)
        //Adicionar no minimo 1 professor e 1 aluno a disciplina
    }

    public void newAluno(){
        
        System.out.printf("nome do Aluno: ");
        String nome = input.nextLine();
        System.out.printf("RG do Aluno: ");
        int rg = input.nextInt();
        System.out.printf("Matricula do Aluno: ");
        int matricula = input.nextInt();
        System.out.printf("Ano de Ingresso do Aluno: ");
        int anoIngresso = input.nextInt();
        System.out.printf("Nome do curso do Aluno: ");
        String nomeCurso = input.nextLine();
        System.out.printf("Turno no qual o aluno estuda: ");
        String turno = input.nextLine();
        System.out.printf("Disciplina no qual ele estuda: ");
        Disciplina disciplina;
        System.out.printf("quantas competências o aluno possui?: ");
        int quantidade = input.nextInt();
        if (quantidade > 1) {
            String[] competencia = new String[quantidade];
            for (int i = 0; i < quantidade; i++) {
                System.out.printf("Qual a competencia n° "+(i+1)+" do aluno?: ");
                competencia[i] = input.nextLine();   
            }   
        } else if(quantidade == 0){ 
            System.out.printf("Por favor insira no minimo uma competência ao aluno");
        } else {
            //competencia = 1
            System.out.printf("Qual a competencia do aluno?: ");
            String competencia = input.nextLine();
        }
        //  Aluno(String nome, int rg, int matricula, int anoIngresso, String nomeCurso, String turno, ArrayList<Disciplina> disciplina, ArrayList<String> competencia)

    }

    public void showProfessor(){

    }

    public void showDisciplina(){

    }

    public void showAluno(){

    }


}
