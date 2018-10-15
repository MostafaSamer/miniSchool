package miniSchool;

public class Person {

	public String Name;
	public String Email;
	private int SSN;
	
	public Person (String name, String email, int ssn) {
		
		this.Name = name;
		this.Email = email;
		this.SSN = ssn;
		
	}
	
	public boolean changeSSN (int oldSSN, int newSSN) {
		
		if (oldSSN == this.SSN) {
			
			setSSN(newSSN);
			return true;
			
		}
		
		return false;
		
	}
	
	public Person () {
		
	}
	
	public int getSSN() {
		
		return SSN;
		
	}
	
	public void setSSN(int sSN) {
		
		SSN = sSN;
		
	}
	
}
