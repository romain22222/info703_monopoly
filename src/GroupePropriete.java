import java.util.ArrayList;
import java.util.List;
public class GroupePropriete {
    private String nomGroupe;

    public String getNomGroupe() {
        // Automatically generated method. Please do not modify this code.
        return this.nomGroupe;
    }

    public void setNomGroupe(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.nomGroupe = value;
    }

    private List<CaseAchetable> proprietes;

    public List<CaseAchetable> getProprietes() {
        // Automatically generated method. Please do not modify this code.
        return this.proprietes;
    }

    public void setProprietes(final List<CaseAchetable> value) {
        // Automatically generated method. Please do not modify this code.
        this.proprietes = value;
    }

    public boolean toutPossedePareil() {
        Player playerProp1 = this.proprietes.get(0).proprietaire;
        if (playerProp1 == null) return false;
        for (CaseAchetable prop: this.proprietes) {
            if (prop.proprietaire != playerProp1) return false;
        }
        for (CaseAchetable prop: this.proprietes) {
            if (prop instanceof CasePropriete) {
                ((CasePropriete) prop).setEtat(new CaseProprieteEtatConstructible((CasePropriete) prop));
            }
        }
        return true;
    }

    public int nbPossedePar(Player p) {
        int nb = 0;
        for (CaseAchetable prop: this.proprietes) {
            if (prop.proprietaire == p) nb++;
        }
        return nb;
    }

    public GroupePropriete(String nomGroupe) {
        this.nomGroupe = nomGroupe;
        this.proprietes = new ArrayList<>();
    }

    public void addInGroupe(CaseAchetable caseAchetable) {
        proprietes.add(caseAchetable);
    }

    public int minLevelGroupe() {
        if (!(this.proprietes.get(0) instanceof CasePropriete)) return 0;
        int minG = ((CasePropriete) this.proprietes.get(0)).getNiveau();
        for (CaseAchetable prop: this.proprietes) {
            if (prop instanceof CasePropriete) minG = Math.min(minG, ((CasePropriete) prop).getNiveau());
        }
        return minG;
    }
}