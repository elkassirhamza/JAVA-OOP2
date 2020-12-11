package Polymorphisme;

public class main {
    public static void main(String[] args) {
        Directeur hamza = new Directeur("EL KASSIR","Hamza","Zaraba","Youssoufia","11-08-1997",40000,"Comm","ONCF");
        Chef ilyass = new Chef("saadani", "ilyass", "20 Qu Zelaka", "Tanger", "1987-02-10", 15000, "Mecanique");
        Chef mouad = new Chef("Rmaili", "Mouad", "Melah 10", "Safi", "1999-02-10", 15000, "Mecanique");
        Employe said = new Employe("Felous", "said", "22 Alfath", "Casablanca", "1987-02-10", 8000);
        Employe ahmed = new Employe("Skalo", "Ahmed", "488 Zarba", "Youssoufia", "1987-02-10", 8000);
        Employe ayoub = new Employe("Mechhor", "Ayoub", "22 Bv Saada", "Youssoufiya", "1987-02-10", 8000);
        Employe jalil = new Employe("Rami", "jalil", "22 Bv Saada", "Casablanca", "1987-02-10", 8000);
        Employe yassin = new Employe("Zarib", "Yassin", "23 Bv Saada", "Youssoufia", "11-08-1997", 8000);



        Persone[] ressources={hamza,ilyass,mouad,said,ahmed,ayoub,jalil,yassin};

        for (int j=0 ; j< ressources.length; j++){
            ressources[j].afficher();
        }
    }
}
