package com.ashdi.shopingcart;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShopingCartServiceImpl implements ShopingCartService{

    private final ShopingCart cart;

    public ShopingCartServiceImpl(ShopingCart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItemToCart(List<Integer> itemIdList) {
        return cart.addItemToCart(itemIdList);
    }

    @Override
    public List<List<Integer>> getItem() {
        return cart.getItem();
    }
}
