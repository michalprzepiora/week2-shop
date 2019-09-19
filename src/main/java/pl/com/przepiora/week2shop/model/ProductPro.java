package pl.com.przepiora.week2shop.model;

public class ProductPro extends ProductPlus {

  private double discount;

  public ProductPro(String name, double price, double vat, double discount) {
    super(name, price, vat);
    this.discount = discount;
    setTotalPrice(getTotalPrice() * (1 - discount));
  }

  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  @Override
  public String toString() {
    return "Product name: " + getName() + " | Price: " + getPrice() + " | Vat:" + getVat()
        + " | Discount: " + getDiscount() + " | FINAL PRICE " + getTotalPrice();
  }
}
