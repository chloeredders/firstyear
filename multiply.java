class multiply{
	public static void main(String [] args) {
		int number1;
		int number2;
		int answer;

		System.out.println("Enter first number");
		number1 = EasyIn.getInt();

		System.out.println("Enter second number");
		number2 = EasyIn.getInt();
		answer = number1*number2;
		System.out.println("the sum of two numbers is " + answer);
	}
}