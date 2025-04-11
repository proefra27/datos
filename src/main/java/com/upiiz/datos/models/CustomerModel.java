package com.upiiz.datos.models;

import java.util.Date;

public class CustomerModel {
    private int id;
    private String name;
    private Date customerSince;

    public CustomerModel(int id, String name, Date customerSince) {
        this.id = id;
        this.name = name;
        this.customerSince = customerSince;
    }

    public CustomerModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCustomerSince() {
        return customerSince;
    }

    public void setCustomerSince(Date customerSince) {
        this.customerSince = customerSince;
    }
}
