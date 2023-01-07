public class CaseServicePublic extends CaseAchetable {
    public CaseServicePublic(String nom, int achat, int[] loyers, Case suivant) {
        super(nom, achat, loyers, suivant);
    }

    @Override
    public void payerLoyer(Player p1) {
        if(this.checkProprietaireDifferent(p1)){
            int montant = (this.groupe.toutPossedePareil() ? 100 : 40) * Des.lancerDes();
            if(p1.retirerArgent(montant))
                this.proprietaire.ajouterArgent(montant);
            else{
                // enlever le player
                this.proprietaire.ajouterArgent(montant);
                p1.seRetirer();
            }
        }
    }
}
