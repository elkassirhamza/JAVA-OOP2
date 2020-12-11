public class Employe {
    String nom;
    String prenom;
    String adress;
    int anneeNaissance;
    int anneeEncours;

    public int calculerAge(){
        return anneeEncours-anneeNaissance;
    }
    public void afficherInfosClient(){
        System.out.println("nom : "+nom+"| Prenom : "+prenom+"| adress : "+adress+"| Age : "+"|"+calculerAge());
    }


    public Employe setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public Employe setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public Employe setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public Employe setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
        return this;
    }

    public Employe setAnneeEncours(int anneeEncours) {
        this.anneeEncours = anneeEncours;
        return this;
    }

    public Employe(String nom,String prenom,String adress, int anneeEncours,int anneeNaissance){
        this.nom=nom;
        this.prenom=prenom;
        this.adress=adress;
        this.anneeNaissance=anneeNaissance;
        this.anneeEncours=anneeEncours;
    }


}
