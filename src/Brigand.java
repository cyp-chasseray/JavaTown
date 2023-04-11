import com.sun.security.jgss.GSSUtil;

public class Brigand extends Humain implements HorsLaLoi, VisagePale {
    private String apparence;
    private int nombreVictimes;
    private int recompense;
    private boolean enPrison;
    public Brigand(String nom) {
        super(nom);
        this.recompense = 100;
        this.apparence = "Mechant";
        this.boisson = "Tord-Boyaux";
    }

    public void capture(Victime victime) {
        System.out.println("Ahah je t'ai capturé " + victime.getNom() + ". A moi la rançon!");
        this.nombreVictimes += 1;
    }
    @Override
    public void seFaireArreter(Cowboy cowboy) {
        System.out.println("Damned " + cowboy.getNom() + "! Tu mas eu!");
        this.setEnPrison(true);
    }


    public void sePresenter() {
        super.sePresenter();
        System.out.println("J'ai l'air " + this.getApparence() + " et j'ai déjà kidnappé " + this.getNombreVictimes() +" victimes!.");
        System.out.println("Ma tete est mise à prix pour " + this.getRecompense() + "$.");
    }
    @Override
    public String getNom() {
        return this.nom + " le " + this.getApparence();
    }
    public int getNombreVictimes() {
        return this.nombreVictimes;
    }

    public int getRecompense() {
        return this.recompense;
    }

    public void setRecompense(int recompense) {
        this.recompense = recompense;
    }

    public boolean getEnPrison() {
        return this.enPrison;
    }

    public String getApparence() {
        return this.apparence;
    }

    public void setEnPrison(boolean status) {
        this.enPrison = status;
    }

    @Override
    public void scalp() {
        System.out.println("Aie ma tête!");
    }
}
