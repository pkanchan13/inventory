package com.example.inventory.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="Inventory")
public class InventoryEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long itemId;

    @Column(name="category")
    private String category;

    @Column(name="item")
    private String item;

    @Column(name="isAvailable")
    private boolean isAvailable;

}
