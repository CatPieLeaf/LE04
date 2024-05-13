package br.edu.up.models;
import java.util.ArrayList;
public class Agenda {
    private ArrayList<Contato> contatos;
    public Agenda(){}
    
    public void addCont(Pessoal contatoP){
        
    }

    public void addCont(Comercial contatoC){
        
    }
    //Revisar referencia para ver as funções de um arrayList
    public ArrayList<Contato> getContato() {
        return contatos;
    }

    public void Listar(){
        for (int i = 0; i < this.contatos.size(); i++) {
            // System.out.println();//???
        }
    }
    
}
