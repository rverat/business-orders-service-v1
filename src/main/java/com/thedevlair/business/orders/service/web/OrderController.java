package com.thedevlair.business.orders.service.web;

import com.thedevlair.apache.avro.model.Order;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/v1/api/orders")
public class OrderController {

    private static final String TOPIC = "order";
    private final KafkaTemplate<String, Order> kafkaTemplate;

    public OrderController(KafkaTemplate<String, Order> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send-order")
    public Mono<String> sendOrder(@RequestBody Order orderMessage) {

        return Mono.fromCallable(() -> {
            kafkaTemplate.send(TOPIC, orderMessage.getId().toString(), orderMessage);
            return String.format("Send message to Kafka ID: %s", orderMessage.getId());
        });
    }
}
