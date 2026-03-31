package study.ch09.entity;

public class Teacher {
    private String name;
    private int age;
    private int money;

    public Teacher () {}

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        this.money = 100000;
    }

    public void printInfo() {
        System.out.println("선생님 이름 : " + name);
        System.out.println("선생님 나이 : " + age);
        System.out.println("-------------");
    }

    private void MoneyCalculator(int beforeCalc) {
        this.money = (int) (beforeCalc - beforeCalc * 0.01);
    }
}
