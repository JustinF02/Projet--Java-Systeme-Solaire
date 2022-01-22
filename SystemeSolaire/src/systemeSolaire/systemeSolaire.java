package systemeSolaire;
import java.io.File;

public class systemeSolaire {

//    public static void pause(long millis){
//        try {
//            Thread.sleep(millis);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {

        File currentDir = new File("");
        System.out.println(currentDir.getAbsolutePath());
        System.out.println(currentDir.getAbsolutePath());
        Planete[] tableauPlanetes = new Planete[8];
        Etoile Soleil = new Etoile("Soleil", 700, 700, 80, ".\\ressources\\soleil.png");

        tableauPlanetes[0] = new Planete("Mercure", 800, 800, 20, ".\\ressources\\mercure.png", (Etoile) Soleil, 88);
        tableauPlanetes[1] = new Planete("Venus", 850, 850, 30, ".\\ressources\\venus.png", (Etoile) Soleil, 225);
        tableauPlanetes[2] = new Planete("Terre", 900, 900, 30, ".\\ressources\\terre.png", (Etoile) Soleil, 365);
        tableauPlanetes[3] = new Planete("Mars", 950, 950,25,".\\ressources\\mars.png", (Etoile) Soleil, 686);
        tableauPlanetes[4] = new Planete("Jupiter", 1000, 1000,50,".\\ressources\\jupiter.png", (Etoile) Soleil,4330);
        tableauPlanetes[5] = new Planete("Saturne", 1050, 1050,45,".\\ressources\\saturne.png", (Etoile) Soleil, 10752);
        tableauPlanetes[6] = new Planete("Uranus", 1100, 1100,35,".\\ressources\\uranus.png", (Etoile) Soleil, 30660);
        tableauPlanetes[7] = new Planete("Neptune", 1150, 1150,35,".\\ressources\\neptune.png", (Etoile) Soleil, 60140);
//        tableauPlanetes[8] = new Planete("lune", 875, 875, 10, ".\\ressources\\lune.png", tableauPlanetes[2], 27);


        HorlogeUniverselle Horloge = new HorlogeUniverselle(1, 50, tableauPlanetes, Soleil);

        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(700, 700);
        StdDraw.setScale(0, 1400);


        Horloge.start();
        /*  Permet d'arreter le thread une fois le nombre de secondes choisies soit écoulé.
        Le thread et le programme s'arretent en fermant la fenêtre d'affichage.
        pause(Horloge.getTempsSecondes() * 1000);

        Horloge.setContinuer(false);
        */

    }
}
