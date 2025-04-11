package com.upiiz.datos.repositories;


import com.upiiz.datos.models.ProductModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {
    List<ProductModel> findAll();
    ProductModel findById(int id);
    void save(ProductModel product);
    void update(ProductModel product);
    void delete(int id);
}
