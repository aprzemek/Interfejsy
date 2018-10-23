package pl.sda.interfejsy.dziennik;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Dziennik d = new Dziennik();
        Student student1 = new Student("85", "a", "x");
        Student student2 = new Student("22837", "b", "y");
        Student student3 = new Student("75", "c", "z");
        Student student7 = new Student("3", "c", "z");
        Student student4 = new Student(Arrays.asList(3.5, 5.6, 3.3), "75", "c", "z");
        Student student5 = new Student(new ArrayList<>(Arrays.asList(3.5, 5.6, 3.3)), "75", "c", "z");


//        student4.dodajOcene(5.5);
        student5.dodajOcene(5.5);

        d.dodajStudenta(student2);
        d.dodajStudenta(student1);
        d.dodajStudenta(student3);
//        d.dodajStudenta(student4);
        d.dodajStudenta(student7);
//        d.dodajOcene("1", 5.0);
//        d.dodajOcene("13", 4.0);
//        d.dodajOcene("13", 5.0);
//        d.dodajOcene("13", 5.3);
//
//        d.dodajOcene("14", 2.0);
//        d.dodajOcene("14", 2.0);
//        d.dodajOcene("14", 2.0);
//        d.dodajOcene("14", 2.3);
//        d.dodajOcene("14", 2.3);
//
//        d.dodajOcene("15", 4.5);
//        d.dodajOcene("15", 3.0);
//        d.dodajOcene("15", 3.0);
//        d.dodajOcene("15", 3.3);

        System.out.println(d.znajdzZagrozonych());
        System.out.println(d.posrotujStudentowPoIndeksie());
    }
}