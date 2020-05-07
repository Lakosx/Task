package Magaz;

public class Account {
    private static int Balance = 10000;
    private static Account id;
    private static int count = 0;

    private Account() {
    }

    public static void setBalance(int balance) {
        Balance = balance;
    }

    public static Account Singleton() {
        if (id == null) {
            id = new Account();
        }
        return id;
    }

    public static void deposit(int deposit) {
        Balance += deposit;
        System.out.println("Баланс : " + Balance);
        System.out.println("--------------------");
    }

    public static void withdraw(int withdraw) {
        Balance -= withdraw;
        System.out.println("Баланс : " + Balance);
        System.out.println("--------------------");
        count++;
        if (count==10){
            setBalance((int) (getBalance() * 0.5 - 2500));
            count = 0;
            System.out.println("ПЛОТИ НОЛОГ");
        }
    }

    public static int getBalance() {
        return Balance;
    }
}