package com.syntax.replit.hw070222;

public class EncapsulationPerson182 {

    /*
    Encapsulation
    Create a Person class with the following:
    Class Variables:
    - firstname
    - lastname
    - birthmonth
    - birthday
    - birthyear
    - String ssn
    Constructor:
    The main constructor should take in all values  and assign
    them to their respective private class variables.
    Methods:
    Create a public getters to access all the variables.
    Create a public method called formatBirthday, which will
    return a String composed of their birthday in mm/dd/yyyy
    format. For example, if birthmonth = 3, birthday = 22,
    birthyear = 2000, it should return the String "3/22/2000"
    in Main class.
    Instantiate an object of Person and provide values.
    Follow below outputs for values.
    Using getter and method print them separately.
    Note: Read carefully the steps.
    Expected Output:
    John
    Doe
    10/25/1900
    123-45-6789
     */

    private String firstname, lastname;
    private int birthmonth, bithday, birthyear, ssn;

    //Getter methods:
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getBirthmonth() {
        return birthmonth;
    }
    public int getBithday() {
        return bithday;
    }
    public int getBirthyear() {
        return birthyear;
    }
    public int getSsn() {
        return ssn;
    }
    public int formatBirthday; {

    }
}
