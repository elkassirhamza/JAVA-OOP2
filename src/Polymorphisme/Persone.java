package Polymorphisme;

public class Persone {
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private String dateDeNaissance;

    public Persone(String nom, String prenom,String adresse, String ville, String dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse=adresse;
        this.ville = ville;
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void afficher(){
        System.out.println("Nom : " + this.nom + "\nPreN :" + this.prenom + "\nAdress :"+this.adresse+"\nVille : "+this.ville + "\nNaissance : "+this.dateDeNaissance);
    }
/*
    public static void main(String[] args) {
        Persone pr1 = new Persone("Ha","KAS","Yc","YY","1900");
        pr1.afficher();
    }

 */
}
