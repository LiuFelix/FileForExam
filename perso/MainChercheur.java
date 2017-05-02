package perso;

import perso.chercheur.IChercheur;
import perso.chercheur.Publication;


/**
 * Created by FatePc on 5/2/2017.
 */
public class MainChercheur {
    public static void main(String[] args) {
        // Creation of the objects
        IChercheur chercheur = new EnseignantChercheur("tom", 35,192);
        chercheur.ajouterPublication(new Publication("La conception objet",2003));
        chercheur.ajouterPublication(new Publication("La programmation objet",2004));

        // printing the object attributes
        System.out.println(chercheur);
    }
}
