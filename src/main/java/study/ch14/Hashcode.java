package study.ch14;

import java.util.Objects;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }

    @Override
    public String toString() {
        return "강아지 | " +
                "이름 : " + name +
                ", 나이 : " + age;
    }
}

public class Hashcode {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 10);
        Dog dog2 = new Dog("콩이", 10);
        System.out.println(dog.hashCode());
        System.out.println(dog2.hashCode());
        Dog[] dogs = {
                new Dog("콩이2", 11),
                new Dog("콩이3", 12),
                new Dog("콩이4", 11),
                new Dog("콩이", 10)
        };

        int hashcode = Objects.hash("콩이3", 12);
        Dog foundDog = null;
        for (Dog d : dogs) {
            if(d.hashCode() == hashcode) {
                foundDog = d;
                break;
            }
        }
        System.out.println(foundDog);
    }
}
