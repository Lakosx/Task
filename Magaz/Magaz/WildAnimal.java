package Magaz;

import java.awt.*;
import java.util.Random;

public class WildAnimal extends Animal {
    private Color color;
    private String wildType;
    Random random = new Random();
    private Color[] colors = {Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED, Color.CYAN};
    private String[] names = {"Croco", "Lion", "Pelican", "Bear", "Topkek"};

    public WildAnimal(int price) {
        super(price);
        int colorPos = random.nextInt(colors.length);
        int namesPos = random.nextInt(colors.length);
        this.color = colors[colorPos];
        this.wildType = names[namesPos];

    }

    public Color getColor() {
        return color;
    }

    public String getWildType() {
        return wildType;
    }
}