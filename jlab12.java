public class jlab12 {
    public static void main(String[] args) {
        
        double miles;
        double hours;
        double gallons;
        double AverageSpeed;
        double Averagegallons;
        
        System.out.println("your Distance Travelled: ");
        miles = EasyIn.getDouble();

        System.out.println("Hours Spent Travelling: ");
        hours = EasyIn.getInt();

        System.out.println("How much petrol you used: ");
        gallons = EasyIn.getDouble();

        AverageSpeed = miles/hours;
        Averagegallons = miles/gallons;
    

        System.out.print("The averge of the speed is" + AverageSpeed);

        System.out.println("The averge of gallons used is " + Averagegallons);

    }   
    
}
