public class Personne {
    public String nom;
    public String prenom;
    public String adresse;
    public String ville;
    public int dateNaissance;

    public Personne(String nom, String prenom, String adresse, String ville, int dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.dateNaissance = dateNaissance;
    }

    //public String toString(){
      //  return "nom : "+nom +" "+"prenom : "+" "+prenom+"adress : "+adresse+"ville : "+ville+" "+"né le :"+dateNaissance;
    //
    // }


    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }

    public void modifiePersonne(String adresse, String ville){
        this.adresse=adresse;
        this.ville=ville;
    }

    public void ecrirePersonne() {
        System.out.println(nom + " " + prenom + " " + dateNaissance + " " + ville);
    }


}
