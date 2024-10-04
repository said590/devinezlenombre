package fr.dampierre;

import java.util.Random;

public class NombreAleatoire2 {
    public static void main(String args[]) {

        // génération d'un nombre >= 0 et < 5
        Random r = new Random();
        int n = r.nextInt(100) + 1;
        System.out.println(n);    
    }
}