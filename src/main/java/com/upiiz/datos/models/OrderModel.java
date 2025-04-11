package com.upiiz.datos.models;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderModel {
    private int id;
    private Date date;
    private CustomerModel customer;
    private List<OrderLineModel> orderLines;

    public OrderModel() {

    }

    public OrderModel(int id, Date date, CustomerModel customer, OrderLineModel orderLine) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.orderLines = new ArrayList<OrderLineModel>();
        this.orderLines.add(orderLine);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CustomerModel getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerModel customer) {
        this.customer = customer;
    }

    public List<OrderLineModel> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLineModel> orderLines) {
        this.orderLines = orderLines;
    }

    public void addOrderLine(OrderLineModel orderLine) {
        this.orderLines.add(orderLine);
    }
}
