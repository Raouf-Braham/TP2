/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.tp2.systemegestionetudiants;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SystemeGestionEtudiants
{
    public ArrayList <Etudiant> list;
    
    public SystemeGestionEtudiants()
    {
        this.list = new ArrayList();
    }
    
    public void ajouterEtudiant(String nom, String prenom, int numeroInscription, String email)
    {
        Etudiant e = new Etudiant(nom, prenom, email, numeroInscription);
        list.add(e);
    }
    
    public void afficherEtudiants()
    {
        for(Etudiant e : list)
            e.afficherEtudiant();
    }
    
    public void modifierEmailEtudiant(int numeroInsciption, String nouvelEmail)
    {
        for(Etudiant e : list)
        {
            
            if(e.getEtudiantNumeroInscription() == numeroInsciption)
            {
                e.setEtudiantEmail(nouvelEmail);
            }
        }
    }
    
    public void supprimerEtudiant(int numeroInscription)
    {
        int pos = 0;
        boolean test = false;
        
        for(Etudiant e : list)
        {
            
            if(e.getEtudiantNumeroInscription() == numeroInscription)
            {
                test = true;
                break;
                
            }
            
            else
            {
                pos++;
            }

        }
        
        if(test)
            list.remove(pos);
    }
    
    public static void main(String[] args)
    {
        SystemeGestionEtudiants S = new SystemeGestionEtudiants();
        Scanner read = new Scanner(System.in);
        
        System.out.println("Donner Le Nombre Des Etudiants : ");
        int n = read.nextInt(); 
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Saisie des donnees de l'etudiant "+(i+1)+" : ");
 
            System.out.println("Nom : ");
            String nom = read.next();
            
            System.out.println("Prenom : ");
            String prenom = read.next();
            
            System.out.println("Numero Inscription : ");
            int numInscription = read.nextInt();
            
            System.out.println("Email : ");
            String email = read.next();
            
            S.ajouterEtudiant(nom, prenom, numInscription, email);
            
        }
        
        S.afficherEtudiants();
        
        System.out.println("Donner le numero d'inscription de l'etudiant pour changer l'email : ");
        int Incription = read.nextInt();
        
        System.out.println("Donner le nouveau email : ");
        String NouvelEmail = read.next();
        
        S.modifierEmailEtudiant(Incription, NouvelEmail);
        
        System.out.println("Donner le numero d'inscription de l'etudiant a supprimer : ");
        Incription = read.nextInt();
        S.supprimerEtudiant(Incription);
        
        System.out.println("Nouvelle Liste : ");
        S.afficherEtudiants();
    }
          
       
}
