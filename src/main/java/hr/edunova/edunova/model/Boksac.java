/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Nino
 */
@Entity
public class Boksac extends Entitet{
    
    private String ime;
    
    private String prezime;
    
    private String oib;
    
    @ManyToOne
    private Kategorija kategorija;
    
    private Date datumRodenja;
    
    @ManyToOne
    private Trener trener;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }

    public Date getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(Date datumRodenja) {
        this.datumRodenja = datumRodenja;
    }

    public Trener getTrener() {
        return trener;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }


    @Override
    public String toString() {
        return this.ime +" "+ this.prezime;
    }
    
    
    
    
    
    
    
    
}
