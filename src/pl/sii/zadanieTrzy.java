package pl.sii;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class zadanieTrzy {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj czas do wybuchu (sek): ");
        int b = scanner.nextInt();

        while (b > 0) {
            System.out.println("Czas do wybuchu " + b + " Sekund");
            b--;
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("BOOM");

        System.out.println("Podaj czas do wybuchu (sek): ");
        int s = scanner.nextInt();
        do {
            System.out.println("Czas do wybuchu " + s + " Sekund");
            s--;
            TimeUnit.SECONDS.sleep(1);
        } while (s > 0);
        System.out.println("BOOM");


        System.out.println("Podaj czas do wybuchu (sek): ");
        int c = scanner.nextInt();
        for (int i = c; i > 0; i--) {

            System.out.println("Czas do wybuchu " + i + " sekund");
            TimeUnit.SECONDS.sleep(1);

        }
        System.out.println("BOOM");

    }
}
