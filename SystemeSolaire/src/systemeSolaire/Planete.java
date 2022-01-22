package systemeSolaire;

import java.awt.*;
import java.lang.*;

public class Planete extends Astres{
    private Astres OrbiteAutourDe;
    private double joursDeRotation;
    private double eloignement;

    public Planete(String nom, double x, double y, double rayon, Color couleur, Astres Orbite, long jours){
        super(nom, x,y,rayon,couleur);
        this.OrbiteAutourDe = Orbite;
        this.joursDeRotation = jours;
        this.eloignement = Math.sqrt(((getCoordX() - OrbiteAutourDe.getCoordX())*(getCoordX() - OrbiteAutourDe.getCoordX())) + ((getCoordY() - OrbiteAutourDe.getCoordY())*(getCoordY() - OrbiteAutourDe.getCoordY())));
    }

    public Planete(String nom, double x, double y, double rayon, String cheminImage, Astres Orbite, long jours){
        super(nom, x,y,rayon,cheminImage);
        this.OrbiteAutourDe = Orbite;
        this.joursDeRotation = jours;
        this.eloignement = Math.sqrt(((getCoordX() - OrbiteAutourDe.getCoordX())*(getCoordX() - OrbiteAutourDe.getCoordX())) + ((getCoordY() - OrbiteAutourDe.getCoordY())*(getCoordY() - OrbiteAutourDe.getCoordY())));
    }

    public void afficher(){
        StdDraw.setPenRadius(0.001);
        StdDraw.setPenColor(Draw.WHITE);
        StdDraw.circle(OrbiteAutourDe.getCoordX(),OrbiteAutourDe.getCoordY(),eloignement);
        super.afficher();
    }

    public void afficherImage(){
        StdDraw.setPenRadius(0.001);
        StdDraw.setPenColor(Draw.WHITE);
        StdDraw.circle(OrbiteAutourDe.getCoordX(),OrbiteAutourDe.getCoordY(),eloignement);
        super.afficherImage();
    }

    public void se_deplacer(){

        double planeteOrigineX = this.getCoordX() - OrbiteAutourDe.getCoordX();
        double planeteOrigineY = this.getCoordY() - OrbiteAutourDe.getCoordY();

        double planeteDeplacementX = planeteOrigineX * Math.cos(Math.toRadians(360/this.joursDeRotation)) - planeteOrigineY * Math.sin(Math.toRadians(360/this.joursDeRotation));
        double planeteDeplacementY = planeteOrigineX * Math.sin(Math.toRadians(360/this.joursDeRotation)) + planeteOrigineY * Math.cos(Math.toRadians(360/this.joursDeRotation));


        this.setCoordX(OrbiteAutourDe.getCoordX() + planeteDeplacementX);
        this.setCoordY(OrbiteAutourDe.getCoordY() + planeteDeplacementY);
    }

    @Override
    public String toString() {
        return "Planete{" +
                "OrbiteAutourDe=" + OrbiteAutourDe +
                super.toString() +
                '}'
                ;
    }

    public Astres getOrbiteAutourDe() {return OrbiteAutourDe;}
}
