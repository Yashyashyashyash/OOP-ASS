 import java.util.Scanner;

public class SearchingMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements (sorted in ascending order):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        int choice;
        do {
            System.out.println("\nChoose a searching technique:");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search (Non-recursive)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int linearIndex = linearSearch(arr, target);
                    if (linearIndex != -1) {
                        System.out.println(target + " found at index " + linearIndex);
                    } else {
                        System.out.println(target + " not found in the array.");
                    }
                    break;
                case 2:
                    int binaryIndex = binarySearch(arr, target);
                    if (binaryIndex != -1) {
                        System.out.println(target + " found at index " + binaryIndex);
                    } else {
                        System.out.println(target + " not found in the array.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (choice != 3);

        scanner.close();
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Element not found
    }
}
