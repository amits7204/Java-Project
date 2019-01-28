package entitylogic;

public class ProgrammerDetails {
	public String mProgrammerName, mProgrammerCity, mProgrammerEmail;
	public int mAge;
	public long mContactNumber;
	public String mCurrentCompany, mDesignation;
	public float mSallary;
	
	public ProgrammerDetails(String aProgrammerName, String aProgrammerCity,
							String aProgrammerEmail, int aAge, long aContactNumber,
							String aCurrentCompany, String aDesignation, float aSallary) {
		this.mProgrammerName = aProgrammerName;
		this.mProgrammerCity = aProgrammerCity;
		this.mProgrammerEmail = aProgrammerEmail;
		this.mAge = aAge;
		this.mContactNumber = aContactNumber;
		this.mCurrentCompany = aCurrentCompany;
		this.mDesignation = aDesignation;
		this.mSallary = aSallary;
	}
	
	public void displayProgrammerDetails() {
		System.out.println("==========================================================");
		String lProgrammerName = String.format("Programmer Name:"+"%1$20s", mProgrammerName);
		String lProgrammerCity = String.format("Programmer City: "+"%1$20s", mProgrammerCity);
		String lProgrammerEmail = String.format("Programmer Email: "+"%1$20s", mProgrammerEmail);
		String lAge = String.format("Programmer Age: "+"%1$20s", mAge);
		String lContactNumber = String.format("Programmer Contact Number: "+"%1$20s", mContactNumber);
		String lCurrentCompany = String.format("Programmer Company Name: "+"%1$20s", mCurrentCompany);
		String lDesignation = String.format("Programmer Designation: "+"%1$20s", mDesignation);
		String lSallary = String.format("Programmer P/A Sallary: "+"%1$20s", mSallary);
		System.out.println(lProgrammerName);
		System.out.println(lProgrammerCity);
		System.out.println(lProgrammerEmail);
		System.out.println(lAge);
		System.out.println(lContactNumber);
		System.out.println(lCurrentCompany);
		System.out.println(lDesignation);
		System.out.println(lSallary);
		System.out.println("==========================================================");
	}
}
