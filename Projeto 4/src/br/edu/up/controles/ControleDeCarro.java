package br.edu.up.controles;

import br.edu.up.modelos.*;

public class ControleDeCarro {

    ModeloDeCarro[] modelo;

    public ControleDeCarro(ModeloDeCarro[] modelo) {
        this.modelo = modelo;
    }
    
    public ModeloDeCarro[] getModelo() {
        return modelo;
    }
    
}
