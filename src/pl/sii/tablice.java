package pl.sii;

import java.util.Scanner;

public class tablice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj ilość elementów w tablicy: ");
//        int d = scanner.nextInt();
//        String[] tablica = new String[d];
//        for (int i = 0; i <tablica.length; i++) {
//           System.out.println("Podaj imię: ");
//            tablica[i]=scanner.nextLine();
//            //System.out.println("Do ["+i+"] elementu tablicy przypisujemy " + tablica[i]);
//
//        }
//        int e =0;
        System.out.println("Podaj ilość elementów w tablicy: ");
        int n = scanner.nextInt();
        int[] tab2 = new int[n];
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = i + 1;

        }
        int f = 0;
        while (f < tab2.length) {
            System.out.println("Element " + f + " tablicy: " + tab2[f]);
            f++;
        }


    }
}
