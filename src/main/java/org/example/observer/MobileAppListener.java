package org.example.observer;

public class MobileAppListener implements EventListener{

    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }
    @Override
    public void update(Event eventType) {
        // send to username
        System.out.println("Sending to " + username);
    }
}
