import java.util.ArrayList;

public class FoodOrder {
    private ArrayList<MenuItem> menuItems; 
    private double totalPrice; 
    private boolean isPaid; 

    public FoodOrder() {
        menuItems = new ArrayList<>();
        totalPrice = 0.0;
        isPaid = false;
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
        totalPrice += item.getPrice();
        System.out.println(item.getName() + " berhasil ditambahkan! Harga: Rp" + item.getPrice());
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void payOrder() {
        if (!isPaid) {
            isPaid = true;
            System.out.println("Pesanan telah dibayar! Total: Rp" + totalPrice);
        } else {
            System.out.println("Pesanan sudah dibayar!");
        }
    }

    public boolean isOrderPaid() {
        return isPaid;
    }

    public void showOrder() {
        System.out.println("Pesanan Anda:");
        for (MenuItem item : menuItems) {
            System.out.println("- " + item.getName() + ": Rp" + item.getPrice());
        }
        System.out.println("Total harga: Rp" + totalPrice);
    }
}
