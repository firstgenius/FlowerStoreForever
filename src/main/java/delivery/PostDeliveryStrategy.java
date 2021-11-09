package delivery;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public String deliver(List list) {
        System.out.println("The Items will be delivered by post");
        return "The Items will be delivered by post";
    }
}
