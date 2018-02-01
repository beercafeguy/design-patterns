package com.github.beercafeguy.design.strategy.shopping;

public class PaytmStrategy implements PaymentStrategy{
    private String mobileNo;
    private String otp;

    public PaytmStrategy(String mobileNo, String otp) {
        this.mobileNo = mobileNo;
        this.otp = otp;
    }

    public void pay(Double amount) {
        System.out.println("Rs."+amount+" has been paid using PayTM");
    }
}
