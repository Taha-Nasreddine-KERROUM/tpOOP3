package p3;

import p1.*;
import p2.*;
import p4.*;

public class Principale {
    public static void main(String[] args) {
        Complexe c1 = new Complexe(3, 4);
        Complexe c2 = new Complexe(1, -2);
        Complexe c3 = new Complexe(c1);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 copie de c1 = " + c3);

        System.out.println("c1 equals c3: " + c1.equals(c3));
        System.out.println("c1 equals c2: " + c1.equals(c2));

        Complexe somme = c1.add(c2);
        Complexe difference = c1.sub(c2);
        Complexe conjugue = c1.conjugate();

        System.out.println("Somme de c1 et c2 = " + somme);
        System.out.println("Difference de c1 et c2 = " + difference);
        System.out.println("Conjugue de c1 = " + conjugue);

        Complexe sommeStatique = IOperation.sum(c1, c2);
        System.out.println("Somme statique de c1 et c2 = " + sommeStatique);

        c1.display(c1);
        c2.display(c2);
        
        Reel r1 = new Reel(3);
        Reel r2 = new Reel(-2);
        Reel r3 = new Reel(r1);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 copie de r1 = " + r3);

        System.out.println("r1 equals r3: " + r1.equals(r3));
        System.out.println("r1 equals r2: " + r1.equals(r2));
 
        
        System.out.println("Somme de r1 et r2 = " + r1.add(r2));
        System.out.println("Difference de r1 et r2 = " + r1.sub(r2));
        System.out.println("Conjugue de r1 = " + r1.conjugate());

        System.out.println("Somme statique de r1 et r2 = " + IOperation.sum(r1, r2));

        r1.display(r1);
        r2.display(r2);
        
        ListeNombre liste = new ListeNombre();
        
        liste.ajouter(c1);
        liste.ajouter(c2);
        liste.ajouter(r1);
        liste.ajouter(r2);
        
        System.out.println("liste: ");
        
        ListeNombre liste2 = new ListeNombre();
        
        liste2.ajouter(c1);
        liste2.ajouter(c2);
        liste2.ajouter(r1);
        liste2.ajouter(r2);
        
        System.out.println("liste1 et 2 equals?: " + liste.equals(liste2));
    }
}
