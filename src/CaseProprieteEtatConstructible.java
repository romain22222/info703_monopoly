public class CaseProprieteEtatConstructible extends CaseProprieteEtat {
    CaseProprieteEtatConstructible(CasePropriete propriete) {
        super(propriete);
    }
    public void acheterMaison(final Player p) {
        if(p.retirerArgent(getPropriete().getConstructionMaison())){
            this.propriete.ajouterNiveau();
            this.propriete.setEtat(new CaseProprieteEtatConstruit(this.propriete));
            System.out.println(getPropriete().getNom() + " possède maintenant 1 maison");
        } else {
            System.out.println(getPropriete().proprietaire.getNom() + " n'a pas assez d'argent pour acheter une maison");
        }

    }

    @Override
    public boolean isConstructible() {
        return true;
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
