import java.util.*;

/*
Oppgave 1)
Fullfør de tre metodene addSalary, updateSalary og addKid for en person
 */

public class Person {
    private UUID socialSecurityNumber;
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = UUID.randomUUID();
    }
    public UUID getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
