package com.gainullinruslan.shop.database.cakes;

import com.gainullinruslan.shop.dto.cake.Cake;
import com.gainullinruslan.shop.dto.cake.Cakes;
import com.gainullinruslan.shop.exception.CakeNotFoundException;

//прослойка с бизнес-логикой
public interface CakesService {
    Cakes getCakes();
    Cake getCake(Long id) throws CakeNotFoundException;
    void addCake(Cake cake);
    void deleteCake (Long id) throws CakeNotFoundException;
}
