package com.upiiz.datos.services;


import com.upiiz.datos.models.ProductModel;
import com.upiiz.datos.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

//Implement - Interfaces
//Extend    - Herencia

@Service
public class ProductService implements ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ProductModel> findAll() {
        return jdbcTemplate.query("SELECT * FROM product",
                new BeanPropertyRowMapper<>(ProductModel.class));
    }

    @Override
    public ProductModel findById(int id) {
        return jdbcTemplate.query("SELECT * FROM product WHERE id=?",
                new BeanPropertyRowMapper<>(ProductModel.class),id)
                .stream().findFirst().orElse(new ProductModel());
    }

    @Override
    public void save(ProductModel product) {
        jdbcTemplate.update(
                "INSERT INTO product(name,price,in_stock) VALUES (?,?,?)",
                product.getName(),product.getPrice(),product.isInStock());
    }

    @Override
    public void update(ProductModel product) {
        jdbcTemplate.update(
                "UPDATE product SET name=?, price=?, in_stock=? WHERE id=?",
                product.getName(),product.getPrice(),product.isInStock(),product.getId());
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM product WHERE id=?",id);
    }
}
