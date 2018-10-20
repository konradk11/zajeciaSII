package pl.sii;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class zadanieEasyAdding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość testów do wykonania: ");
        int liczbaTestow = scanner.nextInt();



        List<Integer> listaWynikow = new LinkedList<>();

        int testNR = 1;
        while (liczbaTestow > 0) {

            System.out.println("Podaj ilość cyfr do przetesowania: ");
            int liczbaCyfr = scanner.nextInt();
            int[] cyfryTestowe = new int[liczbaCyfr];
            System.out.println("Dane do testu " + testNR);
            for (int i = 0; i < liczbaCyfr; i++) {
                System.out.println("Podaj cyfrę " + (i + 1) + ".");
                cyfryTestowe[i] = scanner.nextInt();

            }
            int sum = IntStream.of(cyfryTestowe).sum();
            listaWynikow.add(sum);

            liczbaTestow--;
            testNR++;
        }

        for (int i = 0; i <listaWynikow.size() ; i++) {
            System.out.println("Wynik testu nr " + (i+1) + ": "+ listaWynikow.get(i));
        }


    }


}

