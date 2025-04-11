package com.upiiz.datos.models;

public class OrderLineModel {
    private ProductModel productModel;
    private int amount;
    private double purchasePrice;

    public OrderLineModel(ProductModel productModel, int amount, double purchasePrice) {
        this.productModel = productModel;
        this.amount = amount;
        this.purchasePrice = purchasePrice;
    }

    public OrderLineModel() {

    }

    public ProductModel getProductModel() {
        return productModel;
    }

    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
