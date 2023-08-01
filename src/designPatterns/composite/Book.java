package designPatterns.composite;

public class Book extends Item{
    private static final double BOOK_TAX = 20.0;
    protected Book(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + BOOK_TAX;
    }
}
