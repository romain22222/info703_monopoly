public class CaseProprieteEtatConstruit extends CaseProprieteEtat {
    CaseProprieteEtatConstruit(CasePropriete propriete) {
        super(propriete);
    }
    public void acheterMaison(final Player p) {
        if(p.retirerArgent(getPropriete().getConstructionMaison())){
            this.propriete.ajouterNiveau();
            this.propriete.proprietaire=p;
            if(this.propriete.ajouterNiveau()==5){
                this.propriete.setEtat(new CaseProprieteEtatHotelle(this.propriete));
            }

        }
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
