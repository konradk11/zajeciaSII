package dzień_2;


import java.awt.*;

class Dziadkowie {
    String plec, imie, nazwisko, geny, choroby;
    int wiek;

    Dziadkowie(String plec, String imie, String nazwisko, String geny, String choroby, int wiek) {
        this.plec = plec;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.geny = geny;
        this.choroby = choroby;
        this.wiek = wiek;
    }

}

class Rodzice extends Dziadkowie {
    String nazwiskoRodowe, praca;

    Rodzice(String plec, String imie, String nazwisko, String geny, String choroby, int wiek, String nazwiskoRodowe, String praca) {
        super(plec, imie, nazwisko, geny, choroby, wiek);
        this.nazwiskoRodowe = nazwiskoRodowe;
        this.praca = praca;
    }
}

class Dzieci extends Rodzice {
    boolean pelnoletnosc;

    Dzieci(String plec, String imie, String nazwisko, String geny, String choroby, int wiek, String nazwiskoRodowe, String praca, boolean pelnoletnosc) {
        super(plec, imie, nazwisko, geny, choroby, wiek, nazwisko, praca);
        this.pelnoletnosc = pelnoletnosc;
    }
}

public class zadanieDziedziczenie {
    public static void main(String[] args) {


        Dziadkowie bronek = new Dziadkowie("M ", "Bronek ", "Wąsik ", "XY ", "Rak ", 55);
        Dzieci jas = new Dzieci("m ", "Jaś ", "Nowak ", "XYZ ", "Rak - jeszcze nie wie ", 12,
                " Wąsik ", "bezrobotny", false);

        System.out.println(bronek.nazwisko + bronek.choroby + bronek.plec + bronek.geny + bronek.wiek);
        System.out.println(jas.nazwisko + jas.pelnoletnosc + jas.choroby);
    }
}
