import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Lecteur {
    static Scanner s = new Scanner(System.in);
    static String next() {
        return s.next();
    }

    static boolean closedQuestion(String question) {
        System.out.println(question + " (Y/n)");
        String resp = Lecteur.next();
        while (!Objects.equals(resp, "Y") && !Objects.equals(resp, "n") && !Objects.equals(resp, "y") && !Objects.equals(resp, "N")) {
            System.out.println(question + " (Y/n)");
            resp = Lecteur.next();
        }
        return resp.equals("Y") || resp.equals("y");
    }

    static int choiceQuestion(String question, List<String> options) {
        System.out.println("Choix : ");
        for (String o:
             options) {
            System.out.println((options.indexOf(o) + 1) + " : " + o);
        }
        System.out.println(question);
        String resp = Lecteur.next();
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(resp, 10);
                break;
            } catch (Exception e) {
                resp = Lecteur.next();
            }
        }
        return choice-1;
    }
}
