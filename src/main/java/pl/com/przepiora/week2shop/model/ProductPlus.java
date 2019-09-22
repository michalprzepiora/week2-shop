package pl.com.przepiora.week2shop.model;

import java.math.BigDecimal;

public class ProductPlus extends ProductStart {

  private BigDecimal vat;

  public ProductPlus(String name, double price, double vat) {
    super(name, price);
    this.vat = BigDecimal.valueOf(vat);
    totalPrice = getPrice().multiply(this.vat).add(getPrice());
  }

  BigDecimal getVat() {
    return vat;
  }

  @Override
  public String toString() {
    return "Product name: " + getName() + " | Price: " + getPrice() + " | Vat:" + getVat()
        + " | FINAL PRICE "
        + getTotalPrice();
  }
}

