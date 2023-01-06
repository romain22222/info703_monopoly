import java.util.ArrayList;
import java.util.List;

public class Plateau {
    private List<Case> cases = new ArrayList<>();

    public List<Case> getCases() {
        // Automatically generated method. Please do not modify this code.
        return this.cases;
    }

    public void setCases(final List<Case> value) {
        // Automatically generated method. Please do not modify this code.
        this.cases = value;
    }

    private List<GroupePropriete> groupeProprietes = new ArrayList<>();

    public List<GroupePropriete> getGroupeProprietes() {
        // Automatically generated method. Please do not modify this code.
        return this.groupeProprietes;
    }

    public void setGroupeProprietes(final List<GroupePropriete> value) {
        // Automatically generated method. Please do not modify this code.
        this.groupeProprietes = value;
    }

    private List<Player> player = new ArrayList<>();

    public List<Player> getPlayer() {
        // Automatically generated method. Please do not modify this code.
        return this.player;
    }

    public void setPlayer(final List<Player> value) {
        // Automatically generated method. Please do not modify this code.
        this.player = value;
    }
    public Plateau() {
        CasePropriete bleuFonce2 = new CasePropriete("Rue de la paix", 400, new int[]{50, 200, 600, 1400, 1700, 2000}, null);
        CaseTaxe taxe2 = new CaseTaxe("Taxe de luxe", 100, bleuFonce2);
        CasePropriete bleuFonce1 = new CasePropriete("Avenue des Champs-Élysées", 350, new int[]{35, 175, 500, 1100, 1300, 1500}, taxe2);

        CaseStationTrain gare4 = new CaseStationTrain("Gare Saint-Lazard",200,new int[]{25,50,100,200},bleuFonce1);

        CasePropriete vert3 = new CasePropriete("Boulevard des capucines", 320, new int[]{28, 150, 450, 1000, 1200, 1400}, gare4);
        CasePropriete vert2 = new CasePropriete("Avenue Foch", 300, new int[]{26, 130, 390, 900, 1100, 1275}, vert3);
        CasePropriete vert1 = new CasePropriete("Avenue de Breteuil", 300, new int[]{26, 130, 390, 900, 1100, 1275}, vert2);

        CaseVaEnPrison prison = new CaseVaEnPrison("Prison", vert1);
        CasePropriete jaune3 = new CasePropriete("Rue de la fayette", 280, new int[]{24, 120, 360, 850, 1025, 1200}, prison);
        CaseServicePublic energie2 = new CaseServicePublic("Compagnie de distribution des eaux", 150, new int[]{}, jaune3);

        CasePropriete jaune2 = new CasePropriete("Place de la Bourse", 260, new int[]{22, 110, 330, 800, 975, 150}, energie2);
        CasePropriete jaune1 = new CasePropriete("Faubourg Saint-Honoré", 260, new int[]{22, 110, 330, 800, 975, 150}, jaune2);
        CaseStationTrain gare3 = new CaseStationTrain("Gare du nord",200,new int[]{25,50,100,200}, jaune1);

        CasePropriete rouge3 = new CasePropriete("Avenue Henri-Martin", 240, new int[]{20, 100, 300, 750, 925, 1100}, gare3);
        CasePropriete rouge2 = new CasePropriete("Boulevard Malesherbes", 220, new int[]{18, 90, 250, 700, 875, 1050}, rouge3);
        CasePropriete rouge1 = new CasePropriete("Avenue Matignon", 220, new int[]{18, 90, 250, 700, 875, 1050}, rouge2);

        CaseParkGratuit parcGratuit = new CaseParkGratuit("Parc gratuit", rouge1);

        CasePropriete orange3 = new CasePropriete("Place Pigalle", 200, new int[]{16, 80, 220, 600, 800, 1000}, parcGratuit);
        CasePropriete orange2 = new CasePropriete("Boulevard Saint-Michel", 180,new int[]{ 14, 70, 200, 550, 750, 950}, orange3);
        CasePropriete orange1 = new CasePropriete("Avenue Mozart", 180, new int[]{14, 70, 200, 550, 750, 950}, orange2);

        CaseStationTrain gare2 = new CaseStationTrain("Gare de lyon",200,new int[]{25,50,100,200}, orange1);

        CasePropriete rose3 = new CasePropriete("Rue du paradis", 160, new int[]{12, 60, 180, 500, 700, 900}, gare2);
        CasePropriete rose2 = new CasePropriete("Avenue de  Neuilly", 140, new int[]{10, 50, 150, 450, 625, 750}, rose3);

        CaseServicePublic energie1 = new CaseServicePublic("Compagnie de distribution d'électricité", 150, new int[]{},rose2);
        CasePropriete rose1 = new CasePropriete("Boulevard de la villette", 140, new int[]{10, 50, 150, 450, 625, 750}, energie1);
        CasePrison visitePrison = new CasePrison("Simple visite", rose1);

        CasePropriete bleuClair3 = new CasePropriete("Avenue de la république", 120, new int[]{8, 40, 100, 300, 450, 600}, visitePrison);
        CasePropriete bleuClair2 = new CasePropriete("Rue de Courcelles", 100,new int[]{ 6, 30, 90, 270, 400, 550},bleuClair3);
        CasePropriete bleuClair1 = new CasePropriete("Rue de Vaugirad", 100, new int[]{6, 30, 90, 270, 400, 550},bleuClair2);

        CaseStationTrain gare1 = new CaseStationTrain("Gare Montparnasse", 200,new int[]{25,50,100,200}, bleuClair1);
        CaseTaxe taxe1 = new CaseTaxe("Impôts sur le revenu", 200,gare1);

        CasePropriete marron2 = new CasePropriete("Rue Lecourbe", 60, new int[]{4, 20, 60, 180, 320, 450}, taxe1);
        CasePropriete marron1 = new CasePropriete("Boulevard de Belleville", 60, new int[]{2, 10, 30, 90, 160, 250}, marron2);

        CaseDepart depart = new CaseDepart("Départ", marron1);

        bleuFonce2.setSuivant(depart);

        GroupePropriete marron = new GroupePropriete("Marron");
        GroupePropriete bleuClair = new GroupePropriete("Bleu Clair");
        GroupePropriete rose = new GroupePropriete("Rose");
        GroupePropriete orange = new GroupePropriete("Orange");
        GroupePropriete rouge = new GroupePropriete("Rouge");
        GroupePropriete jaune = new GroupePropriete("Jaune");
        GroupePropriete vert = new GroupePropriete("Vert");
        GroupePropriete bleuFonce = new GroupePropriete("Bleu Foncé");
        GroupePropriete gares = new GroupePropriete("Gares");
        GroupePropriete energies = new GroupePropriete("Energies");
        groupeProprietes.addAll(List.of(new GroupePropriete[]{marron, bleuClair, rose, orange, rouge, jaune, vert, bleuFonce, gares, energies}));
        marron1.setGroupe(marron);
        marron2.setGroupe(marron);

        rose1.setGroupe(rose);
        rose2.setGroupe(rose);
        rose3.setGroupe(rose);

        bleuClair1.setGroupe(bleuClair);
        bleuClair2.setGroupe(bleuClair);
        bleuClair3.setGroupe(bleuClair);

        bleuFonce1.setGroupe(bleuFonce);
        bleuFonce2.setGroupe(bleuFonce);

        bleuClair1.setGroupe(bleuClair);
        bleuClair2.setGroupe(bleuClair);
        bleuClair3.setGroupe(bleuClair);

        jaune1.setGroupe(jaune);
        jaune2.setGroupe(jaune);
        jaune3.setGroupe(jaune);

        vert1.setGroupe(vert);
        vert2.setGroupe(vert);
        vert3.setGroupe(vert);

        orange1.setGroupe(orange);
        orange2.setGroupe(orange);
        orange3.setGroupe(orange);

        rouge1.setGroupe(rouge);
        rouge2.setGroupe(rouge);
        rouge3.setGroupe(rouge);

        gare1.setGroupe(gares);
        gare2.setGroupe(gares);
        gare3.setGroupe(gares);
        gare4.setGroupe(gares);

        energie1.setGroupe(energies);
        energie2.setGroupe(energies);

        cases.add(depart);
        cases.add(marron1);
        cases.add(marron2);
        cases.add(taxe1);
        cases.add(gare1);
        cases.add(bleuClair1);
        cases.add(bleuClair2);
        cases.add(bleuClair3);
        cases.add(visitePrison);
        cases.add(rose1);
        cases.add(energie1);
        cases.add(rose2);
        cases.add(rose3);
        cases.add(gare2);
        cases.add(orange1);
        cases.add(orange2);
        cases.add(orange3);
        cases.add(parcGratuit);
        cases.add(rouge1);
        cases.add(rouge2);
        cases.add(rouge3);
        cases.add(gare3);
        cases.add(jaune1);
        cases.add(jaune2);
        cases.add(energie2);
        cases.add(jaune3);
        cases.add(prison);
        cases.add(vert1);
        cases.add(vert2);
        cases.add(vert3);
        cases.add(gare4);
        cases.add(bleuFonce1);
        cases.add(taxe2);
        cases.add(bleuFonce2);
    }
}