import java.util.Scanner;

public class merging
 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for array P
        System.out.print("Enter the number of elements in array P: ");
        int m = scanner.nextInt();
        int[] P = new int[m];

        System.out.println("Enter the elements of array P (sorted in ascending order):");
        for (int i = 0; i < m; i++) {
            P[i] = scanner.nextInt();
        }

        // Input for array Q
        System.out.print("Enter the number of elements in array Q: ");
        int n = scanner.nextInt();
        int[] Q = new int[n];

        System.out.println("Enter the elements of array Q (sorted in ascending order):");
        for (int i = 0; i < n; i++) {
            Q[i] = scanner.nextInt();
        }

        int[] R = mergeArrays(P, Q);

        // Display the merged array R
        System.out.println("Merged array R:");
        for (int value : R) {
            System.out.print(value + " ");
        }

        scanner.close();
    }

    public static int[] mergeArrays(int[] P, int[] Q) {
        int m = P.length; // Length of array P
        int n = Q.length; // Length of array Q
        int[] R = new int[m + n]; // Resultant array R

        int i = 0, j = 0, k = 0;

        // Merge elements from P and Q into R while maintaining the sorted order
        while (i < m && j < n) {
            if (P[i] < Q[j]) {
                R[k++] = P[i++];
            } else {
                R[k++] = Q[j++];
            }
        }

        // Copy the remaining elements of P, if any
        while (i < m) {
            R[k++] = P[i++];
        }

        // Copy the remaining elements of Q, if any
        while (j < n) {
            R[k++] = Q[j++];
        }

        return R;
    }
}
