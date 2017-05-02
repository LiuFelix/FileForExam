package perso;

/**
 * Created by FatePc on 5/2/2017.
 */
public class Main {
    public static void main() {
        Personne student = new Etudiant("paul", 20, 18.0f);

        Personne enseignant = new Enseignant("jacque",42,20);

        System.out.println(student + " " + enseignant);
    }
}
