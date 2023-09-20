package org.example.visitor;

public class Bank extends Client{
    public Bank(String name, String address, String number) {
        super(name, address, number);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBank(this);
    }
}
