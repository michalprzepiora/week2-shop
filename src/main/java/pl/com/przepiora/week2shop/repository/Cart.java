package pl.com.przepiora.week2shop.repository;

import org.springframework.stereotype.Repository;
import pl.com.przepiora.week2shop.model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Cart {

  private List<Product> products;

  public Cart() {
    products = new ArrayList<>();
  }

  public List<Product> getAll() {
    return products;
  }

  public void addProduct(Product product) {
    products.add(product);
  }
}
