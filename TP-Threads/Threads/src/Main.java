import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Etudiant et1 = new Etudiant("cne1", "smaili", 14, 12, 11, 9, 20, 12);
        Etudiant et2 = new Etudiant("cne2", "hassani", 10, 14, 12, 11, 9, 20);
        Etudiant et3 = new Etudiant("cne3", "hamdani", 9, 10, 14, 12, 17, 05);
        Etudiant et4 = new Etudiant("cne4", "talbi", 16, 14, 12, 11, 9, 20);
        Etudiant et5 = new Etudiant("cne5", "saadani", 12, 14, 5, 17, 19, 11);
        Etudiant et6 = new Etudiant("cne6", "malhawi", 11, 14, 15, 12, 20, 8);
        Etudiant et7 = new Etudiant("cne7", "nouri", 14, 2, 12, 17, 15, 18);
        Etudiant et8 = new Etudiant("cne8", "mounir", 13, 20, 19, 11, 12, 14);
// Etape 1
//tache(le notes) : doit calculer et affecter la moyenne
// creation de threads (creation du system d'execution en parallel) 4 threads
        ThreadPoolExecutor ourExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
//Etape 2
//lancer 8 taches sur 4 thread
        ourExecutor.submit(new taskCalculEtudiant(et1));
        ourExecutor.submit(new taskCalculEtudiant(et2));
        ourExecutor.submit(new taskCalculEtudiant(et3));
        ourExecutor.submit(new taskCalculEtudiant(et4));
        ourExecutor.submit(new taskCalculEtudiant(et5));
        ourExecutor.submit(new taskCalculEtudiant(et6));
        ourExecutor.submit(new taskCalculEtudiant(et7));
        ourExecutor.submit(new taskCalculEtudiant(et8));
//Etape 3
//les print n'attendent pas automatiquement la fin d'execution des taches du threads
        System.out.println(et1.cne + " : " + et1.moyenne);
        System.out.println(et2.cne + " : " + et2.moyenne);
        System.out.println(et3.cne + " : " + et3.moyenne);
        System.out.println(et4.cne + " : " + et4.moyenne);
        System.out.println(et5.cne + " : " + et5.moyenne);
        System.out.println(et6.cne + " : " + et6.moyenne);
        System.out.println(et7.cne + " : " + et7.moyenne);
        System.out.println(et8.cne + " : " + et8.moyenne);
        System.out.println(et1.cne + " : " + et1.moyenne);
//Etape 4
//apres avoir fini les taches on doit arreter le threadPool
        ourExecutor.shutdown();
    }
}