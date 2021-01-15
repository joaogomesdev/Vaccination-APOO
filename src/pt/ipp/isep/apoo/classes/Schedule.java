/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.classes;

import pt.ipp.isep.apoo.classes.*;
/**
 *
 * @author João Gomes
 */
public class Schedule {
    
    
    private VaccinationLocation vaccinationLocation;
    private String date;
    private String time;
    private Nurse nurse;
    private Patient patient;
    private Vaccine vacccine;
    
    
    
    /**
     * Metodo contrutor vazio
     */
    public Schedule() {
        
    }
    
    
    /**
     * 
     * Metodo construtor com parametros
     * 
     * @param vaccinationLocation
     * @param date
     * @param time
     * @param nurse
     * @param patient
     * @param vaccine 
     */
    public Schedule(
            VaccinationLocation vaccinationLocation,
            String date,
            String time,
            Nurse nurse,
            Patient patient,
            Vaccine vaccine
        ) {
        
        this.vaccinationLocation = vaccinationLocation;
        this.date = date;
        this.time = time;
        this.nurse = nurse;
        this.patient = patient;
        this.vacccine = vaccine;
        
    }
    
    
}
    
    
    
    
    
   
}