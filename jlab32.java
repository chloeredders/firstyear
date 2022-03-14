public class jlab32 {
    public static void main(String[] args) {
        int numOne;
        int numTwo;
        int numThree;
        int sum;

        System.out.println("Enter first number: " );
        numOne = EasyIn.getInt();

        System.out.println("Enter second number: " );
        numTwo = EasyIn.getInt();

        System.out.println("Enter Third number: " );
        numThree = EasyIn.getInt();

        sum = numOne+numTwo+numThree;
        while(sum != 0){
            System.out.println("The sum of the value is " + sum);
            break;
        }

    }
    
}
