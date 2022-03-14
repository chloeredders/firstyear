class jlab24 {
    public static void main(String[] args) {
        int numone;
        int numtwo;
        int numthree;

        System.out.print("Enter first number ");
        numone = EasyIn.getInt();

        System.out.print("Enter second number ");
        numtwo = EasyIn.getInt();

        System.out.print("Enter third number");
        numthree = EasyIn.getInt();
         if (numone % numtwo ==0 &&numone % numthree ==0){
            System.out.print("is evenly divided");//checkin if number is evenly divided
         }
        if((numone % numtwo == 0)||(numone%numthree==0)){ // usuing the % operator as if divides and leaves a remandiar//usuing the logial OR operator for when one condiotn becomes zero it become true
            System.out.println("this number is divesable by one or 2 numbers");//checkinf if number can be divided by 1 or 2 numbers
        }
        if (numone%numtwo==0){
            System.out.println("This number is exaclty divisable by " + numtwo);
         }
        else if(numone%numthree==0){
            System.out.print("This number is exactly divasble by " + numthree);
        }
        else{
            System.out.println("This number cant be divded by either number");
        }






       
    }
    
}
