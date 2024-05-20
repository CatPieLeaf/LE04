package br.edu.up.telas;

import br.edu.up.controles.*;
import br.edu.up.telas.*;
import br.edu.up.modelos.*;
import br.edu.up.util.Prompt;

public class Menu {
    private ControleDeCarro controle;
    private ModeloDeCarro[] modelo = new ModeloDeCarro[10];

    public void run() {
        while (true) {
            System.out.println("1: colocar carro");
            System.out.println("2: tirar carro");
            int escolha = Prompt.lerInteiro();
            switch (escolha) {
                case 1:
                    colocarCarro();
                    break;
                case 2:
                    tirarCarro();
                default:
                    break;
            }
        }
    }

    public void colocarCarro() {
        for (int i = 0; i < modelo.length; i++) {
            if (modelo[i] == null) {
                modelo[i] = new ModeloDeCarro(null, null, null);
                // Nyaw
                modelo[i].setPlaca(Prompt.lerLinha("Insira a placa do carro"));
                modelo[i].setModelo(Prompt.lerLinha("Insira o modelo do carro"));
                modelo[i].setCor(Prompt.lerLinha("Insira a cor do carro"));
                break;
            }
        }
        controle = new ControleDeCarro(modelo);
        // Mreow
    }

    public void tirarCarro() {
        System.out.println(modelo);
    }
}
