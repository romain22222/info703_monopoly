import java.util.ArrayList;
import java.util.List;

public class Player {
    private String nom;

    public String getNom() {
        // Automatically generated method. Please do not modify this code.
        return this.nom;
    }

    public void setNom(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.nom = value;
    }

    private int argent;

    public int getArgent() {
        // Automatically generated method. Please do not modify this code.
        return this.argent;
    }

    public void setArgent(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.argent = value;
    }

    private List<CaseAchetable> achetables = new ArrayList<CaseAchetable> ();

    public List<CaseAchetable> getAchetables() {
        // Automatically generated method. Please do not modify this code.
        return this.achetables;
    }

    public void setAchetables(final List<CaseAchetable> value) {
        // Automatically generated method. Please do not modify this code.
        this.achetables = value;
    }

    private Case currentCase;

    public Case getCase() {
        // Automatically generated method. Please do not modify this code.
        return this.currentCase;
    }

    public void setCase(final Case value) {
        // Automatically generated method. Please do not modify this code.
        this.currentCase = value;
    }

    private Player playerSuivant;

    public Player getPlayerSuivant() {
        // Automatically generated method. Please do not modify this code.
        return this.playerSuivant;
    }

    public void setPlayerSuivant(final Player value) {
        // Automatically generated method. Please do not modify this code.
        this.playerSuivant = value;
    }

    public void acheteCase() {
    }

    public boolean aAuMoins(final int montant) {
        // TODO Auto-generated return
        return false;
    }

    public void ajouterArgent(final int montant) {
    }

    public void retirerArgent(final int montant) {
    }

    public void ameliorerPropriete(final String proprieteName) {
    }

    public Player faireTour() {
        // TODO Auto-generated return
        return null;
    }

}
