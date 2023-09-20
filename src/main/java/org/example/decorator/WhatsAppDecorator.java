package org.example.decorator;

public class WhatsAppDecorator extends BaseNotifierDecorator{
    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }
    @Override
    public void send(String msg) {
        super.send(msg);
        String phoneNr = databaseService.getPhoneNrFromUsername(getUsername());
        System.out.println("Sending to phone number");
    }
}
