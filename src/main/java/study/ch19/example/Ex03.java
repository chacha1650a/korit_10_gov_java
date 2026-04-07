package study.ch19.example;

import java.util.ArrayList;
import java.util.Collections;

public class Ex03 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList();
        ArrayList<Integer> sortList = new ArrayList<>();
        ArrayList<Integer> sortList2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numList.add(i + 1);
        }

        for (int i = 0; i < numList.size(); i++) {
            int num = numList.get(i);
            if (num % 3 == 0) sortList2.add(num);
        }

        Collections.reverse(sortList2);
        System.out.println(sortList2);
    }
}
// 출력: [18, 15, 12, 9, 6, 3]