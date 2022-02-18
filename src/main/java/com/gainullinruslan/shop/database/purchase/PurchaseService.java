package com.gainullinruslan.shop.database.purchase;

import com.gainullinruslan.shop.database.cakes.CakeEntity;
import com.gainullinruslan.shop.database.orders.OrderEntity;

public interface PurchaseService {
    void addPurchase(OrderEntity orderEntity, CakeEntity cakeEntity, Integer count);
}
