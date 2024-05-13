package question1;
import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        System.out.print("Enter a number to search for: ");
        int searchNumber = scanner.nextInt();

        
        int count = 0;
        for (int num : numbers) {
            if (num == searchNumber) {
                count++;
            }
        }

       
        if (count > 0) {
            System.out.println(searchNumber + " is present in the array " + count + " times.");
        } else {
            System.out.println(searchNumber + " is not present in the array.");
        }

        scanner.close();
    }
}

