package pl.com.przepiora.week2shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import pl.com.przepiora.week2shop.model.Product;
import pl.com.przepiora.week2shop.repository.Cart;
import pl.com.przepiora.week2shop.service.ProductFactory;

@SpringBootApplication
public class Week2ShopApplication {

  final
  ProductFactory productFactory;
  final
  Cart cart;

  public Week2ShopApplication(ProductFactory productFactory,
      Cart cart) {
    this.productFactory = productFactory;
    this.cart = cart;
  }

  public static void main(String[] args) {
    SpringApplication.run(Week2ShopApplication.class, args);
  }

  @EventListener(ApplicationReadyEvent.class)
  public void start() {
    cart.addProduct(productFactory.getNewProductRndPrice("Bread"));
    cart.addProduct(productFactory.getNewProductRndPrice("Computer"));
    cart.addProduct(productFactory.getNewProductRndPrice("Car"));
    cart.addProduct(productFactory.getNewProductRndPrice("Doll"));
    cart.addProduct(productFactory.getNewProductRndPrice("Book"));

    cart.getAll().forEach(product -> System.out.println(product.toString()));
    double totalPrice = cart.getAll().stream().mapToDouble(Product::getTotalPrice).sum();
    System.out.println("SUM OF TOTAL PRICE: " + totalPrice);

  }

}
