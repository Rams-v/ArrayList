import java.util.Scanner;

public class Input {
    public static void getInput() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of elements in the array
        System.out.println("Enter the number of elements of array: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];

        // Prompt user to enter elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        // Print the elements of the array
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        double[] even = new double[n];
        double[] odd = new double[n];
        int indexEven = 0;
        int indexOdd = 0;

        // Iterate through the array to separate even and odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[indexEven] = arr[i];
                indexEven++;
            } else {
                odd[indexOdd] = arr[i];
                indexOdd++;
            }
        }

        // Call the print method from the Main class to display the results
        Main.print(even, indexEven, odd, indexOdd);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
