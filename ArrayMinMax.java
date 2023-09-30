import java.util.Scanner;

public class ArrayMinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1D Array Input
        System.out.print("Enter the number of elements in the 1D array: ");
        int n1D = scanner.nextInt();
        int[] arr1D = new int[n1D];

        System.out.println("Enter the elements of the 1D array:");
        for (int i = 0; i < n1D; i++) {
            arr1D[i] = scanner.nextInt();
        }

        // 2D Array Input
        System.out.print("Enter the number of rows in the 2D array: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns in the 2D array: ");
        int numCols = scanner.nextInt();
        int[][] arr2D = new int[numRows][numCols];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                arr2D[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Find min and max for 1D array
        int min1D = findMin(arr1D);
        int max1D = findMax(arr1D);

        // Find min and max for 2D array
        int min2D = findMin(arr2D);
        int max2D = findMax(arr2D);

        // Output results
        System.out.println("\n1D Array:");
        System.out.println("Smallest element: " + min1D);
        System.out.println("Largest element: " + max1D);

        System.out.println("\n2D Array:");
        System.out.println("Smallest element: " + min2D);
        System.out.println("Largest element: " + max2D);
    }

    // Find the smallest element in an array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Find the largest element in an array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Find the smallest element in a 2D array
    public static int findMin(int[][] arr) {
        int min = arr[0][0];
        for (int[] row : arr) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    // Find the largest element in a 2D array
    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }
}
