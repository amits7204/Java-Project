package entitylogic;
import java.util.Scanner;
public class ExecuteEntityLogic extends EntityLogic{
	public int mData = 20;
	public int mSecondData = super.mData;//access data member of parent class
	/**
	 * Overloading Method
	 * @param aFirstvalue
	 * @param aSecondValue
	 */
	public void multiply(int aFirstvalue, int aSecondValue) {
		int lResult = aFirstvalue * aSecondValue;
		System.out.println("Multiplication value of: "+lResult);
	}
	/**
	 * Overloading Method
	 * @param aFirstint
	 * @param aSecondInt
	 * @param aThirdInt
	 */
	public void multiply(int aFirstint, int aSecondInt, int aThirdInt) {
		int lMultiplicationResult = aFirstint * aSecondInt * aThirdInt;
		System.out.println("Multiplication with three value: "+lMultiplicationResult);
	}
	/**
	 * Overriding Method
	 */
	public void findMissingvalue() {
		System.out.println("Find Missing Value: ");
		super.findMissingvalue();
	}
	public static void main(String[] args) {
		/**
		 * Aggregation concept
		 * if a class have entity reference, its known as aggregation
		 * it is also known as HAS-A relationship
		 */
		ProgrammerDetails lPd = new ProgrammerDetails("Amit Singh", "Bengaluru", "amits7204@gmail.com",
								26, 8697903433L, "Trioka Software Pvt ltd", "Software Engineer", 180000.00f);
		lPd.displayProgrammerDetails();
		/**
		 * Scanner use To read Input
		 */
		Scanner lSc = new Scanner(System.in);
		System.out.println("Enter Any number: ");
		int lOddEvenValue = lSc.nextInt();
		/**
		 * Inheritance(IS-A) Concept
		 * Child object acquires all properties and behaviors of a Parent Object
		 * we can achieve inheritance through extends and Implements
		 * we can't use multiple inheritance  
		 */
		ExecuteEntityLogic lEEL = new ExecuteEntityLogic();
		lEEL.oddEven(lOddEvenValue);
		lSc.close();
		Scanner lStringReverse = new Scanner(System.in);
//		System.out.println("Would you like to write your name: ");
		ExecuteEntityLogic lReverseStrObj = new ExecuteEntityLogic();
		//String lStringText = lStringReverse.nextLine();
		lReverseStrObj.reverseString("Hello Amit");
		lStringReverse.close();
//		Accessing static method fullPattern() and field by class name itself
		EntityLogic.fullPattern();
		/**
		 * OverLoading
		 * Overloading also known as compile time Polymorphism 
		 * Overloading has same method but number of arguments is different and data type is different
		 * overloading increase the readability of the program
		 */
		ExecuteEntityLogic lOverLoadingEEL = new ExecuteEntityLogic();
		lOverLoadingEEL.multiply(lOverLoadingEEL.mData, lOverLoadingEEL.mSecondData);
		lOverLoadingEEL.multiply(24, 12, 4);
		ExecuteEntityLogic lOverRidingEEL = new ExecuteEntityLogic();
		lOverRidingEEL.findMissingvalue();
	}
}
