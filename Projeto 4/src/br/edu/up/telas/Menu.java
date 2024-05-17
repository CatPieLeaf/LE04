package br.edu.up.telas;

import br.edu.up.controles.*;
import br.edu.up.telas.*;
import br.edu.up.modelos.*;

import java.util.Scanner;

public class Menu {
    public static void run() {
        System.out.println("1: colocar carro");
        System.out.println("2: tirar carro");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                colocarCarro();
                break;

            default:
                break;
        }
    }

    public static void colocarCarro() {
        ModeloDeCarro[] modelo = new ModeloDeCarro[10];
        for (int i = 0; i < modelo.length; i++) {
            Scanner scanner = new Scanner(System.in);
            if (modelo[i] == null) {
                
                break;
            }
        }
    }
}
