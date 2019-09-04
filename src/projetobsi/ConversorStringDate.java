/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobsi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Laboratorio
 */
public class ConversorStringDate extends 
        org.jdesktop.beansbinding.Converter<String,Date>{

    private SimpleDateFormat df;
    public ConversorStringDate(){
        df = new SimpleDateFormat("dd/MM/yyyy");
    }
    
    @Override
    public Date convertForward(String s) {
        try{
            return df.parse(s);
        }catch(ParseException e){
            return null;
        }
    }

    @Override
    public String convertReverse(Date t) {
        return df.format(t);
    }
    
}
