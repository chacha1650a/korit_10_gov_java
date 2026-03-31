package study.ch09.Example;

class Dog {
    String name;
    int age;
}

public class Ex01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.name);
        System.out.println(dog.age);

    }
} // 실행 결과 : Dog 클래스에 String name;과 int age;를 선언하였지만
  // 밑의 main 메서드에서 따로 초기화 시켜주지 않았기에 null과 0가 출력 된다.
