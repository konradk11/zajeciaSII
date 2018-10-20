package pl.sii;

import java.util.Scanner;

public class zadanieDwa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj owoc");
        String a = new String(scanner.nextLine());
        switch (a) {
            case "Jabłka":
                System.out.println("Podaj wagę owoców");
                int b = scanner.nextInt();
                if (b < 100) {
                   // int c = 100 - b;
                    System.out.println("Jabłek jest w sam raz, mamy jeszcze " + (100-b) + "kg miejsca");
                } else {
                    int d = b - 100;
                    System.out.println("Jabłek jest za dużo o " + d + "kg");
                }
                break;

            case "Banany":
                System.out.println("Podaj wagę owoców");
                int v = scanner.nextInt();
                if (v < 100) {
                    int c = 100 - v;
                    System.out.println("Jabłek jest w sam raz, mamy jeszcze " + c + "kg miejsca");
                } else {
                    int d = v - 100;
                    System.out.println("Jabłek jest za dużo o " + d + "kg");
                }
                break;
            case "Pomarańcze":
                System.out.println("Podaj wagę owoców");
                int x = scanner.nextInt();
                if (x < 100) {
                    int c = 100 - x;
                    System.out.println("Jabłek jest w sam raz, mamy jeszcze " + c + "kg miejsca");
                } else {
                    int d = x - 100;
                    System.out.println("Jabłek jest za dużo o " + d + "kg");
                }
                break;
            default:
                System.out.println("Nie przyjmujemy takich owoców");
        }
//                break;
//            case "Edward":
//                System.out.println("Cześć " + a);
//                break;
//            case "Jurek":
//                System.out.println("Cześć " + a);
//            default:
//                System.out.println("Nie znamy się");

    }
}
