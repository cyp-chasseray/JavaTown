public class Histoire {
    public static void main(String[] args) {

        Cowboy clint = new Cowboy("Clint");
        Brigand lee = new Brigand("Lee");
        Victime isaac = new Victime("Isaac", "rouge");
        Barman jeffrey = new Barman("Jeffrey");
        Sheriff wayne = new Sheriff("Wayne");
        Ripoux tuco = new Ripoux("Tuco");
        VictimeBrigand sterling = new VictimeBrigand("Sterling", "vert");
        Indien yakari = new Indien("Yakari");

        clint.sePresenter();
        lee.sePresenter();
        isaac.sePresenter();
        jeffrey.sePresenter();
        wayne.sePresenter();
        tuco.sePresenter();
        sterling.sePresenter();
        yakari.sePresenter();

        lee.capture(isaac);
        isaac.crie();
        clint.tirerSurBrigand(lee);
        wayne.arreterBrigand();
        clint.liberer(isaac);
        isaac.remercie();
        sterling.capture(isaac);
        clint.menace();
        clint.liberer(isaac);
        clint.sePresenter();
        tuco.rechercherBrigand(lee);
        lee.sePresenter();
        wayne.arreterBrigand();
        clint.menace();
        lee.seFaireArreter(clint);
        isaac.changeHat("bleu");
        isaac.sePresenter();
        yakari.scalper(isaac);
        isaac.scalp();

    }
}