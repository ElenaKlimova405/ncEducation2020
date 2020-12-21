package com.nc.autumn2020.lessons.lesson28;

import com.nc.autumn2020.LessonApi;
import com.nc.autumn2020.lessons.lesson28.entity.Shop;
import com.nc.autumn2020.lessons.lesson28.repository.ShopRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nc.autumn2020.lessons.lesson28")
public class Solution28 implements LessonApi {
    @Override
    public void executeSolution(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Solution28.class);
        ShopRepository shopRepository = applicationContext.getBean(ShopRepository.class);

        shopRepository.getShops().forEach(System.out::println);
        System.out.println("-----------");

        Shop shop = shopRepository.getShopById(35);
        shop.setName("New Name In This Table");
        shopRepository.updateShop(shop);

        shopRepository.getShops().forEach(System.out::println);
        System.out.println("-----------");

        Shop shop2 = shopRepository
                .insertShop(Shop.builder()
                        .name("New Name 2")
                        .amount(12345)
                        .build());

        shopRepository.getShops().forEach(System.out::println);
        System.out.println("-----------");

        shopRepository.deleteShopById(35);

        shopRepository.getShops().forEach(System.out::println);
        System.out.println("-----------");

    }
}
