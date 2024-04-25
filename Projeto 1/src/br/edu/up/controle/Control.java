package br.edu.up.controle;
import br.edu.up.tela.*;
import java.util.Scanner;
import java.util.Random;
public class Control {
    public static void runAction(){
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        Random rand = new Random();
        int x = rand.nextInt(2)+1;
        switch (value) {
            case 1:
                View.option(1);    
                break;
            case 2:
                View.option(2);  
                break;
            case 3:
                View.option(x);
                break;
            default:
                View.option(value);  
                break;
            }
        input.close();
    }
}
