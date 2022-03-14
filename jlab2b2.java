public class jlab2b2 {
    public static void main(String[] args) {
       double intrest1;
        double intrest2;
        double amountowed;
        double intrest;
        double total;
        double vodka;
        double minCredit;


        System.out.println("please enter amount owed: ");
        amountowed = EasyIn.getDouble();
        intrest1 = EasyIn.getDouble();
        intrest2 = EasyIn.getDouble();

        intrest = 0.12;
        intrest2 = 0.18;
        vodka = 500;

        if (amountowed <= 500) {
            minCredit  = intrest * vodka;
            = amountowed * intrest1;

            System.out.println("You owe this amount" + total );
        }
        else if(amountowed > 500) {

        }

    }
    
}
