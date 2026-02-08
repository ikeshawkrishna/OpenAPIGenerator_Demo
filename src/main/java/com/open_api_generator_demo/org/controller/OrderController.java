package com.open_api_generator_demo.org.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.open_api_generator_demo.org.generated.controller.OrdersApi;
import com.open_api_generator_demo.org.generated.model.Order;

@RestController
@RequestMapping("/api")
public class OrderController implements OrdersApi{

	@Override
	public ResponseEntity<Order> createOrder(@Valid Order order) {
		// TODO Auto-generated method stub
		return OrdersApi.super.createOrder(order);
	}

	@Override
	public ResponseEntity<List<Order>> getAllOrders() {
		// TODO Auto-generated method stub
		return OrdersApi.super.getAllOrders();
	}

	@Override
	public ResponseEntity<Order> getOrderById(@NotNull Long id) {
		// TODO Auto-generated method stub
		return OrdersApi.super.getOrderById(id);
	}
	
}
