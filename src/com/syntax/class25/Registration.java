package com.syntax.class25;

public class Registration {

    /*
    Create Registration Class in which you would have variables as email, userName and password that have
    an access scope only within its own class. After creating an object of the class user should be able
    to call methods and in each method separately pass values to set users email, username and password.
    Requirements:
    Valid email consider to be only yahoo
    Valid userName and password cannot be empty and should be of length larger than 6 characters. Also, valid
    password cannot contain userName.
     */
    //HW5:

    private String email;
    private String userName;
    private String password;
    public void setEmail(String email) {
        if (!email.contains("yahoo")) {
            System.out.println("Please provide a yahoo email");
        } else {
            this.email = email;
        }
    }
    public void setUserName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("User name cannot be blank. Please provide a user name");
        } else if (userName.length() <= 6){
            System.out.println("Please provide a username that is larger than 6 characters");
        } else {
            this.userName = userName;
        }
    }
    public void setPassword(String password) {
        if (password.contains(userName)) {
            System.out.println("Password cannot contain the username");
        } else if (password.length() <= 6) {
            System.out.println("Please provide a password that is larger than 6 characters");
        } else {
            this.password = password;
        }
    }
    public String getEmail() {
    return email;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
}
class Login2Email extends Registration {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("yahoo.com");
        System.out.println("Email: " + registration.getEmail());
        registration.setUserName("SyntaxTester123");
        System.out.println("Username: " + registration.getUserName());
        registration.setPassword("Password123");
        System.out.println("Password: " + registration.getPassword());
    }
}
