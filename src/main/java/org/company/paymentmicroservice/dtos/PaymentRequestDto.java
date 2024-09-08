package org.company.paymentmicroservice.dtos;

import lombok.Data;

@Data
public class PaymentRequestDto {
    private String email;
    private String phoneno;
    private String orderId;
    private String name;
    private Long amount;
}
