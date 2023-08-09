package exercises;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 10.0;
        double num2 = 5;
        char operator = '='; // Change this to the desired operator (+, -, *, /)

        double result=0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
            	result = num1 / num2;
                break;
            
            default:
                System.out.println("Invalid operator");
                
        }

        System.out.println("Result: " + result);

	}

}
