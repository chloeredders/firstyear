public class jlab2b5 {
    public static void main(String[] args) {
        int  month = 12;
        String months;

        System.out.print("Enter number of month of choice: ");
        month= EasyIn.getInt();

        switch (month){
        case 1: months = "Janruary";
        break;
        
        case 2: months="February";
        break;

        case 3: months = "March";
        break;
        
        case 4: months = "April";
        break;

        case 5: months = "May";
        break;
        
        case 6: months = "June";
        break;

        case 7: months = "July";
        break;

        case 8: months = "Augest";
        break;

        case 9: months = "September";
        break;

        case 10: months = "October";
        break;

        case 11: months = "November";
        break;

        case 12: months = "December";
        break;
    
        default: months ="invalid month";
        break;

        }
        
        System.out.println( months);
    }
    
}
