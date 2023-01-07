public abstract class Case {
    private String nom;

    public String getNom() {
        // Automatically generated method. Please do not modify this code.
        return this.nom;
    }

    public void setNom(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.nom = value;
    }

    private Case suivant;

    public Case getSuivant() {
        // Automatically generated method. Please do not modify this code.
        return this.suivant;
    }

    public void setSuivant(final Case value) {
        // Automatically generated method. Please do not modify this code.
        this.suivant = value;
    }

    abstract public void actionCase(final Player player);

    abstract public void actionOnPass(final Player player);

    public Case obtenirSuivant() {
        return this.suivant;
    }

    public Case(String nom, Case suivant) {
        this.nom = nom;
        this.suivant = suivant;
    }
}
