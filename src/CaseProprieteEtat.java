public abstract class CaseProprieteEtat {
    CasePropriete propriete = null;

    CaseProprieteEtat() {}

    CaseProprieteEtat(CasePropriete prop) {
        this.propriete = prop;
    }

    CasePropriete getPropriete() {
        return this.propriete;
    };

    void setPropriete(final CasePropriete value) {
        this.propriete = value;
    };

    abstract void acheterMaison(final Player p);

    abstract boolean acheter(final Player p);

    abstract void payerLoyer(final Player p1);

}
