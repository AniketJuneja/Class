public class BankB extends Bank{

    @Override
    void getBalance() {
        System.out.println("$ 100");

    }

    public static void main(String[] args) {
        BankB b=new BankB();
        b.getBalance();
    }
}