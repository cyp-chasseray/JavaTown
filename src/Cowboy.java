public class Cowboy extends Humain implements VisagePale{

    private int popularite;
    protected String caractere;

    public Cowboy(String nom) {
        super(nom);
        this.caractere = "Vaillant";
        this.boisson = "Whisky";
    }

    public void menace() {
        System.out.println("Prends ça rascal!");
    }

    public void liberer(Victime victime) {
        System.out.println("Vous êtes sauvé " + victime.nom);
        popularite += 1;
    }

    public void tirerSurBrigand(HorsLaLoi horsLaLoi) {
        System.out.println("Le " + this.getCaractere() + " " + this.getNom() + " tire sur le brigand " + horsLaLoi.quelEstTonNom() + ". PAN!");
    }

    public void sePresenter() {
        super.sePresenter();
        System.out.println("Les gens disent de moi que je suis " + this.caractere + ". J'ai un score de popularité de " + this.popularite);
    }

    public int getPopularite() {
        return this.popularite;
    }

    public String getCaractere() {
        return this.caractere;
    }

    @Override
    public void scalp() {
        System.out.println("Aie ma tête!");
    }
}
