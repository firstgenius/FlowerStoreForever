package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    Receiver receiver;

    @BeforeEach
    void setUp() {
        receiver = new Receiver();
        receiver.setId(5);
    }

    @Test
    void getId() {
        assertEquals(receiver.getId(), 5);
    }
}
