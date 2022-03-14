public class jlab2b1 {
    public static void main(String[] args) {
       
        double percentageAdded;
        double PercentageDiscount;
        double premiumum;
        double PremiumumIncrease;
        int noclaims;
        double chargeExtra;
        int claims;
            //asking required questions 
        System.out.println("Enter your Policy number: ");
        

        System.out.println("last years premium you recieved: ");
        premiumum = EasyIn.getDouble();

        System.out.println("Have you made any claims in past year:");
        noclaims = EasyIn.getInt();

        //mental maths :P
        PremiumumIncrease = EasyIn.getDouble();
        claims = EasyIn.getInt();
        percentageAdded = (PremiumumIncrease * 5 / 100);

        // if statments dick heads
        if (noclaims ==0){
            PercentageDiscount = (PremiumumIncrease *40 / 100);
            percentageAdded = PercentageDiscount + premiumum;
            // shitty resultos 
            System.out.println("Your premium this year is: " + percentageAdded);
        }
       else if (claims !=0){
            chargeExtra = (claims*20)*(premiumum*(claims/100));
            percentageAdded = chargeExtra + premiumum;
            // results nice 
            System.out.println("Your premium this year " + premiumum);
        }
    }
    
}
