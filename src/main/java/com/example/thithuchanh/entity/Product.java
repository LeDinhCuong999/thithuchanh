package com.example.thithuchanh.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ProdID;
    private String ProdName;
    private String Description;
    private String DateOfManf;
    private BigDecimal Price;
}
