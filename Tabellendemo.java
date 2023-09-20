import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class Tabellendemo {
    static int[][] tabelle1 = new int[4][5];

    public static void main(String[] args) {
        Tabelle tabelleObjekt = new Tabelle();
        tabelleObjekt.fuelle();
    }
}


class Tabelle {
    void fuelle() {
        for (int i = 0; i < Tabellendemo.tabelle1.length; i++) {
            for (int j = 0; j < Tabellendemo.tabelle1[i].length; j++) {
                int randomNum = ThreadLocalRandom.current().nextInt(1, 101); // Generates random number between 1 and 100
                Tabellendemo.tabelle1[i][j] = randomNum;
            }
        }
        for (int i = 0; i < Tabellendemo.tabelle1.length; i++) {
            for (int j = 0; j < Tabellendemo.tabelle1[i].length; j++) {
                System.out.print(Tabellendemo.tabelle1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
