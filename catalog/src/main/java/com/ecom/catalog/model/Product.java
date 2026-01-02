package com.ecom.catalog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
//@Data
@Getter
@Setter
@ToString(exclude = "category")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private Double price;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="category_id" , nullable=false)
    private Category category;
}
