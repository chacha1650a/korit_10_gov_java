package study.ch14;

import java.util.Arrays;

class Student extends Object {
    private String name;
    private int score;

    Student() { }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "이름 : " + name + " 점수 : " + score;
    }
}

public class ToString {
    public static void main(String[] args) {
        Student student = new Student("김대훈", 87);
        System.out.println(student);
        System.out.println(student);
        String a = student.toString();
        System.out.println(a);

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));

    }
}
