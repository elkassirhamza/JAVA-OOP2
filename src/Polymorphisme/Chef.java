package Polymorphisme;

public class Chef extends Employe{
    private String servie;

    public Chef(String nom, String prenom, String adresse, String ville, String dateDeNaissance, double salaire, String servie) {
        super(nom, prenom, adresse, ville, dateDeNaissance, salaire);
        this.servie = servie;
    }

    public String getServie() {
        return servie;
    }

    public void setServie(String servie) {
        this.servie = servie;
    }

    public void afficher(){
        System.out.println("Nom : " + this.getNom() + ", Prénom : "+ this.getPrenom() +", Adresse : "+ this.getAdresse() + ", Ville : "+ this.getVille() +", Date de Naissance: "+ this.getDateDeNaissance() + ", salaire : "+ this.getSalaire()+", Chef de :"+this.servie);
    }

    /*
    public static void main(String[] args) {
        Chef ch = new Chef("chef","Chara","YY","YY","2000",6000,"Technicien");
        ch.afficher();
    }

     */
}
