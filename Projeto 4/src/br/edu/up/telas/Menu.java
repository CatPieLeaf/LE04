package br.edu.up.telas;

import br.edu.up.controles.*;
import br.edu.up.telas.*;
import br.edu.up.modelos.*;

import java.util.Scanner;

public class Menu {
    private ControleDeCarro controle;
    private ModeloDeCarro[] modelo = new ModeloDeCarro[10];
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {

            System.out.println("1: colocar carro");
            System.out.println("2: tirar carro");
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    colocarCarro();
                    break;
                case 2:
                    tirarCarro();
                default:
                    break;
            }
            scanner.close();
        }
    }

    public void colocarCarro() {
        for (int i = 0; i < modelo.length; i++) {
            if (modelo[i] == null) {
                modelo[i] = new ModeloDeCarro(null, null, null);
                // mew
                System.out.println("me diga a placa do carro");
                modelo[i].setPlaca(scanner.nextLine());
                System.out.println("me diga o modelo do carro");
                modelo[i].setModelo(scanner.nextLine());
                System.out.println("me diga a cor do carro");
                modelo[i].setCor(scanner.nextLine());
                break;
            }
        }
        controle = new ControleDeCarro(modelo);
        // mew
    }

    public void tirarCarro() {
        System.out.println(modelo);
    }
}
