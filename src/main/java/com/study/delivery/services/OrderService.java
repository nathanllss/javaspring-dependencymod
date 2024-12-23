package com.study.delivery.services;

import com.study.delivery.models.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        double totalPercentage = 1 - (order.getDiscount() / 100.0);
        return (order.getBasic() * totalPercentage) + shippingService.shipment(order);
    }

}
