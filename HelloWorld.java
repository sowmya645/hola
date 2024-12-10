// Your First Program
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Adding a delay keeps the container running for testing
        try {
            Thread.sleep(10000); // Keep running for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
