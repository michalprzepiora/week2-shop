package pl.com.przepiora.week2shop.model;

import java.math.BigDecimal;

public class ProductPro extends ProductPlus {

  private BigDecimal discount;

  public ProductPro(String name, double price, double vat, double discount) {
    super(name, price, vat);
    this.discount = BigDecimal.valueOf(discount);
    totalPrice = totalPrice.multiply(BigDecimal.ONE.subtract(this.discount));
  }

  @Override
  public String toString() {
    return "Product name: " + getName() + " | Price: " + getPrice() + " | Vat:" + getVat()
        + " | Discount: " + discount.toString() + " | FINAL PRICE " + getTotalPrice();
  }
}
