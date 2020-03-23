/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova.controller;

import hr.edunova.edunova.model.Klub;
import hr.edunova.edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Nino
 */
public class ObradaKlub extends Obrada<Klub>{

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
       
    }

    @Override
    public List<Klub> getPodaci() {
        return session.createQuery("from Klub").list();
    }

    @Override
    protected void nakonSpremanja() throws EdunovaException {
       
    }
    
}
