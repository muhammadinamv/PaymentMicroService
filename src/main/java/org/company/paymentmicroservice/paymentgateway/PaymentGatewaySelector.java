package org.company.paymentmicroservice.paymentgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewaySelector {
    @Autowired
    private RazorPaymentGateway razorPaymentGateway;

    public PaymentGateway getPaymentGateway() {
        return razorPaymentGateway;
    }
}
