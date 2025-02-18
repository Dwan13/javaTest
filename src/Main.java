public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, JavaBank World!");
        try {
            100/0;
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
    }
}