public class Sheriff extends Cowboy {

    int nombreBrigandCaptures;
    public Sheriff(String nom) {
        super(nom);
        this.caractere = "honnête";
    }

    public void arreterBrigand() {
        System.out.println("Au nom de la loi je vous arrête!");
        this.setNombreBrigandCaptures(1);
    }

    public void rechercherBrigand(Brigand brigand) {
        brigand.setRecompense(brigand.getRecompense()*2);
        System.out.println("OYEZ OYEZ BRAVE GENS !!" + brigand.getRecompense() +" $ a qui arrêtera " + brigand.nom + " le brigand, mort ou vif !!");
    }

    public void sePresenter() {
        super.sePresenter();
        System.out.println("J'ai arrêté " + this.getNombreBrigandCaptures() + " brigands.");
    }
    @Override
    public String getNom() {
        return "Sheriff " + this.nom;
    }

    public int getNombreBrigandCaptures() {
        return this.nombreBrigandCaptures;
    }

    public void setNombreBrigandCaptures(int nombre) {
        this.nombreBrigandCaptures += nombre;
    }
}
