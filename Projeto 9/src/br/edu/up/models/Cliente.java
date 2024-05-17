package br.edu.up.models;

public abstract class Cliente {
    private String name, telefone, email;
    private Endereco endereco;
    private double vlrMaxCredito, vlrEmprestado, saldo;
    //
    public double getSaldo()
    {
        return saldo;
    }

    public void emprestar(double valor)
    {

    }

    public double devolver(double valor)
    {
        return valor;
    }
// ------------------
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public double getVlrMaxCredito() {
        return vlrMaxCredito;
    }
    public void setVlrMaxCredito(double vlrMaxCredito) {
        this.vlrMaxCredito = vlrMaxCredito;
    }
    public double getVlrEmprestado() {
        return vlrEmprestado;
    }
    public void setVlrEmprestado(double vlrEmprestado) {
        this.vlrEmprestado = vlrEmprestado;
    }
    
}
