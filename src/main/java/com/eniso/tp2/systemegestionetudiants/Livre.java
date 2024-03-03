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
public class Livre {
    private String Titre;
    private String Auteur;
    public int AnneePublication;
    public int ISBN;
    
    public String getLivreTitre()
    {
        return this.Titre;
    }
    
    public String getLivreAuteur()
    {
        return this.Auteur;
    }
    
    public void setLivreTitre(String Titre)
    {
        this.Titre = Titre; 
    }
    
    public void setLivreAuteur(String Auteur)
    {
        this.Auteur = Auteur;
    }
    
    public void afficherLivre()
    {
        System.out.println("Titre : "+this.Titre+" Auteur : "+this.Auteur+" AnneePublication : "+this.AnneePublication+" ISBN : "+this.ISBN);
    }
    
    public Livre()
    {
        this.Titre = "WWE WRESTLEMANIA 2024";
        this.Auteur = "WWE";
        this.AnneePublication = 2024;
        this.ISBN = 1234;
    }
    
    public Livre(String Titre, String Auteur)
    {
        this.Titre = Titre;
        this.Auteur = Auteur;
        this.AnneePublication = 2024;
        this.ISBN = 1234;
    }
    
    public Livre(String Titre, String Auteur, int AnneePublication)
    {
        this.Titre = Titre;
        this.Auteur = Auteur;
        this.AnneePublication = AnneePublication;
        this.ISBN = 1234;
    }
    
    public Livre(String Titre, String Auteur, int AnneePublication, int ISBN)
    {
        this.Titre = Titre;
        this.Auteur = Auteur;
        this.AnneePublication = AnneePublication;
        this.ISBN = ISBN;
    }
    
    public static void main(String[] args){
        Livre l1=new Livre();
        Livre l2=new Livre("fameux","john");
        Livre l3=new Livre("les miserable","victor",1970);
        Livre l4=new Livre("Goulette","piere",1985,450);
        
        l1.afficherLivre();
        l2.afficherLivre();
        l3.afficherLivre();
        l4.afficherLivre();
        
        
    }
}
