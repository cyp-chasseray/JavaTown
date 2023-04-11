public class VictimeBrigand extends Victime implements HorsLaLoi {
    private int recompense;
    public VictimeBrigand(String nom, String couleur) {
        super(nom, couleur);
        this.recompense = 350;
    }
    @Override
    public void seFaireArreter(Cowboy cowboy) {
        System.out.println(this.nom + "a été emprisonné par" + cowboy.getNom());
    }

    @Override
    public void capture(Victime victime) {
        System.out.println(this.nom + " a capturé " + victime.getNom());
    }

    @Override
    public int getRecompense() {
        return this.recompense;
    }

}
