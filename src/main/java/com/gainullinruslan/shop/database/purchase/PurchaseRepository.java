package com.gainullinruslan.shop.database.purchase;

import com.gainullinruslan.shop.dto.cake.Cake;
import com.gainullinruslan.shop.dto.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<PurchaseEntity, Long> {
    boolean existsByOrder(Order order);
    boolean existsByCake(Cake cake);
}
