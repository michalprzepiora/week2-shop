package pl.com.przepiora.week2shop.model;

public class ProductStart extends Product {

  public ProductStart(String name, double price) {
    super(name, price);
  }

  @Override
  public String toString() {
    return "Product name: " + getName() + " | Price: " + getPrice();
  }
}
