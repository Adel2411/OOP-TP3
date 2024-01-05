package Solutions.exercice1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //PARTIE 1 :
        CompteBancaire compte1 = new CompteBancaire("Bouakkaz", "Samra", 10000.00, "CompteEpargne");
        System.out.println(compte1);

        CompteBancaire compte2 = new CompteBancaire("Aberbour", "Rime", 10000.00, "CompteCourant");
        System.out.println(compte2);;

        CompteBancaire compte3 = new CompteBancaire();
        System.out.println(compte3);;

        CompteBancaire compte4 = new CompteBancaire();
        System.out.println(compte4);;


        System.out.println("Le nombre de compte crée est : " + CompteBancaire.nbCompte());
        
        
        //PARTIE 2 :
        Scanner input = new Scanner(System.in);

        System.out.print("\nVeuillez saisir le nom : ");
        String nom = input.nextLine();
        System.out.print("Veuillez saisir le prenom : ");
        String prenom = input.nextLine();
        System.out.print("Veuillez saisir le solde : ");
        double solde = Double.parseDouble(input.nextLine());
        System.out.print("Veuillez saisir le type de compte : ");
        String type = input.nextLine();

        CompteBancaire compte5 = new CompteBancaire(nom, prenom, solde, type);
        System.out.println(compte5);


        CompteBancaire compte6 = new CompteBancaire();
        System.out.print("\nVeuillez saisir le nom : ");
        nom = input.nextLine();
        System.out.print("Veuillez saisir le prenom : ");
        prenom = input.nextLine();
        System.out.print("Veuillez saisir le solde : ");
        solde = Double.parseDouble(input.nextLine());
        System.out.print("Veuillez saisir le type de compte : ");
        type = input.nextLine();

        compte6.setName(nom);
        compte6.setSurname(prenom);
        compte6.setSolde(solde);
        compte6.setType(type);
        System.out.println(compte6);






        input.close();
    }
}
