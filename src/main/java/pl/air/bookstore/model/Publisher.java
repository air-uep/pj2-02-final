package pl.air.bookstore.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Publisher extends BaseEntity {

    private String name;
    private String location;

    // ********** Constructors **********
    public Publisher(String name) {
        this.name = name;
    }


    // ********** Business methods **********

    public String getFullName() {
        String fullName = name;
        if (location != null) {
            fullName += ", " + location + " (id=" + id + ")";
        }
        return fullName;

        // wersja skrócoa
        //return name + (location != null ? " , " + location : "") + " (id=" + id + ")";
    }

}
