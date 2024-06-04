package br.edu.up.controle;

import br.edu.up.modelo.*;

import java.util.ArrayList; 

public class ControleSeguro {
    ArrayList<SeguroVida> seguroVida = new ArrayList<>();

    public ArrayList<SeguroVida> getSeguroVida() {
        return seguroVida;
    }
    public void setSeguroVida(ArrayList<SeguroVida> SeguroVida) {
        this.seguroVida = SeguroVida;
    }

    ArrayList<SeguroVeiculo> seguroVeiculo = new ArrayList<>();

    public ArrayList<SeguroVeiculo> getSeguroVeiculo() {
        return seguroVeiculo;
    }
    public void setSeguroVeiculo(ArrayList<SeguroVeiculo> seguroVeiculo) {
        this.seguroVeiculo = seguroVeiculo;
    }

    
}
