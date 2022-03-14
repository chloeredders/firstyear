public class jlab2b4 {
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
            
            System.out.print(" The lowest number in order is:  " +numOne + numTwo + numThree);
        }
        else if (numTwo <= numOne && numThree >= numTwo){
            System.out.println("The lowest number in order is: " + numOne + numTwo + numThree);
        }
    
        else{
            System.out.println("The lowest number in order is: " + numOne + numTwo + numThree);
        }
    }
    
}
