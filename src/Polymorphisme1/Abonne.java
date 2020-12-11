package Polymorphisme1;
//numéro d’identité (entier), son nom (String), le numéro de son abonnement (entier) et l’ouvrage pris de la bibliothèque (un abonné peut prendre à la fois un seul ouvrage).
public class Abonne {
    private int numIdentite;
    private String nom;
    private int numAbonnement;
    private String ouvragePris;

    public Abonne(int numIdentite, String nom, int numAbonnement, String ouvragePris) {
        this.numIdentite = numIdentite;
        this.nom = nom;
        this.numAbonnement = numAbonnement;
        this.ouvragePris = ouvragePris;
    }

    public int getNumIdentite() {
        return numIdentite;
    }

    public void setNumIdentite(int numIdentite) {
        this.numIdentite = numIdentite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumAbonnement() {
        return numAbonnement;
    }

    public void setNumAbonnement(int numAbonnement) {
        this.numAbonnement = numAbonnement;
    }

    public String getOuvragePris() {
        return ouvragePris;
    }

    public void setOuvragePris(String ouvragePris) {
        this.ouvragePris = ouvragePris;
    }

    public void afficher() {
        System.out.println("Numéro d'identité : " + this.numIdentite + "\n"
                + "Numéro d'abonnement : " + this.numAbonnement + "\n"
                + "Nom : "+this.nom + "\n"
                + "Ouvrage pris : "+ this.ouvragePris);
    }
}
