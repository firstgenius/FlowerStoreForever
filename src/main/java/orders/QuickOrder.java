package orders;

import flowerstore.FlowerBucket;

public class QuickOrder {

    public static Order createOrder(FlowerBucket flowerBucket) {
        return new Order(flowerBucket);
    }
}

