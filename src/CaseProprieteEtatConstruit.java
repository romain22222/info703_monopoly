public class CaseProprieteEtatConstruit extends CaseProprieteEtat {
    CaseProprieteEtatConstruit(CasePropriete propriete) {
        super(propriete);
    }
    public void acheterMaison(final Player p) {
        if(p.retirerArgent(getPropriete().getConstructionMaison())){
            int newNiveau = this.propriete.ajouterNiveau();
            if(newNiveau==5){
                this.propriete.setEtat(new CaseProprieteEtatHotelle(this.propriete));
                System.out.println(getPropriete().getNom() + " possède maintenant un hôtel");
            } else {
                System.out.println(getPropriete().getNom() + " possède maintenant " + this.propriete.getNiveau() + " maisons");
            }

        }
    }

    @Override
    public boolean isConstructible() {
        return propriete.groupe.minLevelGroupe() == propriete.getNiveau();
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
