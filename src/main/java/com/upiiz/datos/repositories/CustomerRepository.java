package com.upiiz.datos.repositories;

import com.upiiz.datos.models.CommentModel;
import com.upiiz.datos.models.CustomerModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository {
    List<CustomerModel> findAll();
    CustomerModel findById(int id);
    void save(CustomerModel customer);
    void update(CustomerModel customer);
    void delete(int id);
}
