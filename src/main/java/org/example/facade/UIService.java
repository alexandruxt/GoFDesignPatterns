package org.example.facade;

public class UIService {
    public static String getLoggedInUserId() {
        return "LoggedInUserId";
    }
    public boolean logIn(String username, String password){
        return true;
    }

    public boolean logout(){
        return true;
    }
}
