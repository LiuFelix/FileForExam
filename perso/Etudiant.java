package perso;

/**
 * Created by FatePc on 5/2/2017.
 */
public class Etudiant extends Personne {

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    private float note;


    public Etudiant(String nom, int age, float note) {
        super(nom, age);
        this.note = note;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "note=" + note +
                '}';
    }
}
