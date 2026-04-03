package study.ch14;

// Animal은 최상위 객체인 Object를 상속받고 있음
class Animal {

}

// Animal을 상속 받으면 Object도 함께 상속을 받음.
class Duck extends Animal {

}

public class Main {
    public static void main(String[] args) {
        // 최상위 객체 (Object)

        // Object 자료형 AutoBoxing이 일어나기에 다른 모든 자료형을 대입 할 수 있다.
        Object a = 10;
        Object b = 3.14;
        Object c = "김대훈";
        Object d = 'a';
        Object e = new Animal();

        // Wrapper Class()
        Integer integer = (Integer) 10; // 일반 자료형 -> 클래스 자료형(Boxing)
        int i = (int) integer;  // 클래스 자료형 -> 일반 자료형(UnBoxing)

        // Java는 Boxing, UnBoxing이 자동으로 일어나는걸 AutoBoxing이라고 한다

//        int i2 = null;
        Integer integer2 = null;

        System.out.println(((int)a) + ((double)b));

    }
}
