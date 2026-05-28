
import java.util.Scanner;

public class DivideByZero{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        try {
            int n1= sc.nextInt();
            int n2= sc.nextInt();
            int c=n1/n2;
            System.out.println(c);
            
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        } catch(Exception e){
         System.out.println("Enter valid number"+e.getMessage());
        }
        sc.close();
        
       }
 
}