package org.company.paymentmicroservice.services;

import org.company.paymentmicroservice.paymentgateway.PaymentGatewaySelector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentGatewaySelector paymentGatewaySelector;

    public String getPaymentLink(String email, String phoneno, String orderId, String name, Long amount){
        return paymentGatewaySelector.getPaymentGateway().getPaymentLink(email, phoneno, orderId, name, amount);
    }
}
