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
    }

    public int ajouterNiveau() {
        // TODO Auto-generated return
        return 0;
    }

    public void acheterMaison(final Player p) {
    }

    public void payerLoyer(final Player p1) {
    }

    public CasePropriete(String nom, int constructionMaison, int[] loyers, Case suivant) {
        super(nom, constructionMaison, loyers, suivant);
        this.niveau = -1;
        this.constructionMaison = constructionMaison;
        this.etat = new CaseProprieteEtatLibre();
    }
}
