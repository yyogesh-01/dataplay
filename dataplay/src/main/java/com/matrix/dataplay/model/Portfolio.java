package com.matrix.dataplay.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "portfolio")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity userEntity;

    @Column(name = "stock_symbol", length = 10, nullable = false)
    private String stockSymbol;

    @Column(nullable = false)
    private int quantity;

    @Column(name = "average_price", precision = 10, scale = 2, nullable = false)
    private BigDecimal averagePrice;

    @Column(name = "purchase_date", nullable = false)
    private LocalDateTime purchaseDate = LocalDateTime.now();
}
