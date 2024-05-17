import br.edu.up.util.Prompt;
import br.edu.up.modelo.Ponto;

public class Programa {
    public static void main(String[] args) throws Exception {
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2,5);
        Prompt.imprimir("Posição ponto1: " + ponto1.getX() + "," + ponto1.getY());
        Prompt.imprimir("Posição ponto2: " + ponto2.getX() + "," + ponto2.getY());
        Prompt.imprimir("Distância do ponto 1 ao ponto 2: " + ponto1.calcularDistancia(ponto2));
        Prompt.imprimir("Distância do ponto 2 ás coordenadas 7,2: " + ponto2.calcularDistancia(7,2));
        ponto1.setX(10);
        ponto1.setY(3);
        Prompt.imprimir("Novas coordenadas do ponto 1: " + ponto1.getX() + "," + ponto1.getY());
    }
}
