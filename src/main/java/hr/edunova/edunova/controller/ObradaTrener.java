/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova.controller;

import hr.edunova.edunova.model.Trener;
import hr.edunova.edunova.util.EdunovaException;
import hr.edunova.edunova.util.Pomocno;
import java.util.List;
import org.apache.commons.validator.routines.IBANValidator;

/**
 *
 * @author Nino
 */
public class ObradaTrener extends Obrada<Trener>{

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        kontrolaOib();
        kontrolaIban();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    @Override
    public List<Trener> getPodaci() {
       return session.createQuery("from Trener").list();
    }

    @Override
    protected void nakonSpremanja() throws EdunovaException {
        
    }
    
    private void kontrolaOib() throws EdunovaException{
        if(!Pomocno.isOibValjan(entitet.getOib())){
            throw new EdunovaException("OIB nije valjan");
        }
    }
    
    private void kontrolaIban() throws EdunovaException{
        IBANValidator iv =  IBANValidator.getInstance();
        iv.setValidator("hr", 32, "");
        if(!iv.isValid(entitet.getIban())){
            throw  new EdunovaException("IBAN nije dobar");
        }
    }
}
