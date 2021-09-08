package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reserva implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date checkIn;
    @Temporal(TemporalType.DATE)
    private Date checkOut;
   

    public Reserva() {
    }

    public Reserva(Date checkIn, Date checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

 
    
}
