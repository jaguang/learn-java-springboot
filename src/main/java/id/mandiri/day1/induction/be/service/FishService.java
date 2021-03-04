package id.mandiri.day1.induction.be.service;

public class FishService implements Animal {
    private String name;
    private Integer price;
    private Integer quantity;

    public FishService(String name, Integer price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getTotalPrice() {
        return price * quantity * 2;
    }
}
