package pl.com.przepiora.week2shop.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.com.przepiora.week2shop.model.Product;
import pl.com.przepiora.week2shop.model.ProductPlus;

@Service
@Profile("plus")
public class ProductFactoryPlus implements ProductFactory {

  @Value("${product.vat}")
  double vat;

  @Override
  public Product getNewProductRndPrice(String name) {
    return new ProductPlus(name, getRandomNumberInRange(30, 500), vat);
  }
}
