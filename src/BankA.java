public class BankA extends Bank{

    @Override
    void getBalance() {
        System.out.println("$ 150");

    }

    public static void main(String[] args) {
        BankA a=new BankA();
        a.getBalance();
    }
}
