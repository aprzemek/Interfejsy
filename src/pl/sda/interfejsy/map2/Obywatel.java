package pl.sda.interfejsy.map2;

        /*Zadanie 2:
        Stwórz klasę Obywatel, która posiada:
        pesel, imie, nazwisko,
        Stwórz klasę RejestrObywateli która posiada wewnątrz (jako pole) mapę obywateli. Dodaj do Rejestru Obywateli metody:
        - dodajObywatela(String pesel, String imie, String nazwisko):void
        - znajdźObywateliUrodzonychPrzed(int rok):List<Obywatel>
        - znajdźObywateliZRokuZImieniem(int rok, String imie):List<Obywatel>
        - znajdźObywatelaPoNazwisku(String nazwisko):List<Obywatel>
        - znajdźObywatelaPoPeselu(String pesel):Obywatel*/

public class Obywatel {

    long pesel;
    String imie;
    String nazwisko;

    public Obywatel(long pesel, String imie, String nazwisko) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Obywatel{" +
                "pesel=" + pesel +
                '}';
    }
}
