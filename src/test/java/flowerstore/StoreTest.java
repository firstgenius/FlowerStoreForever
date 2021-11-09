package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store store = new Store();
    private Flower flower = new Flower(FlowerType.CHAMOMILE);
    @BeforeEach
    void setUp() {
        flower.setAmount(400);
    }

    @Test
    void search() {
        assertEquals(false, store.search(flower));
    }
}