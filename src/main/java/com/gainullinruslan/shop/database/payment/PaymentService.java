package com.gainullinruslan.shop.database.payment;

import com.gainullinruslan.shop.database.PaymentStatus;
import com.gainullinruslan.shop.exception.PaymentNotFoundException;

public interface PaymentService {
    void changePaymentStatus(Long id, PaymentStatus paymentStatus) throws PaymentNotFoundException;
}
