package com.xuanthanh.DoAnTotNghiep.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "product")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @Column(name = "product_id")
    String productId;

    @Column(name = "product_name",length = 100, nullable = false)
    String productName;

    @Column(name = "brand",length = 50, nullable = false)
    String brand;

    @Column(name = "image",length = 150)
    String image;

    @Column(name = "describe",length = 150)
    String describe;

    @Column(name = "price")
    double price;

    @Column(name = "quantity")
    long quantity;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    Category category;
}
