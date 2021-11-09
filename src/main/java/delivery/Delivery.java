package delivery;

import java.util.List;

public interface Delivery<Item> {
    String deliver(List<Item> items);
}
