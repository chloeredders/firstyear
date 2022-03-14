public class jlab5 {
    public static void main(String[] args) {
        double loanamount;
        double intrest;
        int payback;
        double result;
        double payed;

        System.out.println("Enter amount of loan you would like: ");
        loanamount = EasyIn.getDouble();
         
        System.out.println("Enter your rate of intrest: ");
        intrest = EasyIn.getDouble();
        
        intrest =( intrest/100)/12;

        System.out.println("Enter how man months you to pay back: ");
        payback = EasyIn.getInt();
        
        payback = payback * 12;

        result= loanamount* intrest;
         
        payed = loanamount - result;
         


        System.out.println("The amount you have payed back: " + payed);

       
    }
    
}
