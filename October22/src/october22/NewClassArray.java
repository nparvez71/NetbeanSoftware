package october22;

import java.util.Arrays;

public class NewClassArray {

    public static void main(String[] args) {
        int[][] data = {{1, 2, 3}, {5, 7, 8}};
        System.out.println("");
        for (int[] d : data) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.print(a+"");
            }
            System.out.println("");

        }
    }

}
