package org.example.visitor;

import java.util.List;

public class InsuranceMessagingVisitor implements Visitor{

    public void sendInsuranceMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }
    public void visitBank(Bank bank){
        // visiting bank and sending them an email
    }
    public void visitResident(Resident resident){
        // visiting bank and sending them an email
    }
    public void visitRestaurant(Restaurant restaurant){
        // visiting bank and sending them an email
    }
}
