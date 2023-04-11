public class Ripoux extends Sheriff implements HorsLaLoi{

    private int recompense;
    public Ripoux(String nom) {
        super(nom);
        this.recompense = 250;
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

    public void setRecompense(int recompense) {
        this.recompense = recompense;
    }
}
