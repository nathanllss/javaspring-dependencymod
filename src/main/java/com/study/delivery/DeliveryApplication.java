package com.study.delivery;

import com.study.delivery.models.Order;
import com.study.delivery.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class DeliveryApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(DeliveryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);

        // input 1
        System.out.println("Exemplo 1");
        Order order1 = new Order(1034,150.00, 20.0);
        double total1 = orderService.total(order1);
        System.out.printf("Pedido código %d \nValor Total: R$ %.2f\n\n", order1.getCode(), total1);

        // input 2
        System.out.println("Exemplo 2");
        Order order2 = new Order(2282,800.0, 10.0);
        double total2 = orderService.total(order2);
        System.out.printf("Pedido código %d \nValor Total: R$ %.2f\n\n", order2.getCode(), total2);

        // input 3
        System.out.println("Exemplo 3");
        Order order3 = new Order(1309,95.90, 0.0);
        double total3 = orderService.total(order3);
        System.out.printf("Pedido código %d \nValor Total: R$ %.2f", order3.getCode(), total3);
    }
}
