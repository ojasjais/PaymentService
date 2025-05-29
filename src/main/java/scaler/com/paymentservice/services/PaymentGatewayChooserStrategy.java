package scaler.com.paymentservice.services;

import org.springframework.stereotype.Service;
import scaler.com.paymentservice.services.paymentgateway.PaymentGateway;
import scaler.com.paymentservice.services.paymentgateway.RazorpayPaymentGateway;

@Service
public class PaymentGatewayChooserStrategy {
    private RazorpayPaymentGateway razorpayPaymentGateway;

    public PaymentGatewayChooserStrategy(RazorpayPaymentGateway razorpayPaymentGateway) {
        this.razorpayPaymentGateway = razorpayPaymentGateway;
    }

    public PaymentGateway getBestPaymentGateway() {
        // Some logic to chooese the best payment gateway
        return razorpayPaymentGateway;
    }
}
