package exercice1;

public class CompteBancaire {
    private int numCompte = 0;
    String nomClient, prenomClient;
    double solde;
    private static String nomBanque, codeAgence;
    private String typeCompte;
    static int nbCompte;

    public CompteBancaire() {
        nomBanque = "AL-BARAKA";
        codeAgence = "AGENCE-CODE-107";
        nbCompte ++;
        this.numCompte = nbCompte;
    }

    public CompteBancaire(String nom, String prenom, double solde, String type) {
        this.nomClient = nom;
        this.prenomClient = prenom;
        this.solde = solde;
        this.typeCompte = type;
        nomBanque = "AL-BARAKA";
        codeAgence = "AGENCE-CODE-107";
        nbCompte ++;
        this.numCompte = nbCompte;
    }

    public String getType() {
        return this.typeCompte;
    }
    public void setType(String newType) {
        this.typeCompte = newType;
    }

    public String getName() {
        return this.nomClient;
    }
    public void setName(String newName) {
        this.nomClient = newName;
    }

    public String getSurname() {
        return this.prenomClient;
    }
    public void setSurname(String newSurname) {
        this.prenomClient = newSurname;
    }

    public double getSolde() {
        return this.solde;
    }
    public void setSolde(double newSolde) {
        this.solde = newSolde;
    }

    public String getBankName() {
        return nomBanque;
    }

    public String getAgencyCode() {
        return codeAgence;
    }

    public static int nbCompte() {
        return nbCompte;
    }

    @Override
    public String toString() {
        return "\nLES INFORMATIONS DU COMPTE SONT LES SUIVANTES :\nLe numero de compte est : " + this.numCompte + "\nLe nom du client est : " + this.nomClient + "\nLe prenom du client est : " + this.prenomClient + "\nLe solde est : " + this.solde + "\nLe type de compte est : " + this.typeCompte + "\nLe nom de la banque est : " + nomBanque+ "\nLe code de l'agence est : " + codeAgence + "\n";
    }
}
