package org.example;

public class items {

    private int quantity;
    private String name;
    private String category;

    public items(int quantity, String name, String category) {
        this.quantity = quantity;
        this.name = name;
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "items{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
