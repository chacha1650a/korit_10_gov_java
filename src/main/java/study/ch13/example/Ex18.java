package study.ch13.example;

import java.util.Arrays;

interface Sortable{
    void sort();
    void printResult();
}

class NumberSorter implements Sortable {
    int[] arr;

    NumberSorter(int[] arr) {
        this.arr = Arrays.copyOf(arr, arr.length);
    }

    @Override
    public void sort() {
        Arrays.sort(arr);
    }

    @Override
    public void printResult() {
        System.out.println(Arrays.toString(arr));
    }
}

class StringSorter implements Sortable {
    String[] arr;

    StringSorter(String[] arr) {
        this.arr = Arrays.copyOf(arr, arr.length);
    }

    @Override
    public void sort() {
        Arrays.sort(arr);
    }

    @Override
    public void printResult() {
        System.out.println(Arrays.toString(arr));
    }
}

public class Ex18 {
    public static void main(String[] args) {
        Sortable[] sortables = {
                new NumberSorter(new int[]{5, 1, 2 ,7 , 19}),
                new StringSorter(new String[]{"Java", "C", "C#", "C++", "Python", "JS"})
        };
        for (Sortable s : sortables) {
            s.sort();
            s.printResult();
        }
    }

}