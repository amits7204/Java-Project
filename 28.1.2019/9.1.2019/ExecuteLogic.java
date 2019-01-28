import java.util.Scanner;
public class ExecuteLogic extends LogicalCode{

	public void addTwoNumber(int a, int b){
		int z;
		z = a + b;
		System.out.println("Add Two Number: "+z);
	}
	public void patternLogic(){
		int n = 5;
		for (int i = 1;i<=n;i++) {
			for (int j = 1;j<=i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void oddEvenLogic(){
		int a = 10;
		for (int i = 1;i<=a;i++) {
			if (i%2==0) {
				System.out.println("EVEN NUMBER: "+i);
			}else{
				System.out.println("ODD NUMBER: "+i);
			}
		}
	}
	public static void main(String[] args){
		Scanner lSc = new Scanner(System.in);
		System.out.println("Enter a first sum Number: ");
		int lSum1 = lSc.nextInt();
		System.out.println("Enter a Second sum Number: ");
		int lSum2 = lSc.nextInt();
		LogicalCode lLogicalCode = new ExecuteLogic();
		lLogicalCode.addTwoNumber(lSum1, lSum2);
		lLogicalCode.patternLogic();
		lLogicalCode.oddEvenLogic();
	}
}