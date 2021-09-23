package repeat;

public class AppStudents {
    public static void main(String[] args) {
        Group e21 = new Group("21-E");
        e21.newStudent(0, new Student("Ivan", "Ivanov"));
        e21.newStudent(1, new Student("Marya", "Sidorova"));
        e21.newStudent(2, new Student("Konstantin", "Petrov"));

        System.out.println(e21);
    }
}
