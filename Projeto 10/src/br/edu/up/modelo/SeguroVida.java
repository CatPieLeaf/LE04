package br.edu.up.modelo;

import java.time.LocalDate;

public class SeguroVida extends Seguro {
    private boolean cobraDoenca;
    private boolean cobraAcidente;
    public SeguroVida(String apolice, Segurado segurado, double vlrApolice, LocalDate dtaInicio, LocalDate darFim, boolean cobraDoenca, boolean cobraAcidente) {
        super(apolice, segurado, vlrApolice, dtaInicio, darFim);
        this.cobraAcidente = cobraAcidente;
        this.cobraDoenca = cobraDoenca;
    }
    public boolean isCobraDoenca() {
        return cobraDoenca;
    }
    public void setCobraDoenca(boolean cobraDoenca) {
        this.cobraDoenca = cobraDoenca;
    }
    public boolean isCobraAcidente() {
        return cobraAcidente;
    }
    public void setCobraAcidente(boolean cobraAcidente) {
        this.cobraAcidente = cobraAcidente;
    }
    
    
}
