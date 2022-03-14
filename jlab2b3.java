public class jlab2b3 {
    public static void main(String[] args) {
        //varibles 
        int numOne;
        int numTwo;
        int numThree;

        //printing
        System.out.println("Please Enter three numbers: ");
        numOne = EasyIn.getInt();
        numThree = EasyIn.getInt();
        numTwo = EasyIn.getInt();
        

    
        

        if (numOne<=numTwo && numOne <= numThree ){
            
            System.out.print( numOne + " This number is the lowest. ");
        }
        else if (numTwo <= numOne && numThree >= numTwo){
            
            System.out.println( numTwo + " This number is the lowest. ");
        }
    
        else{
            System.out.println( numThree + " This is the lowest number. ");
        }
    
    }
    
}
