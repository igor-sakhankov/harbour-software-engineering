package harbour.lecture7;

public class Main {

    public static void main(String[] args) {
        var o = new Object();

        System.out.println(o.hashCode());
        System.out.println(o.hashCode());
        System.out.println(o.hashCode());
    }

    public void processOrder(String customerName, String productName, int quantity, float price, String paymentMethod, String deliveryAddress) {
        // implementation here
    }

    public class OrderDetails {
        private String customerName;
        private String productName;
        private int quantity;
        private float price;

        // getters and setters
    }

    public class PaymentDetails {
        private String paymentMethod;
        private float price;

        // getters and setters
    }

    public class DeliveryDetails {
        private String customerName;
        private String deliveryAddress;

        // getters and setters
    }

    public void processOrder(OrderDetails orderDetails) {
        // implementation here
    }

    public void processPayment(PaymentDetails paymentDetails) {
        // implementation here
    }

    public void processDelivery(DeliveryDetails deliveryDetails) {
        // implementation here
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
