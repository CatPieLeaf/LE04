package br.edu.up.models;
import java.util.ArrayList;
public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    public Agenda(){}
    
    public void addCont(Pessoal contatoP){
        this.contatos.add(contatoP);
    }

    public void addCont(Comercial contatoC){
        this.contatos.add(contatoC);
    }
    //Revisar referencia para ver as funções de um arrayList
    public ArrayList<Contato> getContato() {
        return contatos;
    }

    public String Listar(){
        String list = "";
        //Caso queiramos verificar o tipo de uma classe
        // Comercial typeC = new Comercial();
        // Pessoal typeP = new Pessoal();
        // if (contatos.get(i).getClass() == typeP.getClass()){}  
        // else if (contatos.get(i).getClass() == typeC.getClass()) {}
        // Verificar se há jeito melhor de se fazer isso
        for (int i = 0; i < this.contatos.size(); i++) {
            list += "\n" + contatos.get(i).toString() + "\n";
        }
        return list;
    }
    
}
