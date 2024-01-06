package demo1;

public class TestDemo1 {
	public static void main(String[] args) {
		System.out.println("Demo 1.. ");

	  // Perform basic arithmetic operations
		
		double num1 =0;
		double num2 =0;
	/**
	 sum = num1 + num2
        difference = num1 - num2
       product = num1 * num2	
	quotient = num1 / num2	Cannot divide by zero.
		*/
	}
	public void arithmetic(double num1, double num2){
		if (num2 != 0) {
         double   quotient = num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
        }
		
	 // Display the results	
	System.out.println("Sum: " + num1+num2);
        System.out.println("Difference: " +( num1-num2));
        System.out.println("Product: " + num1*num2);
        System.out.println("Quotient: " + num1/num2);	
		

	}
	

}
