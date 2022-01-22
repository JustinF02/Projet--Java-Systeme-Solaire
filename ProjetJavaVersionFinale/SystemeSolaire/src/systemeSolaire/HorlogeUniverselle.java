package systemeSolaire;

public class HorlogeUniverselle extends Thread {
    private boolean continuer;
    private long millisNaissance;
    private long tempsSecondes;
    private long tempsJours;

    private Planete[] listeDePlanete;
    private Etoile etoile;

    public HorlogeUniverselle(){
        this.continuer = true;
        this.millisNaissance = System.currentTimeMillis();
        this.tempsSecondes = 1000;
    }
    public HorlogeUniverselle(long tempsSecondes, long tempsJours, Planete[] tableauPlanetes, Etoile etoile){
        this.continuer = true;
        this.millisNaissance = System.currentTimeMillis();
        this.tempsSecondes = tempsSecondes;
        this.tempsJours = tempsJours;
        this.listeDePlanete = tableauPlanetes;
        this.etoile = etoile;
    }

    public void setContinuer(boolean continuer) {
        this.continuer = continuer;
    }

    public long getTempsSecondes() {
        return tempsSecondes;
    }

    public long getTempsJours() {
        return tempsJours;
    }

    @Override
    public void run(){
        long temps = (long) (1000/ (double)((this.getTempsJours()) / (double)(this.getTempsSecondes())));
        while(this.continuer) {
            StdDraw.picture(700,700,".\\ressources\\space.png",1400,1400);
            for(Planete planete : listeDePlanete)
            {
                planete.se_deplacer();
                planete.afficherImage();
            }
            etoile.afficherImage();
            try {
                Thread.sleep(temps);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            StdDraw.show();
            StdDraw.clear();
        }
    }
}