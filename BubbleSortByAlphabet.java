package question4;
import java.util.Arrays;

public class BubbleSortByAlphabet {
    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] letters = {'d', 'a', 'c', 'b', 'f', 'e'};
       
        bubbleSort(letters);

        System.out.println("Array after being sorted: " + Arrays.toString(letters));
    }
}
