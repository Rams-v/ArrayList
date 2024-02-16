// Name: Ramitha V
// PRN: 22070126082
// Batch: AIML B1

public class Main {
    // Method to print elements of even and odd arrays
    public static void print(double[] even, int indexEven, double[] odd, int indexOdd) {
        // Print elements in the even array
        System.out.println("The elements in the even array are: ");
        for (int i = 0; i < indexEven; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        // Print elements in the odd array
        System.out.println("The elements in the odd array are: ");
        for (int i = 0; i < indexOdd; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Input.getInput();
    }
}

