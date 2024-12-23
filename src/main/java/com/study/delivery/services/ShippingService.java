package com.study.delivery.services;

import com.study.delivery.models.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private static final double MIN_VALUE = 100.0;
    private static final double MAX_VALUE = 200.0;


    public double shipment(Order order) {
        return order.getBasic() < MIN_VALUE ? 20.00 : order.getBasic() >= MAX_VALUE ? 0.0 : 12.0;
    }
}
