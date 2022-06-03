import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        int[] result = new int[array.size()];
        int counter = 0;

        for (Integer i : array) {
            if (i > 0) {
                result[counter] = i;
                counter++;
            }
        }

        counter = 0;

        for (int i : result) {
            if (i % 2 == 0 && i != 0) {
                result[counter] = i;
                counter++;
            }
        }

        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < counter - 1; j++) {
                if (result[j] > result[j + 1]) {
                    int changer = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = changer;
                }
            }
        }

        for (int i = 0; i < counter; i++) {
            System.out.println(result[i]);
        }
    }
}
