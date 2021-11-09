package flowerstore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Setter @Getter @ToString
public class Flower extends Item {
    private double price;
    private int amount;
    private double sepalLength;
    private int[] color;
    private FlowerType flowerType;

    public Flower() {

    }

    public void setColor(int[] color){
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flowerType){
        this.flowerType = flowerType;
    }

    @Override
    public double getDescription() {
        return 0;
    }
}
