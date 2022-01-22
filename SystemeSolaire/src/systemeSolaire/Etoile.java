package systemeSolaire;
import java.awt.*;

public class Etoile extends Astres{

    public Etoile(String nom, double x, double y, double rayon, Color couleur){
        super(nom, x, y, rayon, couleur);
    }

    public Etoile(String nom, double x, double y, double rayon, String cheminImage){
        super(nom, x, y, rayon, cheminImage);
    }

    public void afficher(){
        super.afficher();
    }

    public void afficherImage(){
        super.afficherImage();
    }

    @Override
    public String toString() {
        return "Etoile{" +
                super.toString() +
                "}";
    }
}
