package com.xpay;

public interface PayD {

    public String getCustCardNo();
    public String getCardOwnerName();
    public String getCardExpMonthDate();
    public Integer getCVVNo();
    public Double getTotalAmount();

    public void setCustCardNo (String creditCardNo);
    public void setCardOwnerName (String customerName);
    public void setCardExpMonthDate (String cardExpMonth);
    public void setCVVNo (Integer CVVNo);
    public void setTotalAmount (Double Amount);

}
