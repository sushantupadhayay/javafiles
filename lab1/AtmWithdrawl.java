package lab1;
import java.util.Scanner;

class AtmWithdrawl{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int balance=1000;
        System.out.println("enter withdrawl amount");
        int amount=sc.nextInt();
        if (amount <=1000 && amount <= balance) {
            balance= balance - amount;
            System.out.println("the widrawl is successful");
            System.out.println("Remaining Balance:" +balance);
        }
                else{
                    System.out.println("The widrawl is not successful");
                }
                sc.close();
            }
        }
        
    
