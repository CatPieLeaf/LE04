package br.edu.up.controle;
import java.util.ArrayList;

import br.edu.up.modelos.*;

public class ControleEventos {
    private ArrayList<Evento> eventos = new ArrayList<>();

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    private ArrayList<Pessoa> pessoa = new ArrayList<>();

    public ArrayList<Pessoa> getPessoa() {
        return pessoa;
    }

    public void setPessoa(ArrayList<Pessoa> pessoa) {
        this.pessoa = pessoa;
    }

    

    
}
