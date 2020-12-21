package com.nc.autumn2020.lessons.lesson28.repository;

import com.nc.autumn2020.lessons.lesson28.entity.Shop;
import com.nc.autumn2020.lessons.lesson28.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

@Component
public class ShopRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ShopRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Shop getShopById(Integer id){
        return jdbcTemplate.queryForObject("SELECT * from shop where id = ?", new ShopMapper(), id);
    }

    public String getShopNameById(Integer id){
        return jdbcTemplate.queryForObject("SELECT name from shop where id = ?", String.class, id);
    }

    public List<Map<String,Object>> getShopsPlain(){
        return jdbcTemplate.queryForList("SELECT * from shop");
    }

    public List<Shop> getShops(){
        return jdbcTemplate.query("SELECT * from shop", new ShopMapper());
    }

    public void updateShop(Shop shop){
        String query = "UPDATE shop SET name = ?, amount = ? where id = ?";
        jdbcTemplate.update(query, shop.getName(), shop.getAmount(), shop.getId());
    }

    public Shop insertShop(Shop shop){
        String query = "INSERT INTO shop (name, amount) VALUES (?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, shop.getName());
            preparedStatement.setInt(2, shop.getAmount());
            return preparedStatement;
        }, keyHolder);
        return getShopById(keyHolder.getKey().intValue());
    }

    public void deleteShopById(Integer id){
        String query = "delete from shop where id = ?";

        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, id);
            return preparedStatement;
        });
    }
}
