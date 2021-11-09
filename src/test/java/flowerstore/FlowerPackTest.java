package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack = new FlowerPack();
    private Flower flower = new Flower(FlowerType.CHAMOMILE);
    @BeforeEach
    void setUp() {
        flowerPack.setFlower(flower);
        flowerPack.setAmount(100);
        flower.setPrice(100);
    }

    @Test
    void getPrice() {
        assertEquals(10000, flowerPack.getPrice());
    }
}