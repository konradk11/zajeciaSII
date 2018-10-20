package pl.sii;

import java.util.InputMismatchException;
import java.util.Scanner;

public class wyjątki {

    public static void main(String[] args) {

        try {
           int a = 2/0;
           Scanner scanner = new Scanner(System.in);
           scanner.nextInt();
        } catch (ArithmeticException a){
            a.printStackTrace();
            System.out.println("nie dziel przez 0");

        }
        finally {
            System.out.println("dalej działa");
        }
        try {
            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();
        }
        catch (InputMismatchException f){
            System.out.println("gdzie cyferki???");
        }finally {
            System.out.println("działa");
        }
    }

}
