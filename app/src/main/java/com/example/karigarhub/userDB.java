package com.example.karigarhub;

/**
 * Created by haseeb haider on 2/13/2018.
 */

public class userDB {
    String userId;
    String FirstName;
    String LastName;
    String PhoneNo;
    String CNIC;
    String Email;
    String Password;

    public userDB() {
    }

    public userDB(String userID,String PhoneNo,String FirstName, String LastName, String CNIC, String Email, String Password) {
        this.userId=userID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNo = PhoneNo;
        this.CNIC = CNIC;
        this.Email = Email;
        this.Password = Password;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public String getCNIC() {
        return CNIC;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

}

