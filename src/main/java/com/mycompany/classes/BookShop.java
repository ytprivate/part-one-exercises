package com.mycompany.classes;

public class BookShop extends PublishingHouse {
    int id;
    String price;

    public BookShop(int id, String price) {
        super();
        this.id = id;
        this.price = price;
    }

    public BookShop() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "id=" + id +
                ", price='" + price + '\'' +
                '}';
    }
}
