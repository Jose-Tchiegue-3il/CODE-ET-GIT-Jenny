/**
 * Classe permettant de gerer les notes des etudiants
 */
public class GestionnaireNotes {
    /**
     * 
     */
    
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }

        CalculerMoyenne(notes);

 
    /**
     * 
     */
    CalculMoyenne(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }

        
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    }

    }
}
