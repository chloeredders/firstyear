public class convertinches{
    public static void main(String[] args) {
        
        double inches;
        double centimeters;

        System.out.print("Enter a number in inches ");
        centimeters = EasyIn.getDouble();
        
        inches= 2.54*centimeters;

        System.out.println("inches to centimeters is: " + inches);

    }
}