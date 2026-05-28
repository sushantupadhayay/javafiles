//wap to take your name as input and display greeting message using scanner class
// wap to take Two numbers as a input and display  As product
import java.util.Scanner;
class Greeting{
   public static void main(String...args){
   Scanner sc= new Scanner(System.in);
  System.out.println("Enter your name");
 String name=sc.nextLine();
 sc.close();
 System.out.println("your name is "+ name);
  }
 }