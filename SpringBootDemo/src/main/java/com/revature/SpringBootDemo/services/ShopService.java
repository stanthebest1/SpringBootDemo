package com.revature.SpringBootDemo.services;

import com.revature.SpringBootDemo.models.Candy;
import com.revature.SpringBootDemo.models.Shop;

import java.util.List;

public interface ShopService {

    //creates a new candy
    boolean createShop(Shop shop);

    //get shop by id
    Shop getShopById(int id);

    //get all shops
    List<Shop> getAllShops();

    //update a shop
    boolean updateShop(Shop shop);

    //delete a shop

    boolean deleteShop(Shop shop);

}
