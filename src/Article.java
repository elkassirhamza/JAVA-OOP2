public class Article {
    private String nom;
    private double prix;

    public void afficher() {
        System.out.println("Article name : " + nom + " Prix : " + prix);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


}
