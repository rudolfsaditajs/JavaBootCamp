/**
 * 
 */
package sef.module4.activity;

/**
 * @author 
 *
 */




public class Calculator {
	
	public static void main(String[] args) {
		
	}

	
	public String calculatorType;
	public static final String CALC_TYPE_BASIC = "Basic";
	
	// Default constructor
	public Calculator() {}
	
	// Parameterized constructor
	public Calculator(String calculatorType) {
		this.calculatorType = calculatorType;
	}

	// Getter for CalculatorType
	public String getCalculatorType() {
		return calculatorType;
	}

	// Setter for CalculatorType
	public void setCalculatorType(String calculatorType) {
		this.calculatorType = calculatorType;
	}
	
	// Add 
	public static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	// Subtract
	public static int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			diff = x - y;
		} else {
			diff = y - x;
		}

		return diff;
	}

	// Multiply
	public static int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;

	}

	// Divide
	public static int divide(int x, int y) {
		int divValue = 0;
		if (x == 0 || y == 0) {
			divValue = 0;
		} else {
			divValue = x / y;
		}
		return divValue;

	}
}
