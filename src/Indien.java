public class Indien extends Humain {
    private int nbPlumes;
    private String totem;
    public Indien(String nom) {
        super(nom);
        this.totem = "coyote";
        this.boisson = "jus de racine";
    }

    public void scalper(VisagePale visagePale) {
        this.nbPlumes +=1;
        System.out.println("Ton scalp est à moi. Ugh!");
    }

    public void sePresenter() {
        super.sePresenter();
        System.out.println("Jai " + this.nbPlumes + " plumes. Ugh!");
    }

    public void boire() {
        super.boire();
        System.out.println("Ah un bon verre de " + this.quelleEstTaBoisson() + ". Gloups! Ugh!");
    }
}
