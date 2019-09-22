package pl.com.przepiora.week2shop.model;

import java.math.BigDecimal;

abstract public class Product {

  private String name;
  private BigDecimal price;
  protected BigDecimal totalPrice;

  public Product(String name, double price) {
    this.name = name;
    this.price = BigDecimal.valueOf(price);
    totalPrice = BigDecimal.valueOf(price);
  }

  public String getName() {
    return name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public BigDecimal getTotalPrice() {
    return totalPrice;
  }
}
