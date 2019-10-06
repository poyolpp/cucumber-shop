package ku.shop;

public class NotEnoughProductsException extends Exception {
    public NotEnoughProductsException() {}
    public NotEnoughProductsException(String reason) {
        super(reason);
    }
}