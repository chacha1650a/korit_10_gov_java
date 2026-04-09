package study.ch22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda03 {
    public static String search(List<String> list, Predicate<String> p) {
        for (String s : list) {
            if (p.test(s)) return s;
        }
        return null;
    }

    public static void applicationMain(Runnable runnable) {
        System.out.println("프로그램 시작");
        runnable.run();
        System.out.println("프로그램 종료");
    }

    public static List<Integer> createNumListOfRange(int multiNum,  Function<Integer, List<Integer>> f) {
        return f.apply(multiNum);
    }

    public static void main(String[] args) {
        List<String> names = List.of("박준일", "김준이", "이준삼");
        String foundName = search(names, name -> name.startsWith("김"));
        System.out.println(foundName);

        applicationMain(() -> {
            List<Integer> numList = createNumListOfRange(10, (multiNum) -> {
                int start = 1;
                int end = 20;
                List<Integer> nums = new ArrayList<>();
                for (int i = start; i < end + 1; i++) {
                nums.add(i * multiNum);
                }
                return nums;
            });
            System.out.println(numList);
        });
        System.out.println("프로그램 진짜 최종 종료");
    } // 람다를 사용하여 기존 코드를 건드리지 않고 실행 되지 않고 간결하게 사용 할 수 있다는 장점이 있음.
}
