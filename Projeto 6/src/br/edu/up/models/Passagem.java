package br.edu.up.models;
import java.util.Date;
public class Passagem {
    private String classe_do_assento;// é para criar um .class para o assento ou é de nossa interpretação mesmo?
    private int seat_number;
    private Date flightDate;
    //new Date(int year, int month, int date, int hrs, int minutes)

    public Passagem( String classe_do_assento, int seat_number ,Date flightDate){
        this.setClasse_do_assento(classe_do_assento);
        this.setSeat_number(seat_number);
        this.setFlightDate(flightDate);
    }

    public String getClasse_do_assento() {
        return classe_do_assento;
    }

    public void setClasse_do_assento(String classe_do_assento) {
        this.classe_do_assento = classe_do_assento;
    }

    public int getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(int seat_number) {
        this.seat_number = seat_number;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }
    
}
