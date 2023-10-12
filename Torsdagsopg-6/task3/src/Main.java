import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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

        // Loop through persons and add "Java 1.0" to all
        for (Person person : persons) {
            boolean added = person.addCourse("Java 1.0");
            if (!added) {
                // Check if the person is a Student or a Teacher and print the appropriate message
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
            }
        }
    }
}