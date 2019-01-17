package com.bob.sell.repository;

import com.bob.sell.dataobject.ProductCategory;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
  @Autowired
  ProductCategoryRepository repository;

  @Test
  public void findOneTest() {
    ProductCategory p = repository.findOne(1);
    System.out.println(p);
  }

  @Test
  public void saveTest() {
    ProductCategory p = new ProductCategory("女生最爱", 3);
    repository.save(p);
  }

  @Test
  public void updateTest() {
    ProductCategory p = repository.findOne(2);
    p.setCategoryName("男生最爱");
    repository.save(p);
  }

  @Test
  public void findByCategoryTypeInTest() {
    List<Integer> list = Arrays.asList(2,3,4);

    List<ProductCategory> result = repository.findByCategoryTypeIn(list);
    Assert.assertNotEquals(0, result.size());
  }

}