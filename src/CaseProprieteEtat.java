public interface CaseProprieteEtat {
    CasePropriete getPropriete();

    void setPropriete(final CasePropriete value);

    void acheterMaison(final Player p);

    boolean acheter(final Player p);

    void payerLoyer(final Player p1);

}
