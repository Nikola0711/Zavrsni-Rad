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

<<<<<<< HEAD
   

=======
<<<<<<< HEAD
   

=======
<<<<<<< HEAD
   

=======
>>>>>>> f8638fec1a84a5441f66f26273dc874bd17b6b92
>>>>>>> 7b895b298925f13ce8ac150be7d48250d2639c06
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
    @Override
    public String toString() {
        return this.naziv;
    }
    
    
    
    
    
    
}
