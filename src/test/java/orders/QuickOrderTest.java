package orders;

import flowerstore.FlowerBucket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickOrderTest {
    FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    void createOrder() {
        Order order = QuickOrder.createOrder(flowerBucket);
        assertEquals(order.flowerBucket, flowerBucket);
    }
}