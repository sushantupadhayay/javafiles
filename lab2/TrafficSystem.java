import java.util.Scanner;
class TrafficSystem{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter traffic light color (1 for red, 2 for yellow, 3 for green):");
        int trafficLight = sc.nextInt();
        switch(trafficLight){
            case 1:
                System.out.println("red light");
                break;
            case 2:
                System.out.println("yellow light");
                break;
            case 3:
                System.out.println("green light");
                break;
            default:
                System.out.println("invalid traffic light");
        }
    }
}