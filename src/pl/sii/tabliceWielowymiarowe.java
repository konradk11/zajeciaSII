package pl.sii;

import java.util.Scanner;

public class tabliceWielowymiarowe {
    public static void main(String[] args) {

        int n, m, o;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość tablic: ");
        n = scanner.nextInt();
        System.out.println("Podaj ilość elementów: ");
        m = scanner.nextInt();
        System.out.println("Podaj ilość elementów: ");
        o = scanner.nextInt();
        //int[] tab = new int[n];
        int[][][] tab = new int[n][m][o];
        int licznik = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < o; k++) {


                    tab[i][j][k] = licznik++;
                    System.out.println(tab[i][j][k]);
                }
            }

//        }
//        while (f < tab.length) {
//            System.out.println("Element " + f + " tablicy: " + tab[f]);
//            f++;

        }

    }
}
