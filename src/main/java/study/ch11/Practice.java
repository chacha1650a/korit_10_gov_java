package study.ch11;

class Parent {
    private String name;

    public Parent() {}

    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("학생 이름 : " + name);
    }

}

class Child extends Parent {
    public Child(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }

}

public class Practice {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child("김대훈");
        child.showInfo();
    }
}

