 class ArrayIndexDemo{
    public static void main(String...arg){
        String[] names={"S","U","S","A","N","IS","MY","NAME"};
        try{
            for(int i=0; i<=7; i++){
                System.out.print ("  "+ names[i]);
            }
        }
            catch(ArrayIndexOutOfBoundsException aiob){
                System.out.println(aiob.getMessage());
            }
    
    }
 }