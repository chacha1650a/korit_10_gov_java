package study.ch19.example;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>(List.of("Java", "Python", "Java", "C++", "Python", "Go"));
        ArrayList<String> results = new ArrayList<>();


        for (int i = 0; i < subjects.size(); i++) {
            String subject = subjects.get(i);
            if (!results.contains(subjects.get(i))) {
                 results.add(subject);
            }
        }
        System.out.println(results);
    }
}
