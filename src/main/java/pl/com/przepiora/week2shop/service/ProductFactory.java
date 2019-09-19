package pl.com.przepiora.week2shop.service;

import pl.com.przepiora.week2shop.model.Product;

import java.util.Random;

public interface ProductFactory {

  Product getNewProductRndPrice(String name);

  default double getRandomNumberInRange(int min, int max) {

    if (min >= max) {
      throw new IllegalArgumentException("max must be greater than min");
    }
    Random r = new Random();
    int result = r.nextInt((max - min) + 1) + min;
    return (double) result;
  }
}
