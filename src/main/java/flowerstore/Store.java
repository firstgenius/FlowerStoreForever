package flowerstore;

import lombok.Getter;
import lombok.Setter;


public class Store {
    public int amountRoses = 143;
    public int amountTulips = 15;
    public int amountChamomiles = 35;

    // search returns whether store has enough needed flowers to complete ur order
    public boolean search(Flower flower) {
        if (flower.getFlowerType().equals(FlowerType.CHAMOMILE)){
            return (flower.getAmount() <= amountChamomiles);
        }
        if (flower.getFlowerType().equals(FlowerType.ROSE)){
            return (flower.getAmount() <= amountRoses);
        }
        if (flower.getFlowerType().equals(FlowerType.TULIP)){
            return (flower.getAmount() <= amountTulips);
        }
        return false;
    }
}
