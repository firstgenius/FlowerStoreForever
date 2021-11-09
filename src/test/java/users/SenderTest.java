package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    Receiver sender;

    @BeforeEach
    void setUp() {
        sender = new Receiver();
        sender.setId(5);
    }

    @Test
    void getId() {
        assertEquals(sender.getId(), 5);
    }
}
