import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

class Tabelle {

    static int[][] tabelle1 = new int[4][5];

    public static void main(String[] args) {
        Tabelle tabelleObjekt = new Tabelle();
        tabelleObjekt.fuelle();
        tabelleObjekt.sumZeile();
        tabelleObjekt.min();
    
    }

    int randomNum=0;
    int zeilenSumme;

    void fuelle() {
        for (int i = 0; i < Tabelle.tabelle1.length; i++) {
            for (int j = 0; j < Tabelle.tabelle1[i].length; j++) {
                randomNum = ThreadLocalRandom.current().nextInt(1, 101); // Generates random number between 1 and 100
                Tabelle.tabelle1[i][j] = randomNum;

            }
        }
        for (int i = 0; i < Tabelle.tabelle1.length; i++) {
            for (int j = 0; j < Tabelle.tabelle1[i].length; j++) {
                System.out.print(Tabelle.tabelle1[i][j] + "\t");
                
            }
            System.out.println();
            
        }
    }

    void sumZeile(){
       String text;
       Scanner s = new Scanner(System.in);
        do{
        System.out.println("Gib eine Zeilennummer von 1-4 an, welche du summiert haben möchtest: ");
        
        int eingabe = s.nextInt();
        int zeile1 = Tabelle.tabelle1[0][0] + Tabelle.tabelle1[0][1] + Tabelle.tabelle1[0][2] + Tabelle.tabelle1[0][3] + Tabelle.tabelle1[0][4];
        int zeile2 = Tabelle.tabelle1[1][0] + Tabelle.tabelle1[1][1] + Tabelle.tabelle1[1][2] + Tabelle.tabelle1[1][3] + Tabelle.tabelle1[1][4];
        int zeile3 = Tabelle.tabelle1[2][0] + Tabelle.tabelle1[2][1] + Tabelle.tabelle1[2][2] + Tabelle.tabelle1[2][3] + Tabelle.tabelle1[2][4];
        int zeile4 = Tabelle.tabelle1[3][0] + Tabelle.tabelle1[3][1] + Tabelle.tabelle1[3][2] + Tabelle.tabelle1[3][3] + Tabelle.tabelle1[3][4];
        if(eingabe==1){
            System.out.println(zeile1);
        } else if(eingabe==2){
            System.out.println(zeile2);
        }else if(eingabe==3){
            System.out.println(zeile3);
        }else if(eingabe==4){
            System.out.println(zeile4);
        }
        System.out.println("Möchtest du noch eine Summe einer Zeile haben?");
        s.nextLine();
        text = s.nextLine();
        
        
        }while(text.equalsIgnoreCase("Ja"));
        s.close();
    }

    void min(){
        int min = tabelle1[0][0];

        for(int i=0; i<tabelle1.length; i++) { 
            for(int j=0; j<tabelle1.length; j++)
            if(min > tabelle1[i][j]){
               min = tabelle1[i][j];
            }
        }
        System.out.println("Das kleinste Element ist " + min + "."); 
    }
}
