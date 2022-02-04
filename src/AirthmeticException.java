public class AirthmeticException extends Throwable {
    public static void main(String[] args) {
        int a=2;
        try {
            int total = a / 0;
        }
        catch (Throwable e)
        {
            System.out.println(e.getMessage());
        }
    }
}
