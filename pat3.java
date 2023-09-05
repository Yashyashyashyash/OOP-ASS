import java.util.Scanner;

public class pat3{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >i; j--) {
                System.out.print("  ");
            }
    
            
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" "); 
            }
               System.out.println();
        }
    }
}