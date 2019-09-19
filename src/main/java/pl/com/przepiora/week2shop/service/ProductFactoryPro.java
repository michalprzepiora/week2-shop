package pl.com.przepiora.week2shop.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.com.przepiora.week2shop.model.Product;
import pl.com.przepiora.week2shop.model.ProductPro;

@Service
@Profile("pro")
public class ProductFactoryPro implements ProductFactory {

  @Value("${product.vat}")
  double vat;
  @Value("${product.discount}")
  double discount;

  @Override
  public Product getNewProductRndPrice(String name) {
    return new ProductPro(name,getRandomNumberInRange(50,300),vat,discount);
  }
}
