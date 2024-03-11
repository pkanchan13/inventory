package com.example.inventory.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Inventory {

    @JsonProperty("item")
    private String item;

    @JsonProperty("category")
    private String category;

    @JsonProperty("isAvailable")
    private boolean isAvailable;
}
