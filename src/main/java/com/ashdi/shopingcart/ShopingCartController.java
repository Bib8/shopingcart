package com.ashdi.shopingcart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShopingCartController {
    private final ShopingCartService shopingCartService;

    public ShopingCartController(ShopingCartService shopingCartService) {
        this.shopingCartService = shopingCartService;
    }
    @GetMapping("/add")
    public List<Integer> addItemToCart(@RequestParam List<Integer> itemIdList){
        return shopingCartService.addItemToCart(itemIdList);
    }
    @GetMapping("/get")
    public List<List<Integer>> getItem(){
        return shopingCartService.getItem();
    }

}
