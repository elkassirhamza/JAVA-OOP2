public class ArticleEnSolde extends Article{
    private double remise;

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }
    public void afficher(){
       // super.afficher();
        System.out.println("new prix :"+ (getPrix()-(getPrix()*remise/100)));
    }
/*
    public static void main(String[] args) {
        ArticleEnSolde newAr = new ArticleEnSolde();
        newAr.setNom("adidas");
        newAr.setPrix(1000);
        newAr.setRemise(10);
        newAr.afficher();
    }

 */
}
