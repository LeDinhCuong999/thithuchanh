package com.example.thithuchanh.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "sales")
public class Sale {
    private String SlNo;
    private String SalesmanID;
    private String ProdID;
    private String SalesmanName;
    private String DOS;
}
