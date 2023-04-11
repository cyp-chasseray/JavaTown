public class Barman extends Humain {
    String barName = "Chez " + this.nom;
    public Barman(String nom) {
        super(nom);
        this.boisson = "vin";
    }

    public void servir(Humain humain) {
        System.out.println("Tiens " + humain.getNom() + ". Un bon verre de " + humain.quelleEstTaBoisson() + " coco!");
    }

    public void sePresenter() {
        super.sePresenter();
        System.out.println("Mon bar, " + this.getBarName() + " est le plus important endroit de cette ville. Coco!");
    }

    @Override
    public void boire() {
        System.out.println("Ah un bon verre de " + this.quelleEstTaBoisson() + ". Gloups coco!");
    }

    public String getBarName() {
        return this.barName;
    }
}
