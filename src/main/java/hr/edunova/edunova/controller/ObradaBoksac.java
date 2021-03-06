/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova.controller;

import hr.edunova.edunova.model.Boksac;
import hr.edunova.edunova.util.EdunovaException;
import hr.edunova.edunova.util.Pomocno;
import java.util.List;

/**
 *
 * @author Nino
 */
public class ObradaBoksac extends Obrada<Boksac>{

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaOib();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    @Override
    public List<Boksac> getPodaci() {
        return session.createQuery("from Boksac").list();
    }

    @Override
    protected void nakonSpremanja() throws EdunovaException {
       
    }
    
    private void kontrolaOib() throws EdunovaException{
        if(!Pomocno.isOibValjan(entitet.getOib())){
            throw new EdunovaException("OIB nije valjan");
        }
    }
    
    public List<Boksac> getPodaci(String uvjet){
        return session.createQuery("from Boksac b "
                + " where concat(b.ime, ' ', b.prezime) like :uvjet "
                + " or concat(b.prezime, ' ', b.ime) like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20).list();
    }
<<<<<<< HEAD
    
=======
>>>>>>> e1c9dbcc7bfe25ca452da83181d277b750753113
}
