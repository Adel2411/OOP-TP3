package Solutions.exercice2;
import java.util.ArrayList;
import java.util.Scanner;

import Solutions.exercice1.CompteBancaire;

public class AppliCompteTab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le nombre d'element : ");
        int n = input.nextInt();
        ArrayList<CompteBancaire> tabCompte = new ArrayList<CompteBancaire>();
        
        input.nextLine();   	//vider le tampon de saisie

        for (int i = 0; i < n; i++) {
            System.out.print("\nVeuillez saisir le nom : ");
            String nom = input.nextLine();
            System.out.print("Veuillez saisir le prenom : ");
            String prenom = input.nextLine();
            System.out.print("Veuillez saisir le solde : ");
            double solde = Double.parseDouble(input.nextLine());
            System.out.print("Veuillez saisir le type de compte : ");
            String type = input.nextLine();
            tabCompte.add(new CompteBancaire(nom, prenom, solde, type));
        }
        
        for (CompteBancaire Compte : tabCompte) {
            System.out.println(Compte);
        }

        input.close();
    }
}
