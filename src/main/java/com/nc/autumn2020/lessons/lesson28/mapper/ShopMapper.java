package com.nc.autumn2020.lessons.lesson28.mapper;

import com.nc.autumn2020.lessons.lesson28.entity.Shop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShopMapper implements RowMapper<Shop> {
    @Override
    public Shop mapRow(ResultSet resultSet, int i) throws SQLException {
        return Shop.builder()
                .id(resultSet.getInt(1))
                .name(resultSet.getString(2))
                .amount(resultSet.getInt(3))
                .build();
    }
}
