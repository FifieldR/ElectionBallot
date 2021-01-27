/**rfifield
 * Jan 27, 2021
 */

/**@author rfifield
 * History
 * Jan 27, 2021
 * 
 */
public class Candidate {
	//Vars
	String firstName;
	String lastName;
	String grade;

	/**
	 * @param firstName
	 * @param lastName
	 * @param grade
	 */
	public Candidate(String firstName, String lastName, String grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}
			
	//@return the firstName
	public String getFirstName() {
		return firstName;
	}
	// @param firstName the firstName to set
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//@return the lastName
	public String getLastName() {
		return lastName;
	}
	// @param lastName the lastName to set
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//@return the grade
	public String getGrade() {
		return grade;
	}
	// @param grade the grade to set
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
