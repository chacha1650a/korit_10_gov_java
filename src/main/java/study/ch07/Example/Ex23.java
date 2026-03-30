package study.ch07.Example;

public class Ex23 {
    public static void main(String[] args) {
         for(int i = 0; i < 37; i++) {
             if (i == 0) {
                 continue;
             }

             if (36 % i == 0) {
                 System.out.print(i + "\t");
             }
         }
    }
 }
