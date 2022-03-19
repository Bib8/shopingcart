package com.ashdi.shopingcart;

import java.util.List;

public interface ShopingCartService {
    List<Integer> addItemToCart(List<Integer> itemIdList);
    List<List<Integer>> getItem();
}
