package com.bob.sell.service.impl;

import com.bob.sell.dataobject.ProductCategory;
import com.bob.sell.repository.ProductCategoryRepository;
import com.bob.sell.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{

  @Autowired
  ProductCategoryRepository repository;

  @Override
  public ProductCategory findOne(Integer categoryId) {
    return repository.findOne(1);
  }

  @Override
  public List<ProductCategory> findAll() {
    return repository.findAll();
  }

  @Override
  public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
    return repository.findByCategoryTypeIn(categoryTypeList);
  }

  @Override
  public ProductCategory save(ProductCategory productCategory) {
    return repository.save(productCategory);
  }
}
