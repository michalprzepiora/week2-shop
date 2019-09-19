package pl.com.przepiora.week2shop.model;

abstract public class Product {

  private String name;
  private double price;
  private double totalPrice;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
    totalPrice = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }
}
