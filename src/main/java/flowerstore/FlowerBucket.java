package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public void addFlowerPack(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
    }

    public double getPrice(){
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).getPrice();
        }
        return price;
    }

    @Override
    public double getDescription() {
        return 0;
    }
}
