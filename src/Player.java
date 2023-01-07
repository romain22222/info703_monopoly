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

    private List<CaseAchetable> achetables = new ArrayList<>();

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

    private Player playerPrecedent;
    private Player playerSuivant;

    public Player getPlayerSuivant() {
        // Automatically generated method. Please do not modify this code.
        return this.playerSuivant;
    }

    public Player getPlayerPrecedent() {
        // Automatically generated method. Please do not modify this code.
        return this.playerPrecedent;
    }
    public void setPlayerSuivant(final Player value) {
        // Automatically generated method. Please do not modify this code.
        this.playerSuivant = value;
        this.playerSuivant.setPlayerPrecedent(this);
    }
    public void setPlayerPrecedent(final Player value) {
        // Automatically generated method. Please do not modify this code.
        this.playerPrecedent = value;
    }

    public boolean acheteCase() {
        if (this.currentCase instanceof CaseAchetable) {
            return ((CaseAchetable) this.currentCase).acheter(this);
        }
        return false;
    }

    public boolean aAuMoins(final int montant) {
        return montant <= this.argent;
    }

    public void ajouterArgent(final int montant) {
        this.argent+=montant;
    }

    public boolean retirerArgent(final int montant) {
        if(aAuMoins(montant)) {
            this.argent -= montant;
            System.out.println("argent retiré: " + montant + " de : " + this.getNom());
            return true;
        }
        System.out.println("Le joueur " + getNom() + " n'a pas assez d'argent pour effectuer son action !");
        return false;

    }

    public void ameliorerPropriete(final CasePropriete propriete) {
        propriete.acheterMaison(this);
    }

    public void seRetirer() {
        this.playerPrecedent.setPlayerSuivant(this.getPlayerSuivant());
    }

    public Player faireTour() {
        System.out.println("Tour de " + getNom() + " : positionné sur " + this.currentCase.getNom());
        System.out.println("Jouer (appuyer sur entrée) ");
        Lecteur.next();
        int deplacement = Des.lancerDes();
        System.out.println("Fait " + deplacement + " aux dés");
        for (int i = 0; i < deplacement; i++) {
            this.currentCase = this.currentCase.obtenirSuivant();
            this.currentCase.actionOnPass(this);
        }
        System.out.println("Arrive sur " + this.currentCase.getNom());
        this.currentCase.actionCase(this);
        if (haveCasePropriete()) {
            while (true) {
                List<CasePropriete> cpa = getLotissementAmeliorables();
                if (cpa.size() == 0 || !Lecteur.closedQuestion("Voulez-vous améliorer un de vos lotissements ?")) {
                    break;
                }
                List<String> names = new ArrayList<>();
                for (CasePropriete c :
                        cpa) {
                    names.add(c.getNom());
                }
                ameliorerPropriete(cpa.get(Lecteur.choiceQuestion("Quel case améliorer ?", names)));
            }
        }
        return this.playerSuivant;
    }

    private boolean haveCasePropriete() {
        for (CaseAchetable ca :
                achetables) {
            if (ca instanceof CasePropriete) return true;
        }
        return false;
    }

    private List<CasePropriete> getLotissementAmeliorables() {
        List<CasePropriete> cpa = new ArrayList<>();
        for (CaseAchetable ca :
                achetables) {
            if (ca instanceof CasePropriete && ((CasePropriete) ca).isConstructible()) cpa.add((CasePropriete) ca);
        }
        return cpa;
    }

    public Player(String nom, Case currentCase, Player playerSuivant) {
        this.nom = nom;
        this.argent = 10000;
        this.currentCase = currentCase;
        if (playerSuivant != null) this.setPlayerSuivant(playerSuivant);
    }
}
