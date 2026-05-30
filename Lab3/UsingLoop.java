//Wap to display a number from 1000 to 151 using for loop, while loop and do while looppackage Lab3;

public class UsingLoop {
    public static void main(String[] args) {
        System.out.println("Using for loop:");
        for (int i = 1000; i >= 151; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nUsing while loop:");
        int j = 1000;
        while (j >= 151) {
            System.out.print(j + " ");
            j--;
        }
        System.out.println("\nUsing do-while loop:");
        int k = 1000;
        do {
            System.out.print(k + " ");
            k--;
        } while (k >= 151);
    }
    
}
