public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, JavaBank ATM!");
        try {
            int value = 100 / 0;
            System.out.println("Value is: " + value);
        } catch (java.lang.Exception e) {
            System.out.println("Exception caught!");
            throw new RuntimeException(e);
        }
    }
}