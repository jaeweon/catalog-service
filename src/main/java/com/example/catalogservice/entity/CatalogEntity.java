package com.example.catalogservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "catalog")
public class CatalogEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120, unique = true)
    private String productId;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private Integer stock;

    @Column(nullable = false)
    private Integer unitPrice;

//    @Column(nullable = false, updatable = false)
//    private Date createdAt;
//
//    @PrePersist
//    protected void onCreate() {
//        this.createdAt = Date.from(LocalDateTime.now().atZone(java.time.ZoneId.systemDefault()).toInstant());
//    }

}
