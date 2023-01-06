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

    private List<CaseAchetable> proprietes = new ArrayList<CaseAchetable> ();

    public List<CaseAchetable> getProprietes() {
        // Automatically generated method. Please do not modify this code.
        return this.proprietes;
    }

    public void setProprietes(final List<CaseAchetable> value) {
        // Automatically generated method. Please do not modify this code.
        this.proprietes = value;
    }

    public boolean toutPossedePareil() {
        // TODO Auto-generated return
        return false;
    }

    public GroupePropriete(String nomGroupe) {
        this.nomGroupe = nomGroupe;
        this.proprietes = new ArrayList<>();
    }

    public void addInGroupe(CaseAchetable caseAchetable) {
        proprietes.add(caseAchetable);
    }
}