package com.gainullinruslan.shop.database.orders;

import com.gainullinruslan.shop.dto.order.Order;
import com.gainullinruslan.shop.dto.order.Orders;
import com.gainullinruslan.shop.dto.order.Purchase;
import com.gainullinruslan.shop.exception.OrderNotFoundException;
import com.gainullinruslan.shop.database.OrderStatus;

public interface OrderService {
   void addOrder(Order order);
   void changeOrderStatus (Long id, OrderStatus orderStatus) throws OrderNotFoundException;
   void addPurchaseInList (Long id, Purchase purhase) throws OrderNotFoundException;
   void deletePurchaseInList (Long id, Purchase purhase) throws OrderNotFoundException;
   void deleteOrder (Long id) throws OrderNotFoundException;
   Orders getOrders();
   Orders getOrder (String number) throws OrderNotFoundException;
}

