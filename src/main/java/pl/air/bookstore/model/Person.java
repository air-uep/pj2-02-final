package pl.air.bookstore.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person extends BaseEntity {

	protected String firstName;
	protected String middleName;
	protected String lastName;

	// ********** Constructors **********
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	// ********** Business methods **********

	public String getFullName() {
		String fullName = firstName;
		if (middleName !=  null) {
			fullName += " " + middleName;
		}
		fullName += " " + lastName + " (id=" + id + ")";
		return fullName;

		// wersja skrócona
		//return firstName + (middleName != null ? " " + middleName : "") + " " + lastName + " (id=" + id + ")";
	}

	public void printInfo() {
		String fullName = getFullName();
		System.out.println(fullName);
	}

}
