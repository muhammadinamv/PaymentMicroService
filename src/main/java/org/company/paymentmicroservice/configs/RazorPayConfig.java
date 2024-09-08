package org.company.paymentmicroservice.configs;

import com.razorpay.RazorpayClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorPayConfig {

    @Value("${razorpay.id}")
    private String razorPayId;

    @Value("${razorpay.secret}")
    private String razorPaySecret;

    @Bean
    public RazorpayClient getRazorpayClient() {
        System.out.println(razorPayId);
        try {
            return new RazorpayClient(razorPayId, razorPaySecret);
        }
        catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        return null;
    }

}
