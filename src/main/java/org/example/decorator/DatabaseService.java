package org.example.decorator;

public class DatabaseService {
    public String getMailFromUsername(String username){
        return username + "@gmail.com";
    }

    public String getPhoneNrFromUsername(String username) {
        return username + " 000000 ";
    }
}
