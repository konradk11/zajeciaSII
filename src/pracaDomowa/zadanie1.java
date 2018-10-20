package pracaDomowa;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        String a;
        int liczbaLiczb = 1;
        int zakres = 0;
        int j, result = 0;
        boolean isPrime;
        String primeNumbersFound = "";
        Scanner scanner = new Scanner(System.in);
        List<String> liczby = new LinkedList();
        List<Integer> liczbyPodzielne10 = new LinkedList();
        List<Integer> liczbyPodzielne3 = new LinkedList();
        List<Integer> wszystkie = new LinkedList<>();

        System.out.println("Wprowadź pierwszą liczbę: ");
        while (liczbaLiczb > 0) {
            a = new String(scanner.nextLine());
            try {
                zakres = Integer.parseInt(a);
            } catch (NumberFormatException n) {
            }
            if (zakres < 0 || zakres > 101) {
                System.out.println("Liczba spoza zakresu.");
            } else
                liczby.add(a);
            if (a.equals("dalej") || a.equals("Dalej")) {
                liczby.remove(liczby.size() - 1);
                liczbaLiczb = 0;
            }
            if (liczbaLiczb == 1) {
                System.out.println("Podaj kolejną liczbę, lub wpisz 'dalej':");
            }
        }

        int suma = 0;
        for (int i = 0; i < liczby.size(); i++) {
            String number = liczby.get(i);
            try {
                result = Integer.parseInt(number);
            } catch (NumberFormatException m) {
            }
            wszystkie.add(result);
            suma = suma + result;
            if (result % 3 != 0 && result % 10 == 0) {
                liczbyPodzielne10.add(result);

            }
            if (result % 3 == 0) {
                liczbyPodzielne3.add(result);
            }
        }
        for (j = 0; j < wszystkie.size(); j++) {
            isPrime = CheckPrime(wszystkie.get(j));
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + wszystkie.get(j) + " ";
            }
        }
        System.out.println("Liczby pierwsze: " + primeNumbersFound);
        System.out.println("Suma liczb: " + suma);
        System.out.println("Liczby podzielne przez 3: " + liczbyPodzielne3);
        System.out.println("Liczby podzielne przez 10, ale nie przez 3: " + liczbyPodzielne10);
    }

    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int j = 2; j <= numberToCheck / 2; j++) {
            remainder = numberToCheck % j;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}
