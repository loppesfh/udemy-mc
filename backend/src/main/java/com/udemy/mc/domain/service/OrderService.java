package com.udemy.mc.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.mc.domain.entity.Order;
import com.udemy.mc.domain.repository.OrderRepository;
import com.udemy.mc.domain.service.exception.ObjectNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	
	
	public Order findById(Long id) {		
		Optional<Order> opt = repository.findById(id);		
		//return  opt.orElse(null);
		return opt.orElseThrow(() -> new ObjectNotFoundException("Ojeto não encontrado! id: " + id + ", Tipo: " 
				+ Order.class.getName()));		
	}

}
