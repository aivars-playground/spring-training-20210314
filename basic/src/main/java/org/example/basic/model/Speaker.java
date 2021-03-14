package org.example.basic.model;

import javax.validation.constraints.Size;

@lombok.Data
public class Speaker {

    @Size(min = 3, max = 20)
    private final String firstName;
    private final String lastName;
}
