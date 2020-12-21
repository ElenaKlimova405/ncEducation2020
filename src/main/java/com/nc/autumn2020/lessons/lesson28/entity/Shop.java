package com.nc.autumn2020.lessons.lesson28.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Shop {
    private Integer id;
    private String name;
    private Integer amount;
}
