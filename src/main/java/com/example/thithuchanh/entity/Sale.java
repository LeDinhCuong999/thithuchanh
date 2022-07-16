package com.example.thithuchanh.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String SlNo;
    private String SalesmanID;
    private String SalesmanName;
    @ManyToOne
    @JoinColumn(name = "ProdID")
    private Product ProdID;
    private String DOS;
}
