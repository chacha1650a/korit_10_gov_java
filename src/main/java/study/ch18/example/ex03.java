package study.ch18.example;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
class Student {
    private String name;
    private int id;
    static int nextId = 0;

    public Student(String name) {
        this.name = name;
        this.id = nextId++;
    }

    public static int getStudentCount() {
        return nextId;
    }
}

public class ex03 {
    public static void main(String[] args) {
        Student s1 = new Student("김");
        Student s2 = new Student("이");
        Student s3 = new Student("박");
        System.out.println(Student.getStudentCount());
    }
}
