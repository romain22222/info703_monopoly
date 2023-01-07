public class CaseStationTrain extends CaseAchetable {
    public CaseStationTrain(String nom, int achat, int[] loyers, Case suivant) {
        super(nom, achat, loyers, suivant);
    }

    @Override
    public void payerLoyer(Player p1) {
        if(checkProprietaireDifferent(p1)){
            int montant = getLoyer(this.groupe.nbPossedePar(this.proprietaire));
            if(p1.retirerArgent(montant))
                proprietaire.ajouterArgent(montant);
            else{
                // enlever le player
                proprietaire.ajouterArgent(montant);
                p1.seRetirer();
            }
        }
    }
}
