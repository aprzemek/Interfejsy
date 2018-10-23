package pl.sda.interfejsy.mapy;

import java.util.HashMap;
import java.util.Map;

public class Student {

    public static void main(String[] args) {

    }
    long numerInksu;
    String imie;
    String nazwisko;

    public Student(long numerInksu, String imie, String nazwisko) {
        this.numerInksu = numerInksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public long getNumerInksu() {
        return numerInksu;
    }

    public void setNumerInksu(long numerInksu) {
        this.numerInksu = numerInksu;
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
        return "Student{" +
                "numerInksu=" + numerInksu +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
