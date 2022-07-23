package com.xpay;

import com.xpay.Xpay;
import com.xpay.PayD;

public class RunAdaptorExample{
    public static void name(String[] args) {

        // Objects for Xpay

        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("18893000068");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)233);
        xpay.setAmount(2565.3);

        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);
        

    }
}