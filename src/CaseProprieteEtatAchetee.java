public class CaseProprieteEtatAchetee extends CaseProprieteEtat {
    CaseProprieteEtatAchetee(CasePropriete propriete) {
        super(propriete);
    }
    public void acheterMaison(final Player p) {
        // Le propriétaire n'a pas tout le groupe, donc aucun achat de maison possible
    }

    public boolean acheter(final Player p) {
        System.out.println("Cette case a déjà un propriétaire");
        return false;
    }

    public void payerLoyer(final Player p1) {
        if(getPropriete().checkProprietaireDifferent(p1)){
            int montant = getPropriete().getLoyer(getPropriete().getNiveau());
            if(p1.retirerArgent(montant))
                getPropriete().proprietaire.ajouterArgent(montant);
            else{
                //enlever le player
                getPropriete().proprietaire.ajouterArgent(montant);
                p1.seRetirer();
            }
        }
    }

}
