public class Humain {
    String nom;
    String boisson;

    public void parler(String texte) {
        System.out.println(texte);
    }

    public void sePresenter() {
        System.out.println("Bonjour, je m'appelle " + this.getNom() + " et j'aime boire du " + this.quelleEstTaBoisson());
    }

    public void boire() {
        System.out.println("Ah un bon verre de " + this.quelleEstTaBoisson() + ". Gloups!");
    }

    public String quelEstTonNom() {
        return this.nom;
    }

    public String quelleEstTaBoisson() {
        return this.boisson;
    }

    public Humain(String nom) {
        this.nom = nom;
        this.boisson = "eau";
    }

    public String getNom() {
        return this.nom;
    }
}
