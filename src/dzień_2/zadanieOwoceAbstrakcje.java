package dzień_2;

import java.util.LinkedList;
import java.util.List;

interface Owoce {
    int getCena();

    int getWaga();

    String getKolor();
}

class Pomarancze implements Owoce {

    String kolor;
    int cena, waga;

    public String getKolor() {
        return kolor;
    }

    @Override
    public int getCena() {
        return cena;
    }

    @Override
    public int getWaga() {
        return waga;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public void pobierzDane() {
        System.out.println(getCena() + getKolor() + getWaga());
    }
}

class Banany implements Owoce {
    String kolor;
    int cena, waga;

    public String getKolor() {
        return kolor;
    }

    @Override
    public int getCena() {
        return cena;
    }

    @Override
    public int getWaga() {
        return waga;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }
}

class Jablka implements Owoce {
    String kolor;
    int cena, waga;

    public String getKolor() {
        return kolor;
    }

    @Override
    public int getCena() {
        return cena;
    }

    @Override
    public int getWaga() {
        return waga;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }
}


public class zadanieOwoceAbstrakcje {

    public static void main(String[] args) {

        Owoce najtańsze = new Pomarancze();
        ((Pomarancze)najtańsze).setKolor("zielone");
        ((Pomarancze)najtańsze).setCena(11);
        ((Pomarancze)najtańsze).setWaga(1);
        //najtańsze.pobierzDane();

        Owoce chiqita = new Banany();
        ((Banany)chiqita).setWaga(22);
        ((Banany)chiqita).setCena(2);
        ((Banany)chiqita).setKolor("żółty");

        Owoce antonowki = new Jablka();
        ((Jablka)antonowki).setWaga(33);
        ((Jablka)antonowki).setCena(3);
        ((Jablka)antonowki).setKolor("czerwone");

        List<Owoce> listaOwocow = new LinkedList<>();
        int n = 0;
        listaOwocow.add(antonowki);
        n++;
        listaOwocow.add(najtańsze);
        n++;
        listaOwocow.add(chiqita);
        n++;
        for (int i = 0; i < n; i++) {
            System.out.println(listaOwocow.get(i).getCena());
            System.out.println(listaOwocow.get(i).getWaga());
            System.out.println(listaOwocow.get(i).getKolor());
        }

        System.out.println("foricz");
        for (Owoce o:listaOwocow) {
            System.out.println(o.getCena());
            System.out.println(o.getWaga());
            System.out.println(o.getKolor());
        }


    }

}
