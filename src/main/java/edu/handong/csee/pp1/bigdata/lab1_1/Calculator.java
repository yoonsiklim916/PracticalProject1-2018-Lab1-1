// This is an one line comment.
/*
 * This is a block comment. You can write comments in multiple lines.
 */
package edu.handong.csee.pp1.bigdata.lab1_1;

public class Calculator {

	static int countForAnyCompution = 0;
	
	public static void main(String[] args) {
		 Calculator myCalulator = new Calculator();
		 
		 myCalulator.execute(args[0], args[1]);
	}

	private void execute(String firstArg, String secondArg) {
		int firstIntArg = Integer.parseInt(firstArg);
		int secondIntArg = Integer.parseInt(secondArg);
		
		countForAnyCompution=0;
		
		print("SUM:" , sum(firstIntArg, secondIntArg));
		print("SUB:" , this.subtract(firstIntArg, secondIntArg));
		print("*:" , multiply(firstIntArg, secondIntArg));
		print("DV:" , divide(firstIntArg,secondIntArg));
	}
	
	void print(String prefix, int result) {
		System.out.println(prefix + " " + result);
	}
	
	int sum(int first, int second) {
		countForAnyCompution++;
		return first + second;
	}
	
	int subtract(int first, int second) {
		countForAnyCompution++;
		return first + second;
	}
	
	int multiply(int first, int second) {
		countForAnyCompution++;
		return first * second;
	}

	int divide(int first, int second) {
		countForAnyCompution++;
		return first / second;
	}
	
	static int getCount() {
		return countForAnyCompution;
	}
}
