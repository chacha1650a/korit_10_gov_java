package study.ch12;

abstract class AA {

}

class BB extends AA {

}

class CC extends BB {

}

class MM {

public static void main(String[] args) {
//    AA a = new AA(); // 추상 클래스이기에 생성 불가능
    BB b = new BB();
    AA b2 = new BB();
    AA c = new AA() { // 이름 없는 객체(업캐스팅이 되며 c에 대입) - 단, 다운캐스팅 불가능

    };
    AA cc = new CC();
    AA ccc = new BB() {

    };

}
        }

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Cat cat = new Cat();

        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal() {
            // 익명 클래스 - 상속을 할 때 사용
            @Override
            public void eat() {

            }
        };

    }
}
