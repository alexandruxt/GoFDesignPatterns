package org.example.chainOfResponsibility;

public class UserExistsHandler extends Handler{
    private Database database;

    public UserExistsHandler(Database database){
        this.database = database;
    }
    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.print("This username is not registered");
            System.out.println("Sign up to app now!");
            return false;
        }
        return handleNext(username, password);
    }
}
