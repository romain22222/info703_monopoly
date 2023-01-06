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

    public Player proprietaire;

    public GroupePropriete groupe;

    public void setGroupe(GroupePropriete groupe) {
        this.groupe = groupe;
        groupe.addInGroupe(this);
    }

    public void acheter(final Player player) {
    }

    public void updateProprietaire(final Player p) {
    }

    public boolean checkProprietaireDifferent(final Player p1) {
        // TODO Auto-generated return
        return false;
    }

}