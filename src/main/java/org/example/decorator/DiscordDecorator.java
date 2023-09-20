package org.example.decorator;

public class DiscordDecorator extends BaseNotifierDecorator{

    public DiscordDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg){
        super.send(msg);
        System.out.println("Sending to discord");
    }
}
