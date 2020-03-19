/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova.model;

import java.math.BigDecimal;
import javax.persistence.Entity;



/**
 *
 * @author Polaznik
 */
 @Entity
public class Klub extends Entitet{
     
     private String naziv;
     private String adresa;
     private BigDecimal clanarina;
     private Integer brojclanova;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public BigDecimal getClanarina() {
        return clanarina;
    }

    public void setClanarina(BigDecimal clanarina) {
        this.clanarina = clanarina;
    }

    public Integer getBrojclanova() {
        return brojclanova;
    }

    public void setBrojclanova(Integer brojclanova) {
        this.brojclanova = brojclanova;
    }
     
     
    
}
