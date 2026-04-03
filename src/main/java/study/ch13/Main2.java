package study.ch13;

abstract class AbstractAnimal {
    private String name;
    public AbstractAnimal() {}
    public AbstractAnimal(String name) {this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// extends는 단일 상속 하나만 가능하지만, implements는
class Duck extends AbstractAnimal implements Flyable, Swimmable {

    public Duck() {
        super();
    }

    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " 날기!");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " 수영하기!");
    }
}

class Dog extends AbstractAnimal implements Swimmable {
    @Override
    public void swim() {

    }
}


public class Main2 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        AbstractAnimal animal = new Duck();
        Flyable flyable = new Duck();
        Swimmable swimmable = new Duck();

        duck.setName("꽥꽥이");
        System.out.println(duck.getName());
        duck.swim();
        duck.fly();

        animal.setName("옆집 오리");
        System.out.println(animal.getName());

        flyable.fly();

        swimmable.swim();
    }
}
