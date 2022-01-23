package com.baeldung.chainofresponsabilityguru;

public class TechnicalSupportHandler extends AbstractSupportHandler {

    public TechnicalSupportHandler(int level){
        this.level = level;
    }
    @Override
    protected void handleRequest(String message) {
        System.out.println("TechnicalSupportHandler: Processing request " + message);
    }
}
