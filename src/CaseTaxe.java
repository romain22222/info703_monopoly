public class CaseTaxe extends Case {
    private int montant;

    public CaseTaxe(String nom, int montant, Case suivant) {
        super(nom, suivant);
        this.montant = montant;
    }

    public int getMontant() {
        // Automatically generated method. Please do not modify this code.
        return this.montant;
    }

    public void setMontant(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.montant = value;
    }

}