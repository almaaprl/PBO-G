public class Main {
    public static void main(String[] args) {
        MenuItem burger = new MenuItem("Burger", 10000);
        MenuItem kopi = new MenuItem("Kopi", 3000);
        MenuItem kebab = new MenuItem("Kebab", 12000);

        FoodOrder order = new FoodOrder();

        order.addItem(burger);
        order.addItem(kopi);
        order.addItem(kebab);

        order.showOrder();
        order.payOrder();
        System.out.println("Status pembayaran: " + (order.isOrderPaid() ? "Sudah dibayar" : "Belum dibayar"));
    }
}
