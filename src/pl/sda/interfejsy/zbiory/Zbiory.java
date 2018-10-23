package pl.sda.interfejsy.zbiory;


    import pl.sda.interfejsy.dziennik.Student;
    import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

    public class Zbiory {
        public static void main(String[] args) {
//        Set<Integer> studenty = new HashSet<>();
//        HashSet<Integer> inty = new HashSet<>(Arrays.asList(1,2,3,4,5));
            HashSet<Student> studenty = new HashSet<>();

            Student student1 = new Student("75", "c", "z");
            Student student2 = new Student("76", "c", "z");

            studenty.add(student1);
            studenty.add(student2);
            System.out.println(studenty);
//        for (int i = 0; i < studenty.size(); i++) {
//            studenty.
//        }

            Iterator<Student> iterator = studenty.iterator();
            while (iterator.hasNext()){
                Student student = iterator.next();

                /// czynnosci na studencie
                if (student.getIndex().equals("23")){
                    iterator.remove();
                }
            }

            Student[] students = new Student[studenty.size()];
            students = studenty.toArray(students);
            for (Student s : students) {
                if (s.getIndex().equals("23")){
                    studenty.remove(s);
                }
            }
        }
    }