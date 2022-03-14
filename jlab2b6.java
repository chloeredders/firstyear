public class jlab2b6 {
    public static void main(String[] args) {
        int numinput;
        int choice;

        //process 
       
       
        System.out.println(" 1: Fahrenheit to celcius");
        System.out.println(" 2: Celcius to Fahrenheit");
        System.out.println(" 3: Inches to Centimetres");
        System.out.println(" 4: Centimeters to Inches");
        System.out.println(" 5: Pounds to Kilograms");
        System.out.println(" 6: Kilograms to pounds");
        
        choice = EasyIn.getInt();
        System.out.println("Please Enter a number to be converted: ");
         numinput = EasyIn.getInt();
        
       double output;
        switch (choice){
            case 1: output = (numinput-32)*5/9;
            System.out.println("The temp in celcius is" + output);
            break;
            case 2: output = (numinput*9/5+32);
            System.out.println("The temp in fahrenheit is" + output);
            break;
            case 3: output = (numinput*0.39);
            System.out.println("The lenght in centimeters is " + output);
            break;
            case 4: output = (numinput*2.54);
            System.out.println("The lenght in inches is " + output);
            break;
            case 5: output = (numinput/2.2);
            System.out.println("The value in kg is " + output);
            break;
            case 6: output = (numinput*2.2);
            System.out.println("The value in pounds is " + output);
            break;
        }
    
    
    
    
    }
    
}
