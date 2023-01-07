import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Coucou monde !");
        Plateau p = new Plateau();
        Player currP = p.getPlayer().get(0);
        int counter = 0;
        while (currP != currP.getPlayerSuivant() /*&& counter < 9*/) {
            Player tmp = currP.faireTour();
            if (tmp.getPlayerPrecedent() != currP) {
                p.getPlayer().remove(currP);
            }
            currP = tmp;
            for (Player player: p.getPlayer()) {
                System.out.println("Argent de " + player.getNom() + " : " + player.getArgent());
            }
            counter++;
        }
    }
}
