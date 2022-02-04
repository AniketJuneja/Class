public class BankC extends Bank{

    @Override
    void getBalance() {
        System.out.println("$ 200");

    }

    public static void main(String[] args) {
        BankC c=new BankC();
        c.getBalance();
    }
}