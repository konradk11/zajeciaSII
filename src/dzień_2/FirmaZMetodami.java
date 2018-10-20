package dzień_2;

class Pracownik2 {

    String imie, nazwisko, miasto;
    int wiek;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setWiek(int wiekPracownika){
        wiek=wiekPracownika;
    }
    public void setImie(String imiePracownika){
        imie = imiePracownika;
    }
    public void setNazwisko(String nazwiskoPracownika){
        nazwisko = nazwiskoPracownika;
    }

    public void setMiasto(String miastoPracownika){
        miasto = miastoPracownika;
    }

    public void pobierzDane() {
        System.out.println(getImie() + getNazwisko() + getWiek() + getMiasto());
    }
}

public class FirmaZMetodami {

    public static void main(String[] args) {


        Pracownik2 janusz = new Pracownik2();

        janusz.setImie("Janusz ");
        janusz.setNazwisko("Wąskik");
        janusz.setWiek(55);
        janusz.setMiasto(" Lubań");
        // System.out.println(janusz.getImie() + janusz.getNazwisko() + janusz.getWiek() + " lar");
        janusz.pobierzDane();


        Pracownik bogdan = new Pracownik();

        bogdan.imie = "Bogdan ";
        bogdan.nazwisko = "Dąb ";
        bogdan.wiek = 55;
        bogdan.miasto = " lubartów";
        System.out.println(bogdan.getImie() + bogdan.getNazwisko() + bogdan.getWiek() + bogdan.getMiasto() + " -stare");
        bogdan.pobierzDane();
    }
}
