package com.bob.sell.repository;

import com.bob.sell.dataobject.ProductCategory;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{
  List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
