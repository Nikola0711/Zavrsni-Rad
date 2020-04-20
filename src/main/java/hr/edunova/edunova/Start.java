/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova;

import hr.edunova.edunova.util.HibernateUtil;
import hr.edunova.edunova.util.Pomocno;
import hr.edunova.edunova.view.SplashScreen;

/**
 *
 * @author Polaznik
 */
public class Start {
    
    public Start(){
        new SplashScreen().setVisible(true);
        //Pomocno.PocetniInsert();
    }
    
    public static void main(String[] args) {
        new Start();
    }
}
