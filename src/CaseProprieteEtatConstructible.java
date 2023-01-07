public class CaseProprieteEtatConstructible extends CaseProprieteEtat {
    CaseProprieteEtatConstructible(CasePropriete propriete) {
        super(propriete);
    }
    public void acheterMaison(final Player p) {
        if(p.retirerArgent(getPropriete().getConstructionMaison())){
            this.propriete.ajouterNiveau();
            this.propriete.proprietaire=p;
            this.propriete.setEtat(new CaseProprieteEtatConstruit(this.propriete));
        }

    }


    public boolean acheter(final Player p) {
        System.out.println("Cette case a déjà un propriétaire");
        return false;
    }

    public void payerLoyer(final Player p1) {
        if(getPropriete().checkProprietaireDifferent(p1)){

            int montant = getPropriete().getLoyer(getPropriete().getNiveau())*2;
            if(p1.retirerArgent(montant))
                getPropriete().proprietaire.ajouterArgent(montant);
            else{
                //enlever le player
                getPropriete().proprietaire.ajouterArgent(montant);
                p1.getPlayerPrecedent().setPlayerSuivant(p1.getPlayerSuivant());

            }
        }
    }

}
