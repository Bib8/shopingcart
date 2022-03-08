package com.ashdi.shopingcart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class ShopingCartConfig {
    @Bean
    @SessionScope
    public ShopingCart addShopingCart(){
        return new ShopingCart();
    }
}
