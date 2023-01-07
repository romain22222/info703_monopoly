public class CaseDepart extends CaseAngle {
    @Override
    public void actionCase(Player player) {

    }

    @Override
    public void actionOnPass(Player player) {
        player.ajouterArgent(200);
    }

    public CaseDepart(String nom, Case suivant) {
        super(nom, suivant);
    }
}
