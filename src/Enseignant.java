public class Enseignant extends Personne{
    private String specialite;
    public static int counter;
    public void ecrirePersonne(){

    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "specialite='" + specialite + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }

    public Enseignant(String nom, String prenom, String adresse, String ville, int dateNaissance, String specialite) {
        super(nom, prenom, adresse, ville, dateNaissance);
        this.specialite = specialite;
        counter++;
    }

    public static void main(String[] args) {
        Enseignant ens = new Enseignant("Marzak","Bouchra","YouCode","Youssoufia",2020,"math");
        Enseignant ens1 = new Enseignant("Marzak1","Bouchra","YouCode","Youssoufia",2020,"math");
        Enseignant ens2 = new Enseignant("Marzak2","Bouchra","YouCode","Youssoufia",2020,"math");
        /*System.out.println(ens.toString());
        System.out.println(ens1.toString());
        System.out.println(ens2.toString());*/
        System.out.println("Number of Enseignant : "+ counter);
    }




}
