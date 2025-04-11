package com.upiiz.datos.services;

import com.upiiz.datos.models.OrderModel;
import com.upiiz.datos.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderRepository {

    @Override
    public List<OrderModel> findAll() {
        return List.of();
    }

    @Override
    public OrderModel findById(int id) {
        return null;
    }

    @Override
    public void save(OrderModel order) {

    }

    @Override
    public void update(OrderModel order) {

    }

    @Override
    public void delete(int id) {

    }
}
