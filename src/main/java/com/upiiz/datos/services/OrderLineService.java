package com.upiiz.datos.services;

import com.upiiz.datos.models.OrderLineModel;
import com.upiiz.datos.repositories.OrderLineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLineService implements OrderLineRepository {

    @Override
    public List<OrderLineModel> findAll() {
        return List.of();
    }

    @Override
    public OrderLineModel findById(int id) {
        return null;
    }

    @Override
    public void save(OrderLineModel orderLine) {

    }

    @Override
    public void update(OrderLineModel orderLine) {

    }

    @Override
    public void delete(int id) {

    }
}
