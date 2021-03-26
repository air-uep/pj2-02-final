package pl.air.bookstore.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.codec.digest.DigestUtils;

@Getter
@Setter
public class User extends Person {
	
	private String login;
	private String password;
	private String passwordHash;

	// ********** Constructors **********
	public User(String firstName, String lastName, String login, String password) {
		super(firstName, lastName);
		this.login = login;
		//this.password = password;
		this.passwordHash = getHash(password);
	}


	// ********** Business methods **********

	private String getHash(String password) {
		String md5Hex = DigestUtils.md5Hex(password);
		return md5Hex;
	}

	public boolean verifyPassword(String password) {
		String hash = getHash(password);
		if (this.passwordHash.equals(hash)) {
			return true;
		}
		else {
			return false;
		}
		// wersja skrócona
		// return this.passwordHash.equals(getHash(password))
	}

	// metoda setPassword została zaimplementowana literalnie
	// literalna implementacja metody setPassword "powstrzyjmuje" plugin Lombok
	//                                 od automatycznego generowania tej metody
	public void setPassword(String password) {
		//this.password = password;
		this.passwordHash = getHash(password);
	}

	public void printInfo() {
		super.printInfo();
		System.out.println(" - login: " + login);
		System.out.println(" - password hash: " + passwordHash);
	}

}
