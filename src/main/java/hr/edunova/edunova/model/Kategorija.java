/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova.model;

import javax.persistence.Entity;

/**
 *
 * @author Nino
 */
@Entity
public class Kategorija extends Entitet{
    
    private String naziv;
    private String raspon;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getRaspon() {
        return raspon;
    }

    public void setRaspon(String raspon) {
        this.raspon = raspon;
    }

   

    @Override
    public String toString() {
        return this.naziv;
    }
    
    
    
    
    
    
}
