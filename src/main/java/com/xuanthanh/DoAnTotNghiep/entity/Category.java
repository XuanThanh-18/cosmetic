package com.xuanthanh.DoAnTotNghiep.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "category")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Category {
    @Id
    @Column(name = "category_id")
    String categoryId;

    @Column(name = "category_name",length = 100,nullable = false)
    String categoryName;

    @Column(name = "parent_category_id",length = 100,nullable = false)
    String parentCategoryId;

    @OneToMany(mappedBy = "category")
    List<Product> products;
}
