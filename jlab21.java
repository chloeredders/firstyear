public class jlab21{
    public static void main(String[] args) {
        
        int interger;
        

        System.out.print("Enter an number: ");
        interger = EasyIn.getInt();

        if(interger<0){
            System.out.println("This number is less than 0");
        }

        if (interger>0){
            System.out.println("This number is greater than 0");
        }
        
        if (interger == 0){
            System.out.println("The number is the same");
        }
    
        
    }   
}