package Polymorphisme1;
// titre (String), une date de création (String) et un indicateur d’existence (booléen : vrai si l’ouvrage est disponible dans la bibliothèque et faux s’il est emprunté). Une méthode polymorphe afficher() pour afficher les données de chaque Ouvrage
public class Ouvrage {
    private String titre;
    private String DateDeCreation;
    private boolean dispo;

    public Ouvrage(String titre, String dateDeCreation, boolean dispo) {
        this.titre = titre;
        DateDeCreation = dateDeCreation;
        this.dispo = dispo;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDateDeCreation() {
        return DateDeCreation;
    }

    public void setDateDeCreation(String dateDeCreation) {
        DateDeCreation = dateDeCreation;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public void afficher() {
        System.out.println( "Ouvrage{" +
                "titre='" + this.titre + '\'' +
                ", DateDeCreation='" + this.DateDeCreation + '\'' +
                ", dispo=" + this.dispo +
                '}');
    }

    public static void main(String[] args) {
        Ouvrage ouvr = new Ouvrage("Riche dad","2015-01-01",true);
        ouvr.afficher();
    }

}
