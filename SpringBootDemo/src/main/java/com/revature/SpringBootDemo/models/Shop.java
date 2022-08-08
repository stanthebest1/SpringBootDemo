package com.revature.SpringBootDemo.models;


import lombok.Data;

import javax.persistence.*;
ls
@Entity
@Table(name = "shops")
@Data
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")

            private int id;

    @Column(name = "s_name", unique = true, nullable = false)
    private String shopName;

    @Column(name = "s_invent_count", nullable = false)
    private int inventoryCount;

    public Shop(){

    }

    public Shop(int id, String shopName, int inventoryCount) {
        this.id = id;
        this.shopName = shopName;
        this.inventoryCount = inventoryCount;
    }

    public Shop(String shopName, int inventoryCount) {
        this.shopName = shopName;
        this.inventoryCount = inventoryCount;
    }
}
