package study.ch08;

public class OBJ3 {
    public static void main(String[] args) {
        class Student {
            String name;
            int age;

            // 변수의 우선 순위는 지역이 더 높다.
            // 그러므로 name = name;와 같은 코드를 작성하게 된다면
            // Student와 같은 클래스의 내부에선 매개변수 name으로 인식하기에 this.로 참조를 해줘야 한다.
            Student(String name, int age) {
                System.out.println("학생 생성");
                this.name = name;
                this.age = age;
                System.out.println(name);
                System.out.println(age);

            }

        }

        Student s1 = new Student("김대훈", 20);
        Student s2 = new Student("김소훈", 21);
    }
}
