/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.edunova.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import hr.edunova.edunova.controller.ObradaOperater;
import hr.edunova.edunova.model.Operater;
import hr.edunova.edunova.view.ViewBoksac;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Nino
 */
public class Pomocno {
    
    public static Operater LOGIRAN;
    
    public static String getNazivAplikacije(){
        return "Edunova APP";
    }
    
    public static boolean isOibValjan(String oib) {
        
        if(oib==null){
            return false;
        }
            
            

        if (oib.length() != 11)
            return false;

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            return false;
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i+1));
            a = a % 10;
            if (a == 0)
                a = 10;
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10)
            kontrolni = 0;

        return kontrolni == Integer.parseInt(oib.substring(10));
    }
    
    public static ViewBoksac.Osoba getgenIP() {
        try {
            Gson gson = new Gson(); 
        Type userListType = new TypeToken<ArrayList<ViewBoksac.Osoba>>(){}.getType();
        URL url = new URL("https://vit.hr/GIP/API/1/json/prvaSlovaVelika");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        List<ViewBoksac.Osoba> lista=gson.fromJson(reader, userListType);;
        return lista.get(0);
         } 
        catch (Exception e) {
            return null;
        }
        
         
        
    }
    
     public static String getGenOIB() {
        
        try{
        URL u = new URL("http://oib.itcentrala.com/oib-generator/");
        InputStream in = u.openStream();
            String s = new String(in.readAllBytes(), 
                    StandardCharsets.UTF_8);
           // System.out.println(s);
            int pocIndex=s.indexOf("<div class=\"oib\"><span>HR</span>")+32;
            // Napredniji rad s html je HTMLCleaner (maven) i pojam xpath
            return s.substring(pocIndex,pocIndex+11);
        }catch(Exception e){
            return "";
        }
        
    }
     
     public static void PocetniInsert(){
         Operater o = new Operater();
        o.setEmail("nikolajuzbasic@gmail.com");
        o.setIme("Nikola");
        o.setPrezime("Juzbasic");
        o.setLozinka(BCrypt.hashpw("n", BCrypt.gensalt()));
        
        
         ObradaOperater obradaOperater = new ObradaOperater(o);
        try {
            obradaOperater.create();
        } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
        }
     }
     
     
    

        
    }
    

