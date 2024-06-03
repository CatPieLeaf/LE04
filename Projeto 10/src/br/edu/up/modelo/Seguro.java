package br.edu.up.modelo;

import java.time.LocalDate;

public abstract class Seguro {
    String apolice;
    Segurado segurado;
    double VlrApolice;
    LocalDate dtaInicio;
    LocalDate darFim;

    public Seguro(String apolice, Segurado segurado, double vlrApolice, LocalDate dtaInicio, LocalDate darFim) {
        this.apolice = apolice;
        this.segurado = segurado;
        VlrApolice = vlrApolice;
        this.dtaInicio = dtaInicio;
        this.darFim = darFim;
    }

    public String getApolice() {
        return apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public Segurado getSegurado() {
        return segurado;
    }

    public void setSegurado(Segurado segurado) {
        this.segurado = segurado;
    }

    public double getVlrApolice() {
        return VlrApolice;
    }

    public void setVlrApolice(double vlrApolice) {
        VlrApolice = vlrApolice;
    }

    public LocalDate getDtaInicio() {
        return dtaInicio;
    }

    public void setDtaInicio(LocalDate dtaInicio) {
        this.dtaInicio = dtaInicio;
    }

    public LocalDate getDarFim() {
        return darFim;
    }

    public void setDarFim(LocalDate darFim) {
        this.darFim = darFim;
    }

}
