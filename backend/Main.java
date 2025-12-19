
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"john","john@mail.com","1234567890","Science"));
        students.add(new Student(2,"Emma","emma@mail.com","9876543210","Arts"));
for(Student s:students){
    s.display();
}
    }}
