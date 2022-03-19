package com.ashdi.shopingcart;

import java.util.ArrayList;
import java.util.List;




public class ShopingCart {
    private final List<List<Integer>> items;

    public ShopingCart() {
        this.items = new ArrayList<>();
    }

    public List<Integer> addItemToCart(List<Integer> itemsId){
        items.add(itemsId);
        return itemsId;
    }
    public List<List<Integer>> getItem(){
        return items;
    }
}
