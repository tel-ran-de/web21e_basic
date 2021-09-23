package repeat;

import java.util.Arrays;

public class Group {
    private String name;
    private Student[] students;

    public Group(String name) {
        this.name = name;
        this.students = new Student[10];
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void newStudent(int index, Student student) {
        if (index < 0 || index >= students.length) {
            return;
        }
        students[index] = student;
    }

    @Override
    public String toString() {
        String names = "";
        for (Student st : this.students) {
            if (st == null) continue;
            names += st.getfName() + " ";
        }

        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + names +
                '}';
    }
}
