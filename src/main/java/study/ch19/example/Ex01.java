package study.ch19.example;


import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>(List.of(85, 92, 78, 96, 88));
        int max = numList.getFirst();
        int total = 0;
        double avg;

         for (Integer score : numList) {
             total += score;
             if (score > max) max = score;
         }
         avg = (double) total / numList.size();

        System.out.println("전체 점수: " + numList);
        System.out.println("평균: " + avg);
        System.out.println("최고점: " + max);
    }
}
