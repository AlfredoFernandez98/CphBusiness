import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

       ArrayList<String>Studentpassedcourse=new ArrayList<>();
       ArrayList<String>Studentcurrentcourse=new ArrayList<>();

        System.out.println(Studentpassedcourse.add("Math"));
        System.out.println(Studentcurrentcourse.add("English"));

        ArrayList<String>teacherCanTeach=new ArrayList<>();
        ArrayList<String>teacherCurrentcourse=new ArrayList<>();
        teacherCanTeach.add("Spanish");
        teacherCurrentcourse.add("Math");

        Student s1= new Student("Malte",Studentpassedcourse,Studentcurrentcourse);
        Teacher t1= new Teacher("Tess",teacherCanTeach,teacherCurrentcourse);

        persons.add(s1);
        persons.add(t1);

        for (Person p: persons) {
            
        }








    }
}