public class jlab23 { 
    public static void main(String[] args) {
        
        int yourinput;

        System.out.print("Enter an number: ");
        yourinput = EasyIn.getInt();
        
        if (yourinput %2 == 0){
            System.out.print("Even number");
        }
        else {
            System.out.print("Odd number");
        }
    }
    
}
