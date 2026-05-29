package lab2;

public class ClassExamples {
    //conditional statements
    //if statement  
    public static void main(String[] args) {
        int num = 10;
        if (num > 0) {
            System.out.println("The number is positive.");
        }
        //if-else statement
        int number = -5; 
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
        //if-else if statement
        int value = 0;          
        if (value > 0) {
            System.out.println("The value is positive.");
        } else if (value < 0) {
            System.out.println("The value is negative.");
        } else {
            System.out.println("The value is zero.");
        }
        //looping statements
        //for loop  
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        //while loop
        System.out.println("While loop:");  
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }
        //do-while loop
        System.out.println("Do-while loop:");   
        int num1 = 1;
        do {
            System.out.println(num1);
            num1++;
        } while (num1 <= 5);
        //jump statements
        //break statement   
        System.out.println("Break statement:");
        for (int i = 1; i <= 10; i++) {                     
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println(i);
        }
        //continue statement
        System.out.println("Continue statement:");  
        for (int i = 1; i <= 10; i++) {                     
            if (i % 2 == 0) {
                continue; // Skip the rest of the loop when i is even
            }
            System.out.println(i);
        }

    }

    
}
