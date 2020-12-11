package Polymorphisme;

public class Employe extends Persone {
    private double salaire;

    public Employe(String nom, String prenom, String adresse, String ville, String dateDeNaissance, double salaire) {
        super(nom, prenom, adresse, ville, dateDeNaissance);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public void afficher(){
        System.out.println("Nom : " + this.getNom() + ", Prénom : "+ this.getPrenom() +", Adresse : "+ this.getAdresse() + ", Ville : "+ this.getVille() +", Date de Naissance: "+ this.getDateDeNaissance() + ", salaire : "+ this.salaire);
    }
/*
    public static void main(String[] args) {
        Employe em1 = new Employe("AAA","KLk","TC","YY","1909",5000);
        em1.afficher();
    }

 */
}
