//wap to show an exmaples of jumping statement Break,continue,and return 


public class JumpingStatement {
    public static void main(String[] args) {
        System.out.println("Example of break statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.print(i + " ");
        }
        System.out.println("\nExample of continue statement:");
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.print(j + " ");
        }
        System.out.println("\nExample of return statement:");
        int result = calculateSum(5);
        System.out.println("The sum of numbers from 1 to 5 is: " + result);
    }

    public static int calculateSum(int n) {
        if (n <= 0) {
            return 0; // Return 0 for non-positive numbers
        }
        int sum = 0;
        for (int k = 1; k <= n; k++) {
            sum += k;
        }
        return sum; // Return the calculated sum
    }
    
}
