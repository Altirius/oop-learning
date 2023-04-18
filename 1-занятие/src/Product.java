package src;

import src.Helpers.Input;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    protected String inputName() {
        System.out.print("Введите название: ");
        return Input.INSTANCE.stream.nextLine();
    }

    protected Double inputPrice() {
        System.out.print("Введите стоимость: ");
        return Input.INSTANCE.stream.nextDouble();
    }

    @Override
    public String toString() {
        return String.format("%s : %.2f р.", name, price);
    }
}
