package org.company.paymentmicroservice.paymentgateway;

public interface PaymentGateway {
    public String getPaymentLink(String email, String phoneno, String orderId, String name, Long amount);
}
