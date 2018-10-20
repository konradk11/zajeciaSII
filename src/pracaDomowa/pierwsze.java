package pracaDomowa;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class pierwsze {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int trzy = 0;
        int i = -1;
        List<Integer> parzyste = new LinkedList<>();


        do {
            int a = new Integer(scanner.nextLine());

            if (a < 100 && a > 9) {
                parzyste.add(a);
                i++;
                if (i>0) {
                    if (parzyste.get(i) == 42 && parzyste.get(i - 1) != 42) {
                        trzy++;
                    }
                }
            } else System.out.println("poza zakresem");

        } while (trzy > 2);

        System.out.println(parzyste);
    }
}
