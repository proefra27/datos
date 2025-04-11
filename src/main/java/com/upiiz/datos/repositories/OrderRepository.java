package com.upiiz.datos.repositories;

import com.upiiz.datos.models.OrderModel;
import org.springframework.stereotype.Repository;

import java.util.List;

//Cantidad de registros mayores 37550 - Manejar Long
@Repository
public interface OrderRepository {
    List<OrderModel> findAll();
    OrderModel findById(int id);
    void save(OrderModel order);
    void update(OrderModel order);
    void delete(int id);
}
