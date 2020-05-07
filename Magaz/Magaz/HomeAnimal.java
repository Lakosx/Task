package Magaz;

import java.util.Random;

public class HomeAnimal extends Animal {
    private String name;
    private String homeType;
    Random random = new Random();
    private String[] names = {"Bobik", "Kotik", "Kiska", "Miska", "Kekmek"};
    private String[] types = {"Kat", "Dog", "Bird", "Rat", "Rabbit"};

    public HomeAnimal(int price) {
        super(price);
        int namePos = random.nextInt(names.length);
        int typePos = random.nextInt(names.length);
        this.name = names[namePos];
        this.homeType = types[typePos];
    }

    public String getName() {
        return name;
    }

    public String getHomeType() {
        return homeType;
    }
}
