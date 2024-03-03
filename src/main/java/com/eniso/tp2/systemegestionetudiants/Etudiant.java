/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author HP
 */
public class Etudiant {
    private String Nom;
    private String Prenom;
    private String Email;
    private int NumeroInscription;
    
    public Etudiant(String Nom, String Prenom, String Email, int NumeroInscription)
    {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email = Email;
        this.NumeroInscription = NumeroInscription;
    }
    
    public String getEtudiantNom()
    {
        return this.Nom;
    }
    
    public String getEtudiantPrenom()
    {
        return this.Prenom;
    }
    
    public String getEtudiantEmail()
    {
        return this.Email;
    }
    
    public int getEtudiantNumeroInscription()
    {
        return this.NumeroInscription;
    }
    
    public void setEtudiantNom(String Nom)
    {
        this.Nom = Nom; 
    }
    
    public void setEtudiantPrenom(String Prenom)
    {
        this.Prenom = Prenom;
    }
    
    public void setEtudiantEmail(String Email)
    {
        this.Email = Email;
    }
    
    public void setEtudiantNumeroInscription(int NumeroInscription)
    {
        this.NumeroInscription = NumeroInscription;
    }
    
    public void afficherEtudiant(){
        System.out.println("Nom : "+this.Nom+" Prenom : "+this.Prenom+" Num Inscription : "+this.NumeroInscription+" Email : "+this.Email);
    }
    
    
    
    
    
    
}
