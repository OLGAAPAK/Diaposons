import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Diapason[] diapason = new Diapason[3];
        for (int i = 0; i < diapason.length; i++){
        diapason[i] = new Diapason(scanner.nextInt(), scanner.nextInt());
        while (diapason[i].checkDiapasone() == false){
            System.out.println("Incorrect input");
            diapason[i].setBegin(scanner.nextInt());
            diapason[i].setEnd(scanner.nextInt());
        }
        diapason[i].createArray();
            System.out.println(diapason[i].checkDiapasone());
        }
        for (int i = 0; i < diapason.length; i++) {
            System.out.println(diapason[i].diapasonSize());
        }
    }
}