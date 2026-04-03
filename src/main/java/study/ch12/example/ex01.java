package study.ch12.example;


class Animal {
    private String name;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "이(가) 밥을 먹는다.");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void bark() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, boolean isIndoor) {
        super(name);
        this.isIndoor = true;
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void meow() {
        System.out.println("야옹!");
    }
}


public class ex01 {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Dog dog = new Dog("바둑이", "진돗개");
        Cat cat = new Cat("야옹이", true);

        dog.bark();
        cat.meow();

        dog.eat();
        cat.eat();
    }
}
