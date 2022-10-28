public class Main {
    public static void main(String[] args) {
        int[] sales = {40, 3, 589, 44 };
        SalesManager manager = new SalesManager(sales);
        System.out.println("Макс: " + manager.max());
    }
}
