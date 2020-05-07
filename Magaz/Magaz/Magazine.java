package Magaz;


public class Magazine {
    public static void main(String[] args) {
        Warehouse sklad = new Warehouse();
        System.out.println("Баланс : " + Account.getBalance());
        System.out.println("--------------------");


        while (Account.getBalance() >= 100) {

            if (sklad.warehouseList.isEmpty()) {
                sklad.buyAnimal();
            } else {
                int buyOrSell = (int) (Math.random() * 10);
                if (buyOrSell >= 5) {
                    sklad.buyAnimal();
                } else {
                    sklad.sellAnimal();
                }
            }
            while (Account.getBalance() < 2000 && sklad.warehouseList.size() > 0) {
                sklad.sellAnimal();
            }
        }
        System.out.println(sklad.warehouseList.size());
    }
}



