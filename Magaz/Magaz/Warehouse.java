package Magaz;

import java.util.ArrayList;

public class Warehouse {
    public ArrayList<Animal> warehouseList = new ArrayList<Animal>();


    public void buyAnimal() {
        int random = (int) (Math.random() * 10);
        int price = (int) (Math.random() * 1000);
        if (random >= 5) {
            warehouseList.add(new WildAnimal(price));
            System.out.println("Дикое животное куплено за : " + price);
            Account.withdraw(price);
        } else {
            warehouseList.add(new HomeAnimal(price));
            System.out.println("Домашнее животное куплено за : " + price);
            Account.withdraw(price);
        }
    }


    public void sellAnimal() {
        if (!warehouseList.isEmpty()) {
            int sellPrice = (int) (Math.random() * 1000);
            if (sellPrice <= warehouseList.get(0).getPrice()) {
                while (sellPrice < warehouseList.get(0).getPrice()) {
                    sellPrice = (int) (Math.random() * 1000);
                }
            } else {
                warehouseList.remove(0);
                System.out.println("Домашнее животное продано за : " + sellPrice);
                Account.deposit(sellPrice);
            }
        }
    }
}

