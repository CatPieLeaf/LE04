package br.edu.up.telas;

import br.edu.up.controles.*;
import br.edu.up.modelos.*;
import br.edu.up.util.Prompt;

public class Menu {
    private ControleDeCarro controle;
    private ModeloDeCarro[] modelo = new ModeloDeCarro[10];

    public void run() {
        controle = new ControleDeCarro(modelo);
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
                case 3:
                    verTodosOsCarros();
                    break;
            }
        }
    }

    public void colocarCarro() {
        for (int i = 0; i < modelo.length; i++) {
            if (modelo[i] == null) {
                modelo[i] = new ModeloDeCarro(null, null, null);                
                modelo[i].setPlaca(Prompt.lerLinha("Insira a placa do carro"));
                modelo[i].setModelo(Prompt.lerLinha("Insira o modelo do carro"));
                modelo[i].setCor(Prompt.lerLinha("Insira a cor do carro"));
                break;
            }
        }
        controle = new ControleDeCarro(modelo);
    }

    public void verTodosOsCarros() {
        System.out.println("Lista de todos os carros:");
        ModeloDeCarro[] carros = controle.getModelo();
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] != null) {
                System.out.println("Posição " + i + ": Placa: " + carros[i].getPlaca() + ", Modelo: " + carros[i].getModelo() + ", Cor: " + carros[i].getCor());
            }
        }
    }
    public void tirarCarro() {
        ModeloDeCarro[] cars = controle.getModelo();
        System.out.println("me diga a placa do seu carro");
        String tirarCar = Prompt.lerLinha();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getPlaca().equals(tirarCar)) {
                cars[i] = null;
            }
        }
    }
}