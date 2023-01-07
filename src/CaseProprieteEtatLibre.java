public class CaseProprieteEtatLibre extends CaseProprieteEtat {
    CaseProprieteEtatLibre(CasePropriete propriete) {
        super(propriete);
    }

    public void acheterMaison(final Player p) {
        // Pas de propriétaire, donc aucun achat de maison possible
    }

    public boolean acheter(final Player p) {
        if(p.retirerArgent(getPropriete().getConstructionMaison())){
            this.propriete.proprietaire=p;
            this.propriete.ajouterNiveau();
            if (!this.propriete.groupe.toutPossedePareil()) {
                this.propriete.setEtat(new CaseProprieteEtatAchetee(this.propriete));
            }
            return true;
        }
        return false;
    }

    public void payerLoyer(final Player p1){
        //Pas de proprietaire donc pas de loyer
    }

}
