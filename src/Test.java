public class Test {
    String nom;
    String prenom;
    String adress;
    int anneeNaissance;

    public void addEmpl(){
        System.out.println(nom+" "+prenom+", "+"né le "+anneeNaissance+" "+adress);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdress() {
        return adress;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }
    public Test(String nom,String prenom,int anneeNaissance,String adress){
        this.nom=nom;
        this.prenom=prenom;
        this.adress=adress;
        this.anneeNaissance=anneeNaissance;
    }


}