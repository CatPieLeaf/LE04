package br.edu.up.modelo;

import java.time.LocalDate;

public class SeguroVeiculo extends Seguro{
    private double VlrFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;
    public SeguroVeiculo(String apolice, Segurado segurado, double vlrApolice, LocalDate dtaInicio, LocalDate darFim, double VlrFranquia, boolean temCarroReserva, boolean cobreVidros) {
        super(apolice, segurado, vlrApolice, dtaInicio, darFim);
        this.VlrFranquia = VlrFranquia;
        this.temCarroReserva = temCarroReserva;
        this.cobreVidros = cobreVidros;
    }



    public double getVlrFranquia() {
        return VlrFranquia;
    }
    public void setVlrFranquia(double vlrFranquia) {
        VlrFranquia = vlrFranquia;
    }
    public boolean isTemCarroReserva() {
        return temCarroReserva;
    }
    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }
    public boolean isCobreVidros() {
        return cobreVidros;
    }
    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }
    
}
