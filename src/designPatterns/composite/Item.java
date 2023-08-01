package designPatterns.composite;

public abstract class Item implements Calculatable {
    protected final String name;
    protected final double price;

    protected Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
