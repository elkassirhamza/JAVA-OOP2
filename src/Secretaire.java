public class Secretaire extends Personne {
    private int numeroBeau;
    public static int compteur = 0;
    public Secretaire(String nom, String prenom, String adresse, String ville, int dateNaissance,int numeroBeau) {
        super(nom, prenom, adresse, ville, dateNaissance);
        this.numeroBeau=numeroBeau;
    }
    public void ecrirePersonne(){

    }

    @Override
    public String toString() {
        return "Secretaire{" +
                "numeroBeau=" + numeroBeau +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
/*
    public void afficherSecre(String nom, String prenom, String adresse, String ville, int dateNaissance, int numeroBeau) {
        System.out.println("Nom : "+nom +"\n"+
                            "prenom :"+ prenom+"\n"+
                            "adress :"+adresse+"\n"+
                            "ville :"+ville+"\n"+
                            "Date "+ dateNaissance+"\n"+
                            "Num de bureau :"+numeroBeau);
    }

 */


/*
     public void afficher(){
        System.out.println();
        System.out.println( "numero de bureau :"+numeroBeau);
    }

 */



    public static void main(String[] args) {
        Secretaire scr=new Secretaire("Hmiyed","Hassan","Fowara","Youssoufia",1900,10);
        System.out.println(scr.toString());

    }


}
