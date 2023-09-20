package org.example.facade;

public class BuyCryptoFacade {
    public void buyCryptoCurrency(double amount, String currency){
        DatabaseService dbService = new DatabaseService();
        User user = dbService.getUser(UIService.getLoggedInUserId());
        if (user.getBalance() < amount){
            System.out.println("Insufficient balance");
            return;
        }
        CryptoFactory.getCryptoService(currency).buyCurrency(user, amount);
    }
}
