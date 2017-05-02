package perso;

import perso.chercheur.IChercheur;
import perso.chercheur.Publication;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by FatePc on 5/2/2017.
 */
public class EnseignantChercheur extends Enseignant implements IChercheur {
    AbstractList<Publication> listPublications;

    public EnseignantChercheur(String nom, int age, int heures) {
        super(nom, age, heures);
        listPublications  = new ArrayList<>();
    }

    @Override
    public void ajouterPublication(Publication p) {
        listPublications.add(p);
    }

    @Override
    public String listerPublications() {
        String tmp = "";
        for (Publication p: listPublications
             ) {
            tmp += p;
        }
        return tmp;
    }

    @Override
    public String toString() {
        return super.toString() + listPublications;
    }
}
