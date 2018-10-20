package pracaDomowa.zadanie3;


interface AutoParts {
    int getCena();

    int getIlosc();

    String getZastosowanie();

}

class engineParts implements AutoParts {

    String zastosowanie;
    int cena, ilosc;

    public String getZastosowanie() {
        return zastosowanie;
    }

    public int getCena() {
        return cena;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setZastosowanie(String zastosowanie) {
        String silnik = zastosowanie;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public void pobierzDane() {
        System.out.println(getZastosowanie() + " w cenie: " + getCena() + "zl, sztuk: " + getIlosc());
    }
}

class suspensionParts implements AutoParts {

    String zawieszenie;
    int cena, ilosc;

    public String getZastosowanie() {
        return zawieszenie;
    }

    public int getCena() {
        return cena;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setZastosowanie(String zastosowanie) {
        zawieszenie = zastosowanie;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public void pobierzDane() {
        System.out.println(getZastosowanie() + " w cenie: " + getCena() + "zl, sztuk: " + getIlosc());
    }

    static class Wahacz extends suspensionParts {
        String wahacz;

        public String getWahacz() {
            return wahacz;
        }

        @Override
        public String getZastosowanie() {
            return super.getZastosowanie();
        }

        @Override
        public int getCena() {
            return super.getCena();
        }
    }

}

class clutchParts implements AutoParts {

    String sprzeglo;
    int cena, ilosc;

    public String getZastosowanie() {
        return sprzeglo;
    }

    public int getCena() {
        return cena;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setZastosowanie(String zastosowanie) {
        sprzeglo = zastosowanie;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public void pobierzDane() {
        System.out.println(getZastosowanie() + " w cenie: " + getCena() + "zl, sztuk: " + getIlosc());
    }
}


