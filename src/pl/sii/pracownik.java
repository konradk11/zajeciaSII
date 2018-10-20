package pl.sii;

 class Pracownik {
    String imię, nazwisko;
    int wiek;
}

 class Firma {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik();
        pracownik1.imię = "Janusz";
        pracownik1.nazwisko = "Wąsik";
        pracownik1.wiek = 46;
        System.out.println(pracownik1.imię+pracownik1.nazwisko+pracownik1.wiek);

        Pracownik pracownik2 = new Pracownik();
        pracownik2.imię = "Janusz";
        pracownik2.nazwisko = "Wąsik";
        pracownik2.wiek = 46;
        System.out.println(pracownik2.imię+pracownik2.nazwisko+pracownik2.wiek);

    }
}