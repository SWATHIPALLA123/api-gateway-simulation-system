package com.apigateway.dto;

public class OrderResponse {

    private Long orderId;
    private String productName;
    private Double amount;

    public OrderResponse() {
    }

    public OrderResponse(Long orderId,
                         String productName,
                         Double amount) {

        this.orderId = orderId;
        this.productName = productName;
        this.amount = amount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}