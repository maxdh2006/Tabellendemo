import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class Tabellendemo {
    static int[][] tabelle1 = new int[4][5];

    public static void main(String[] args) {
        Tabelle tabelleObjekt = new Tabelle();
        tabelleObjekt.fuelle();
        tabelleObjekt.sumZeile();
    }

    
}

class Tabelle {

    int randomNum=0;
    int zeilenSumme;

    void fuelle() {
        for (int i = 0; i < Tabellendemo.tabelle1.length; i++) {
            for (int j = 0; j < Tabellendemo.tabelle1[i].length; j++) {
                randomNum = ThreadLocalRandom.current().nextInt(1, 101); // Generates random number between 1 and 100
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

    void sumZeile(){
        System.out.println("Gib eine Zahl zwischen 1 und 4 ein: ");
        Scanner s = new Scanner(System.in);
        int eingabe = s.nextInt();
        int zeile1 = Tabellendemo.tabelle1[0][0] + Tabellendemo.tabelle1[0][1] + Tabellendemo.tabelle1[0][2] + Tabellendemo.tabelle1[0][3] + Tabellendemo.tabelle1[0][4];
        int zeile2 = Tabellendemo.tabelle1[1][0] + Tabellendemo.tabelle1[1][1] + Tabellendemo.tabelle1[1][2] + Tabellendemo.tabelle1[1][3] + Tabellendemo.tabelle1[1][4];
        int zeile3 = Tabellendemo.tabelle1[2][0] + Tabellendemo.tabelle1[2][1] + Tabellendemo.tabelle1[2][2] + Tabellendemo.tabelle1[2][3] + Tabellendemo.tabelle1[2][4];
        int zeile4 = Tabellendemo.tabelle1[3][0] + Tabellendemo.tabelle1[3][1] + Tabellendemo.tabelle1[3][2] + Tabellendemo.tabelle1[3][3] + Tabellendemo.tabelle1[3][4];
        int x= 0;
        if(eingabe==1){
            System.out.println(zeile1);
        } else if(eingabe==2){
            System.out.println(zeile2);
        }else if(eingabe==3){
            System.out.println(zeile3);
        }else if(eingabe==4){
            System.out.println(zeile4);
        } 
    s.close();
}
    
}
