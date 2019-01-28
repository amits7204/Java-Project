package entitylogic;

public class EntityLogic {
	
	public int mData = 10;
	//for Odd Even Logic
	public void oddEven(int aValue) {
		for(int i = 1; i<=aValue; i++) {
			if(i%2==0) {
				System.out.println("#Even: "+i);
			}else {
				System.out.println("@Odd: "+i);
			}
		}
	}
	
	//Reverse String Logic
	public void reverseString(String aStringValue) {
		System.out.println("Enter reverseString Method");
		String[] lStringValue = aStringValue.split(" ");
		System.out.println("String Element of Value: ");
		String lReverseString = "";
		for(int i = 0; i<lStringValue.length; i++) {
			String lString = lStringValue[i];
//			System.out.println(lString);
			String lRS = "";
			for(int j = lString.length()-1; j>=0; j--) {
				lRS = lRS+lString.charAt(j);
			}
			lReverseString = lReverseString + lRS + " ";
			
		}
		System.out.println(aStringValue);
		System.out.println(lReverseString);
		
	}
	
//	palindrome Logic 
	public void palindrome() {
		System.out.println("Entered Palindrome Method");
	}
	
//	Full Pattern
	public static void fullPattern() {
		System.out.println("Entered full Pattern Method: ");
	}
	
//	Half Pattern
	public void halfPattern() {
		System.out.println("Entered halfPattern: ");
		
	}
	
//	add two numbers
	public void addTwonumbers(int aFirstNumber, int aSecondNumber) {
		System.out.println("Entered add two number Method: ");
		
	}
	
//	find missing values
	public void findMissingvalue() {
		System.out.println("Entered find missing value method: ");
	}
}