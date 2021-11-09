package orders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.Receiver;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Receiver expReceiver;
    Order order;

    @BeforeEach
    void setUp() {
        order = new Order();
        expReceiver = new Receiver();
    }


    @Test
    void addUser() {
        order.addUser(expReceiver);
        assertEquals(order.users.size(), 1);
    }

    @Test
    void removeUser() {
        order.removeUser(expReceiver);
        assertEquals(order.users.size(), 0);
    }
}