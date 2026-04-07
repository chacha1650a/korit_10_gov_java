package study.ch19;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();

        // 값 추가(중복 X)
        strSet.add("a");
        strSet.add("a");
        strSet.add("a");
        strSet.add("a");

        System.out.println(strSet);

        // 값을 조회하는 방법

        Set<User> userSet = new HashSet<>(Set.of(
                new User(1, "aaa"),
                new User(2, "bbb"),
                new User(3, "ccc")
        ));
        System.out.println(userSet);
        int id = 3;
        for (User user : userSet) {
            if (user.getId() == id) {
                System.out.println("3번 아이디를 찾았습니다.");
                System.out.println(user);
            }
        }
    }
}
