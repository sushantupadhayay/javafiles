
//WAP program using switch case to take grade as a input and convert 
// //respective gpa based PU grading system
import java.util.Scanner;

public class GradingSyetem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade (A,A-,B,B-,C,C-, D,D-, F): ");
        String gradeInput = scanner.nextLine().toUpperCase(); // Convert input to uppercase for consistency
        
        double gpa;

        switch (gradeInput) {
            case "A":
                gpa = 4.0;
                break;
                case "A-":
                gpa = 3.7;  
                break;  
                case "B+":
                gpa = 3.3;
                    break;
                    case "B-":
                gpa = 2.7;      
                break;
                case "C+":
                gpa = 2.3;
                break;
                case "C-":
                gpa = 1.7;      
                break;
                case "D+":
                gpa = 1.3;  
        
                break;
                case "F":
                gpa = 0.0;
                break;
                default:
                System.out.println("Invalid grade input."); 
                return; // Exit the program if the grade is invalid
        }       
         System.out.println("The GPA for grade " + gradeInput + " is: " + gpa);
    
    }
}
