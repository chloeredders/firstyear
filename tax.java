public class tax{

    public static void main(String[] args) {

        double tax;
        int children;
        double allowence;
        double gross;
        double netpay;
        double answer;

        System.out.print("Enter gross pay");
        gross = EasyIn.getDouble();

        System.out.println("Enter amount of children");
        children = EasyIn.getInt();

        tax=gross*24/100;
        netpay=gross-tax;
        answer=netpay+5000;
        allowence=1000*children;

        answer=answer+allowence;
        System.out.println("Your Annual income is: " + answer);
        
    }
}