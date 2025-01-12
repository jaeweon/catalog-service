package com.example.catalogservice.dto;

import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
public class CatalogDto { // implements Serializable {
    private String productId;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;

    private String orderId;
    private String userId;
}