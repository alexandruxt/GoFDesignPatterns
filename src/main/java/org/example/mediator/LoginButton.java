package org.example.mediator;

public class LoginButton implements Component{
    private Mediator mediator;
    public LoginButton(){

    }
    protected void fireActionPerformed(){
        mediator.login();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "Login Button";
    }
}
