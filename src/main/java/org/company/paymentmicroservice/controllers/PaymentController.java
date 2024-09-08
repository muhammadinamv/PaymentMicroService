package org.company.paymentmicroservice.controllers;

import org.company.paymentmicroservice.dtos.PaymentRequestDto;
import org.company.paymentmicroservice.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping
    public String initiatePayment(@RequestBody PaymentRequestDto paymentRequestDto){
        return paymentService.getPaymentLink(paymentRequestDto.getEmail(),
                paymentRequestDto.getPhoneno(),
                paymentRequestDto.getOrderId(),
                paymentRequestDto.getName(),
                paymentRequestDto.getAmount());
    }
}
