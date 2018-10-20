package pracaDomowa;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class zadanie2 {
    public static void main(String[] args) {
        String a;
        int liczbaLiczb = 1;
        int zakres = 0;
        int j, result = 0;
        //  Integer prime = 0;
        boolean isPrime;
        String primeNumbersFound = "";
        Scanner scanner = new Scanner(System.in);
        List<String> liczby = new LinkedList();
        List<Integer> parzyste = new LinkedList();
        List<Integer> nieparzyste = new LinkedList();
        List<Integer> wszystkie = new LinkedList<>();

        System.out.println("Wprowadź pierwszą liczbę: ");
        while (liczbaLiczb > 0) {
            a = new String(scanner.nextLine());
            try {
                zakres = Integer.parseInt(a);
            } catch (NumberFormatException n) {
            }
            liczby.add(a);
            if (zakres % 2 == 0) {
                parzyste.add(zakres);

            } else nieparzyste.add(zakres);

            if (a.equals("dalej") || a.equals("Dalej")) {
                liczby.remove(liczby.size() - 1);
                liczbaLiczb = 0;
            }
            if (liczbaLiczb == 1) {
                System.out.println("Podaj kolejną liczbę, lub wpisz 'dalej':");
            }
        }

        int sumPa = parzyste.stream().mapToInt(Integer::intValue).sum();
        int sumNie = nieparzyste.stream().mapToInt(Integer::intValue).sum();
        int dzialanie = sumPa-sumNie;

        for (int i = 0; i < liczby.size(); i++) {
            String number = liczby.get(i);
            try {
                result = Integer.parseInt(number);
            } catch (NumberFormatException m) {
            }
            wszystkie.add(result);
        }


        for (j = 0; j < wszystkie.size(); j++) {
            isPrime = CheckPrime(wszystkie.get(j));
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + wszystkie.get(j) + " ";
            }
        }

        System.out.println("Liczby pierwsze: " + primeNumbersFound);
        System.out.println(dzialanie);
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