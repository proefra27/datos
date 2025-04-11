package com.upiiz.datos.repositories;

import com.upiiz.datos.models.OrderLineModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderLineRepository {
    List<OrderLineModel> findAll();
    OrderLineModel findById(int id);
    void save(OrderLineModel orderLine);
    void update(OrderLineModel orderLine);
    void delete(int id);
}
