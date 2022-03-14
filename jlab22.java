public class jlab22 {
    public static void main(String[] args) {
        
        int Math;
        int Programming;
        int Hardware;
        int results;
    
        System.out.print("Enter Maths results: ");
        Math = EasyIn.getInt();

        System.out.println("Enter Programming results: ");
        Programming = EasyIn.getInt();

        System.out.println("Enter Hardware results: ");
        Hardware = EasyIn.getInt();

        results = (Math+Hardware+Programming)/3;
         
        // if statements used to check what grade person has recieved using AND AND logical operator.

        System.out.print("Your averege grade is: ");
        if(results >= 100 ) {
             System.out.print("Distinction"); // >= is greater then or equal to and <= is less then or equal to.
         }
        else if (results >=69  ){
            System.out.println("Merit1"); //&& is a logical AND AND operator to show true or false.
        }
       else if (results >=55  ){
            System.out.println("Merit2");
        }
        else if (results >=40  ){
            System.out.println("Pass");
        }
       else if (results < 40){
            System.out.println("Fail");
        }
        
        
            
        
    
    }
    
}
