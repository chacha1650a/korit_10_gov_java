package study.ch04;

public class Main {
    public static void main(String[] args) {
        String name1  = "김대훈"; //
        String name2  = "김대훈";
        String name3 = new String("김대훈"); // new String은 새로운 주소값 생성

        boolean result = name1 == name2;
        boolean result2 = name1.equals(name3);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name1 + name2 + name3);
        System.out.println(result);
        System.out.println(result2); // name1과 name2는 주소값이 같으나 name3는 아예 새로운 주소기에 false가 출력된다


        String msg = String.format("점수: %.1f점", 95.5);
        System.out.println(msg);

    }
}
