interface Payment {
    void processPayment();
}

class CreditCardPayment implements Payment {
    public void processPayment() {
        System.out.println("Processing Credit Card Payment");
    }
}

class PayPalPayment implements Payment {
    public void processPayment() {
        System.out.println("Processing PayPal Payment");
    }
}

class UpiPayment implements Payment {
    public void processPayment() {
        System.out.println("Processing UPI Payment");
    }
}

abstract class PaymentFactory {
    public abstract Payment createPayment();
}

class CreditCardPaymentFactory extends PaymentFactory {
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}

class PayPalPaymentFactory extends PaymentFactory {
    public Payment createPayment() {
        return new PayPalPayment();
    }
}

class UpiPaymentFactory extends PaymentFactory {
    public Payment createPayment() {
        return new UpiPayment();
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentFactory factory = new UpiPaymentFactory();
        Payment payment = factory.createPayment();
        payment.processPayment();
    }
}
