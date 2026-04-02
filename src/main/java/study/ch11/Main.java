package study.ch11;

import java.lang.reflect.Array;
import java.util.Arrays;

class Animal {
    private String name;

    // 기본 생성자(NoArgumentsConstructor)
    public Animal () { }

    // 전체 생성자(AllArgumentsConstructor)
    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "이(가) 밥을 먹습니다.");
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
    }
}


class Dog extends Animal{
    // Dog 필드 값
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    // Dog 메서드
    public void bark() {
        System.out.println(super.getName() + "이(가) 멍멍 짖습니다.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("품종: " + breed);
    }
}

class Cat extends Animal{
    // Cat 필드 값
    private String color;

    public Cat(String name, String breed) {
        super(name);
        this.color = breed;
    }

    // Cat 메서드
    public void grooming() {
        System.out.println(super.getName() + "이(가) 그루밍을 합니다.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("색: " + color);
    }
}


public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog("바둑이", "진돗개");
        Cat cat = new Cat("야옹이", "검은색");

        dog.showInfo();
        cat.showInfo();

        Animal[] animals = new Animal[6];

        animals[0] = new Animal("그냥 동물");
        animals[1] = new Cat("야옹이", "흰색");
        animals[2] = new Dog("콩이", "말티즈");
        animals[3] = new Dog("두부", "말티즈");
        animals[4] = new Cat("네오", "블랙");
        animals[5] = new Animal("무슨 동물");

        for (Animal a : animals) {
            a.showInfo();
            if (a instanceof Dog) {
                ((Dog) a).bark();
            } else if (a instanceof Cat) {
                ((Cat) a).grooming();
            } else {
                System.out.println("기능을 가지지 않은 동물입니다.");
            }
        }
    }
}
