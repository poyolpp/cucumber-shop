package ku.shop;

public class OrderItem {
    private int quantity;
    private Product prod;

    public OrderItem(Product prod, int quantity) {
        if (quantity <= 0)
            throw new IllegalArgumentException("OrderItem quantity must be positive");

        this.prod = prod;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return prod.getPrice() * quantity;
    }

    public void checkStock() throws NotEnoughProductsException{
        if (this.quantity <= prod.getStock()) {
            prod.setStock(prod.getStock() - this.quantity);
            System.out.println(prod.getStock());
        }
        else {
            throw new NotEnoughProductsException("Product Out Off Stock.");
        }
    }
}
