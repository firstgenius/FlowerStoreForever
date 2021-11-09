package orders;

import flowerstore.Flower;
import flowerstore.FlowerBucket;
import users.User;

import java.util.ArrayList;
import java.util.List;

public class Order {
    FlowerBucket flowerBucket;
    public static int userID = 0;
    public List<User> users = new ArrayList<>();

    public Order(FlowerBucket flowerBucket){
        this.flowerBucket = flowerBucket;
    }

    public Order() {

    }

    public void addUser(User newUser) {
        users.add(newUser);
    }

    public void removeUser(User oldUser) {
        users.remove(oldUser);
    }

    public void notifyUsers() {
        for (User user : users) {
            user.update("Update");
        }
    }
    public void order() {
        notifyUsers();
    }
}