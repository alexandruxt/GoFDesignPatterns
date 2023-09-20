package org.example.visitor;

public interface Visitor {
    void visitBank(Bank bank);
    void visitRestaurant(Restaurant restaurant);
    void visitResident(Resident resident);
}
