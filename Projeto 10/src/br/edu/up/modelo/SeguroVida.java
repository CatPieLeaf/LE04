package br.edu.up.modelo;

import java.time.LocalDate;

public class SeguroVida extends br.edu.up.modelo.Seguro {

    public SeguroVida(String apolice, Segurado segurado, double vlrApolice, LocalDate dtaInicio, LocalDate darFim) {
        super(apolice, segurado, vlrApolice, dtaInicio, darFim);
    }

}
