public class Victime extends Humain implements VisagePale{
    private String couleurChapeau;
    private boolean captive;

    public Victime(String nom, String couleur) {
        super(nom);
        this.couleurChapeau = couleur;
        this.boisson = "Lait";
    }

    public void crie() {
        System.out.println("A l'aide!");
        this.setCaptive(true);
    }

    public void remercie() {
        System.out.println("Merci de m'avoir sauvé");
        this.setCaptive(false);
    }

    public void changeHat(String couleur) {
        this.couleurChapeau = couleur;
        System.out.println("Regarde mon nouveau chapeau " + this.getCouleurChapeau() + "!");
    }

    @Override
    public String quelEstTonNom() {
        return this.getNom();
    }

    public void sePresenter() {
        super.sePresenter();
        System.out.println("Je suis obsédé par mon chapeau " + this.getCouleurChapeau() + "!");
    }

    public boolean getCaptiveStatus() {
        return this.captive;
    }

    public String getCouleurChapeau() {
        return this.couleurChapeau;
    }

    @Override
    public String getNom() {
        return "Gouverneur " + this.nom;
    }

    public void setCaptive(boolean status) {
        this.captive = status;
    }

    @Override
    public void scalp() {
        System.out.println("Aie ma tête!");
    }
}
