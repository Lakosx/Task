package Magaz;

import java.awt.*;
import java.util.Random;

public abstract class Animal {
    private int height;
    private int age;
    private int price;



    public Animal(int price) {
        this.height = (int) (Math.random() * 100);
        this.age = (int) (Math.random() * 20);
        this.price = price;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }




}




