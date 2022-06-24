package com.syntax.class20;

public class UserClass {
    /*
    Write a program: userClass that has a
    constructor that initializes instance
    variable name and mobile number.
    Create a subclass userinfo that will
    have user address variable and it is
    also being initialized through
    constructor call. Print user name,
    mobile number and address in
    userDetails method. Test your code.
     */

    String userName, address;
    int mobileNum;

    static class UserInfo extends UserClass {
        public UserInfo(String name, int mobileNum, String address) {
            this.userName = name;
            this.mobileNum = mobileNum;
            this.address = address;
        }
    }

    void info() {
        System.out.println("User name is: " +userName+ ", mobile number is: " +mobileNum+ " and the address is: " + address);
    }

    public static void main(String[] args) {
        UserInfo userinfo = new UserInfo("Jane", 5551212, "123 Happy St, San Francisco, CA");
        userinfo.info();
    }
}
