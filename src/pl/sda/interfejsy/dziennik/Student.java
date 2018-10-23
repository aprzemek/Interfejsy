package pl.sda.interfejsy.dziennik;
//Klasa Student powinna:
//        - posiadać listę ocen studenta (List<Double>)
//        - posiadać (pole) numer indeksu studenta
//        - posiadać (pole) imię studenta
//        - posiadać (pole) nazwisko studenta

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private List<Double> oceny;
    private String index, imie, nazwisko;

    public Student(List<Double> oceny, String index, String imie, String nazwisko) {
        this.oceny = oceny;
        this.index = index;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(String index, String imie, String nazwisko) {
        this.index = index;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = new ArrayList<>();
    }

    public void dodajOcene(Double ocena) {
        oceny.add(ocena);
    }

    public List<Double> getOceny() {
        return oceny;
    }

    public void setOceny(List<Double> oceny) {
        this.oceny = oceny;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
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
                "oceny=" + oceny +
                ", index='" + index + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return  Objects.equals(getOceny(), student.getOceny()) &&
                Objects.equals(getIndex(), student.getIndex()) &&
                Objects.equals(getImie(), student.getImie()) &&
                Objects.equals(getNazwisko(), student.getNazwisko());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getOceny(), getIndex(), getImie(), getNazwisko());
    }
}