package Polymorphisme1;

public class Video extends Ouvrage{
    private String editeur;
    private double duree;

    public Video(String titre, String dateDeCreation, boolean dispo, String editeur, double duree) {
        super(titre, dateDeCreation, dispo);
        this.editeur = editeur;
        this.duree = duree;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public void afficher() {
        System.out.println( "Ouvrage{" +
                "Auteur='" + this.editeur +"' "+
                "Titre='" + getTitre() + '\'' +
                "Durée='" + this.duree +"h"+ '\'' +
                ", DateDeCreation='" + getDateDeCreation() + '\'' +
                ", Dispo=" + isDispo() +
                '}');
    }

    public static void main(String[] args) {
        Video video =new Video("Deadpool","2012-12-06",false,"saad",1.45);
        video.afficher();
    }
}
