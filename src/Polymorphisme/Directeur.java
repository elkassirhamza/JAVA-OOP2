package Polymorphisme;

public class Directeur extends Chef{
    private String societe;

    public Directeur(String nom, String prenom, String adresse, String ville, String dateDeNaissance, double salaire, String servie, String societe) {
        super(nom, prenom, adresse, ville, dateDeNaissance, salaire, servie);
        this.societe = societe;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public void afficher(){
        System.out.println("Nom : " + this.getNom() + ", Prénom : "+ this.getPrenom() +", Adresse : "+ this.getAdresse() + ", Ville : "+ this.getVille() +", Date de Naissance: "+ this.getDateDeNaissance() + ", salaire : "+ this.getSalaire()+", Directeur de la societe :"+this.societe);
    }

    /*
    public static void main(String[] args) {
        Directeur dr = new Directeur("EL KASSIR","Hamza","Zaraba","Youssoufia","11-08-1997",40000,"Comm","ONCF");
        dr.afficher();
    }

     */
}
