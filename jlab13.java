public class jlab13 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int result; 
        int averge;

        System.out.println("Enter First number: ");
        number1 = EasyIn.getInt();

        System.out.println("Enter Second number");
        number2 = EasyIn.getInt();

        result = number1+number2;
        averge = result/2;

        System.out.print("answer = " + averge);


    }
    
}
