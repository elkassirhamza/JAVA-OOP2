package Polymorphisme1;

public class Livre extends Ouvrage{
    private String auteur;

    public Livre(String titre, String dateDeCreation, boolean dispo, String auteur) {
        super(titre, dateDeCreation, dispo);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
@Override
    public void afficher() {
        System.out.println( "Ouvrage{" +
                "Auteur='" + this.auteur +"' "+
                "Titre='" + getTitre() + '\'' +
                ", DateDeCreation='" + getDateDeCreation() + '\'' +
                ", Dispo=" + isDispo() +
                '}');
    }

    public static void main(String[] args) {
        Livre ouvr = new Livre("New Livre","20-20-20",true,"Hamza");
        ouvr.afficher();
    }
}
