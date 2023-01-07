public class CasePropriete extends CaseAchetable {
    private int niveau;

    public int getNiveau() {
        // Automatically generated method. Please do not modify this code.
        return this.niveau;
    }

    public void setNiveau(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.niveau = value;
    }

    private int constructionMaison;

    public int getConstructionMaison() {
        // Automatically generated method. Please do not modify this code.
        return this.constructionMaison;
    }

    public void setConstructionMaison(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.constructionMaison = value;
    }

    public CaseProprieteEtat etat;

    public void updateNiveau(final int niveau) {
        this.niveau = niveau;
    }

    public int ajouterNiveau() {
        this.niveau+=1;
        return niveau;
    }

    @Override
    public boolean acheter(Player player) {
        return this.etat.acheter(player);
    }

    public void acheterMaison(final Player p) {
        this.etat.acheterMaison(p);
    }

    public void payerLoyer(final Player p1) {
        this.etat.payerLoyer(p1);
    }

    public boolean isConstructible() {
        return this.etat.isConstructible();
    }

    public void setEtat(CaseProprieteEtat etat) {
        this.etat = etat;
    }

    public CasePropriete(String nom, int constructionMaison, int[] loyers, Case suivant) {
        super(nom, constructionMaison, loyers, suivant);
        this.niveau = -1;
        this.constructionMaison = constructionMaison;
        this.etat = new CaseProprieteEtatLibre(this);
    }
}
