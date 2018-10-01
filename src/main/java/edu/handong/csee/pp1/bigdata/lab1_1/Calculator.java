// This is an one line comment.
/*
 * This is a block comment. You can write comments in multiple lines.
 */
/* 
 * A package is a namespace where your related classes and interfaces are grouped.
 * When you share your program to other developers,
 * other developers can import the package and can use classes and interfaces in the package
 */
package edu.handong.csee.pp1.bigdata.lab1_1; 


/**
 * @author JC
 * We are defining a class which is a blueprint of our Calculator object.
 */
public class Calculator {

	// An object has data and actions
	// Object data are any variables/constants in this area
	// (in 'class' definition but not in method definitions.)
	// We call all variables defined in this area as member variables or fields.
	
	// static decides how this variable can be accessed and maintained.
	// Static variables are shared by all objects crated by this class definition.
	static int countForAnyCompution = 0;
	// private member variable is used by only one object can can't be shared by other objects
	//
	private int localCount = 0;
	
	public static void main(String[] args) {
		 Calculator myCalulator = new Calculator();
		 
		 myCalulator.execute(args[0], args[1]);
	}

	private void execute(String firstArg, String secondArg) {
		int firstIntArg = Integer.parseInt(firstArg);
		int secondIntArg = Integer.parseInt(secondArg);
		
		countForAnyCompution=0;
		localCount = 0;
		
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
		localCount++;
		return first + second;
	}
	
	int subtract(int first, int second) {
		countForAnyCompution++;
		localCount++;
		return first + second;
	}
	
	int multiply(int first, int second) {
		countForAnyCompution++;
		localCount++;
		return first * second;
	}

	int divide(int first, int second) {
		countForAnyCompution++;
		localCount++;
		return first / second;
	}
	
	int mod(int first, int second) {
		// TODO implement the body of this method
		return 0;
	}
	
	static int getCount() {
		return countForAnyCompution;
	}
	
	int getLocalCount() {
		return localCount;
	}
}
