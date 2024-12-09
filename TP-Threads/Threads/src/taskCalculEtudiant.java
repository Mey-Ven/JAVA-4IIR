public class taskCalculEtudiant extends Thread {
    //classe qui represente la tache à effectuer
// la donnée à manipuler (Input)
    Etudiant et;
    public taskCalculEtudiant(Etudiant et) {
        this.et = et;
    }
    public void run() {
// contient l'operation à effectuer
// la donner à manipuler c'est letudiant (prend un etudiant en entrée)
//operation:
        this.et.moyenne = (this.et.note1 + this.et.note2 + this.et.note3 + this.et.note4 +

                this.et.note5 + this.et.note6 )/6;
    }
}