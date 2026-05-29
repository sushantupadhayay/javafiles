package lab1;
public class fabo {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=a+b;
       while(c<=1000){
        System.out.print ( "  "+c);
        a=b;
        b=c;
        c=a+b;

       }
        
    }
}
