package pl.com.przepiora.week2shop.model;

public class ProductPlus extends ProductStart {

  private double vat;

  public ProductPlus(String name, double price, double vat) {
    super(name, price);
    this.vat = vat;
    setTotalPrice(price * vat + price);
  }

  public double getVat() {
    return vat;
  }

  @Override
  public String toString() {
    return "Product name: " + getName() + " | Price: " + getPrice() + " | Vat:" + getVat()
        + " | FINAL PRICE "
        + getTotalPrice();
  }
}

