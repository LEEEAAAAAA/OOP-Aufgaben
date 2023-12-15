package com.example.warenkorb;

public class OrderItem {
    public int getAmountOfObjects=0;
    private Product product;
    private int quantity;



    public double getAmount() {
        double quantity = Double.parseDouble(this.getQuantity());
        return quantity * this.getProduct().getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getQuantity(int anzahl) {
        quantity = quantity + anzahl;
        return String.valueOf(quantity);
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }
    public int getAmountOfObjects(){

        return getAmountOfObjects;
    }
}
