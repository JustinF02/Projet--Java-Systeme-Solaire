package systemeSolaire;

import java.awt.*;

public class Astres {
    private String nom;
    private double coordX;
    private double coordY;

    private double rayon;
    private Color couleur;
    private String cheminImage;

    public Astres(){
        this.coordX = 0;
        this.coordY = 0;
        this.rayon = 4;
        this.couleur = Color.yellow;
    }
    public Astres(String nom, double coordX, double coordY, double rayon, Color couleur) {
        this.nom = nom;
        this.coordX = coordX;
        this.coordY = coordY;
        this.rayon = rayon;
        this.couleur = couleur;
    }

    public Astres(String nom, double coordX, double coordY, double rayon, String cheminImage) {
        this.nom = nom;
        this.coordX = coordX;
        this.coordY = coordY;
        this.rayon = rayon;
        this.cheminImage = cheminImage;
        couleur = Draw.WHITE;
    }

    public void afficher(){
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(couleur);
        StdDraw.filledCircle(coordX,coordY,rayon);
    }

    public void afficherImage(){
        StdDraw.picture(coordX,coordY,cheminImage, rayon*2,rayon*2);
    }

    @Override
    public String toString() {
        return "Astres{" +
                "coordX=" + coordX +
                ", coordY=" + coordY +
                ", rayon=" + rayon +
                ", couleur=" + couleur +
                '}';
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    public double getCoordX() {return coordX;}
    public double getCoordY() {return coordY;}
    public double getRayon() {return rayon;}
    public Color getCouleur() {return couleur;}
    public String getNom() {return nom;}
    public String getCheminImage() {return cheminImage;}
}