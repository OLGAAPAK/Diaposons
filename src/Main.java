import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin;
        int end;
        int i;
        while(true) {
            if (scanner.hasNext("stop")) {
                System.exit(0);
            }
            begin = scanner.nextInt();
            end = scanner.nextInt();
            if (begin > end) {
                System.out.println("Fault input");
                continue;
            }
            i = begin;
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (i < end) {
                arrayList.add(i);
                i++;
            }
            System.out.println(arrayList.size());
        }

    }
}