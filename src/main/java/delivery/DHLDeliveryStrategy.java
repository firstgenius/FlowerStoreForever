package delivery;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public String deliver(List list) {
        System.out.println("The Items will be delivered by DHL");
        return "The Items will be delivered by DHL";
    }
}
