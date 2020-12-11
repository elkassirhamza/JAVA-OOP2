public class Etudient extends Personne{
    private String diplome;
    public Etudient(String nom, String prenom, String adresse, String ville, int dateNaissance, String diplome) {
        super(nom, prenom, adresse, ville, dateNaissance);
        this.diplome = diplome;
}
    @Override
    public String toString() {
        return "Etudient{" +
                "diplome='" + diplome + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }

}