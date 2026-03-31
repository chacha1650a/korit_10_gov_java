package study.ch09;

import study.ch09.entity.Teacher;
import study.ch09.entity.User;

// 접근 제한자가 없는 경우를 default 상태라고 한다
// 같은 패키지 내에서는 public 제한자 없이도 접근이 가능하다.
// public 제한자는 외부에서도 접근이 가능하게 해준다
// private 제한자는 같은 클래스에서만 접근을 가능하게 해준다(Getter/Setter로 우회 가능)

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "김대훈";
        s1.age = 20;
        s1.printInfo();

        // 클래스(파일)에 대한 접근 제한 / 생성자(데이터)에 대한 접근 제한
        Teacher t1 = new Teacher("김준일", 33);

        User user = new User("chacha16050a");
        user.setPassword("1111");
        user.setName("김대훈");
        user.getName();

        System.out.println(user.getName());
        System.out.println(user.getUsername());


    }
}
