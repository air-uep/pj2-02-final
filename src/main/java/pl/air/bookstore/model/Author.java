package pl.air.bookstore.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.text.WordUtils;

@Getter
@Setter
public class Author extends Person {

    private String profile;

    // ********** Constructors **********
    public Author(String firstName, String lastName) {
        super(firstName, lastName);
    }


    // ********** Business methods **********
    public void printInfo() {
        super.printInfo();
        if (profile != null) {
            String profilePrint = WordUtils.wrap(profile, 70);
            System.out.println(profilePrint);
        }
    }

}
