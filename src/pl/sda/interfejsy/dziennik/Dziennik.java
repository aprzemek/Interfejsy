package pl.sda.interfejsy.dziennik;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Dziennik {
    private List<Student> list = new ArrayList<>();

    public void dodajStudenta(Student s) {
        list.add(s);
    }

    public void dodajOcene(String index, double ocena) {
        Student student = znajdzStudenta(index);
        student.dodajOcene(ocena);
    }

    private Student znajdzStudenta(String index) {
        for (Student s : list) {
            if (s.getIndex().equals(index)) {
                return s;
            }
        }
        return null;
    }

    private Optional<Student> znajdzStudentaOptional(String index) {
        for (Student s : list) {
            if (s.getIndex().equals(index)) {
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }

    public double obliczSrednia(String index) {
        Optional<Student> s = znajdzStudentaOptional(index);
        double sumaOcen = 0.0;
        if (s.isPresent()) {
            Student student = s.get();
            for (Double ocena : student.getOceny()) {
                sumaOcen += ocena;
            }
            sumaOcen /= student.getOceny().size();
        } else {
            throw new StudentNotFoundException();
        }
        return sumaOcen;
    }

    public List<Student> znajdzZagrozonych() {
        List<Student> zagrozeni = new ArrayList<>();
        for (Student s : list) {
            double srednia = obliczSrednia(s.getIndex());
            if (srednia < 3.0) {
                zagrozeni.add(s);
            }
        }
        return zagrozeni;
    }

    public List<Student> posrotujStudentowPoIndeksie() {
        List<Student> kopia = new ArrayList<>(list);

        // opcja 1
//        Collections.sort(kopia, new Comparator<Student>() {
//            // -1 jesli o1 jest wieksze od o2
//            // 1 jesli o2 jest wieksze od o1
//            // 0 jesli sa rowne
//            @Override
//            public int compare(Student o1, Student o2) {
////                return Integer.compare(liczba1, liczba2); -- w przypadku integer
//                return o1.getIndex().compareTo(o2.getIndex());
//            }
//        });

        // opcja 2
        kopia.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getIndex().compareTo(o2.getIndex());
            }
        });

        kopia.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                System.out.print("Porównanie: " + o1);
//                System.out.println("z : " + o2);
                int index1 = Integer.parseInt(o1.getIndex());
                int index2 = Integer.parseInt(o2.getIndex());
                return Integer.compare(index1, index2);
            }
        });
        return kopia;
    }
}