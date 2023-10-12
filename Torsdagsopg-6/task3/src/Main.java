import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> studentPassedCourses = new ArrayList<>();
        ArrayList<String> studentCurrentCourses = new ArrayList<>();
        studentPassedCourses.add("Math 101");
        studentCurrentCourses.add("English 101");

        ArrayList<String> teacherCanTeach = new ArrayList<>();
        ArrayList<String> teacherCurrentCourses = new ArrayList<>();
        teacherCanTeach.add("Java 1.0");
        teacherCanTeach.add("Math 101");

        Student student1 = new Student("Alice", studentPassedCourses, studentCurrentCourses);
        Teacher teacher1 = new Teacher("Bob", teacherCanTeach, teacherCurrentCourses);

        persons.add(student1);
        persons.add(teacher1);


        for (Person person : persons) {
            boolean added = person.addCourse("Java 1.0");
            if (!added) {

                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået faget");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i faget.");
                }
            }
        }
    }
}