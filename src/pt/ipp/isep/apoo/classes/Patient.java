/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.classes;

/**
 *
 * @author João Gomes
 */
public class Patient {
    
    
     /**
     * Nome 
     */
    private String name;

     /**
     * Sexo
     */
    private String gender;

     /**
     * Data de nascimento
     */
    private String dateOfBirth;

     /**
     *  Numero de utente
     */
    private int patientNumber ;

     /**
     * Numero de telemovel
     */
    private int phoneNumber ;

    public Patient() {

    }

    /**
     * 
     * Metedo que permite criar um novo paciente
     * 
     * @param name
     * @param gender
     * @param dateOfBirth
     * @param patientNumber
     * @param phoneNumber 
     */
    public Patient(
            String name, 
            String gender,
            String dateOfBirth,
            int patientNumber,
            int phoneNumber
        ) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.patientNumber = patientNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    


}