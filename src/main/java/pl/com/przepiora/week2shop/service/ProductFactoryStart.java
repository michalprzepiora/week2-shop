package pl.com.przepiora.week2shop.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.com.przepiora.week2shop.model.Product;
import pl.com.przepiora.week2shop.model.ProductStart;

@Service
@Profile("start")
public class ProductFactoryStart implements ProductFactory {

  @Override
  public Product getNewProductRndPrice(String name) {
    return new ProductStart(name,getRandomNumberInRange(50,300));
  }
}
