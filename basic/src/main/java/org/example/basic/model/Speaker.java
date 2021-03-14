package org.example.basic.model;

import javax.validation.constraints.Size;

@lombok.ToString
public class Speaker {

    private String firstName;

    @Size(min = 1, max = 2, message = "lastName must be between 1 and 2 characters")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Size(min = 1, max = 2, message = "lastName must be between 1 and 2 characters")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
