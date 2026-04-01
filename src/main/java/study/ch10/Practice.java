package study.ch10;

public class Practice {
    public static void main(String[] args) {

        int[][] array = {

                {1, 2, 3, 4, 5},
                {6, 7, 8, 9}
        };

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                int result = array[i][j];

                System.out.print(array[i][j] + "\t");

                if(array[i][j] % 3 == 0) {
                    System.out.println();
                } else if (array[i][j] == 0) {
                    System.out.println();
                }
            }
        }
    }
}
