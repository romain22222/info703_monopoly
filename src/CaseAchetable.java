import java.util.Objects;

public abstract class CaseAchetable extends Case {
    private int achat;

    public CaseAchetable(String nom, int achat, int[] loyers, Case suivant) {
        super(nom, suivant);
        this.loyers = loyers;
        this.achat = achat;
    }

    public int getAchat() {
        // Automatically generated method. Please do not modify this code.
        return this.achat;
    }

    public void setAchat(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.achat = value;
    }

    private int[] loyers;

    public int[] getLoyers() {
        // Automatically generated method. Please do not modify this code.
        return this.loyers;
    }

    public void setLoyers(final int[] value) {
        // Automatically generated method. Please do not modify this code.
        this.loyers = value;
    }

    public int getLoyer(int niveau) {
        return this.loyers[niveau];
    }

    public Player proprietaire;

    public GroupePropriete groupe;

    public void setGroupe(GroupePropriete groupe) {
        this.groupe = groupe;
        groupe.addInGroupe(this);
    }

    public boolean acheter(final Player player) {
        if(player.retirerArgent(achat)){
            this.proprietaire=player;
            this.groupe.toutPossedePareil();
            return true;
        }
        return false;
    }

    public void updateProprietaire(final Player p) {
        this.proprietaire = p;
        p.getAchetables().add(this);
    }

    abstract public void payerLoyer(final Player p1);

    @Override
    public void actionCase(Player player) {
        if (proprietaire == null) {
            if (Lecteur.closedQuestion("Cette case n'a aucun propriétaire, voulez vous l'acheter ?")) {
                if(player.acheteCase()) {
                    System.out.println("Joueur " + player.getNom() + " achète " + this.getNom());
                }
            } else {
                System.out.println("Joueur " + player.getNom() + " n'achète pas " + this.getNom());
            }
        } else if (checkProprietaireDifferent(player)) {
            this.payerLoyer(player);
        }
    }

    @Override
    public void actionOnPass(Player player) {

    }

    public boolean checkProprietaireDifferent(final Player p1) {
        return !Objects.equals(p1.getNom(), this.proprietaire.getNom());
    }

}