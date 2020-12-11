public class compteBancaire {
    protected long numCompte;
    protected double solde;

    public double ajouter(double add){
        return solde = solde+add;
    }
    public double retirer(double rm){
        return solde = solde-rm;
    }
    public void afficher(){
        System.out.println("Votre num d compte est :"+numCompte+ "\n"+"Votre solde :"+solde);
    }

    public static void main(String[] args) {
        compteBancaire compte =new compteBancaire();
        compte.numCompte=12345567;
        compte.ajouter(200);
        compte.retirer(100);
        compte.afficher();
    }
}

