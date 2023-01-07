public class CaseProprieteEtatHotelle extends CaseProprieteEtat {
    CaseProprieteEtatHotelle(CasePropriete propriete) {
        super(propriete);
    }
    public void acheterMaison(final Player p) {
        System.out.println("Cette case est déjà hotellé");
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
            else {
                // enlever le player
                getPropriete().proprietaire.ajouterArgent(p1.getArgent());
                System.out.println("Le joueur " + p1.getNom() + " est éliminé !");
                p1.seRetirer();
            }
        }
    }

}
