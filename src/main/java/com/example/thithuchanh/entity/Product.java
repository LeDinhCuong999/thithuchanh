package com.example.thithuchanh.entity;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProdID;
    private String ProdName;
    private String Description;
    private LocalDateTime DateOfManf;
    private BigDecimal Price;
}
