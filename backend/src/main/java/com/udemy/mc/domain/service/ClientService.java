package com.udemy.mc.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.mc.domain.entity.Client;
import com.udemy.mc.domain.repository.ClientRepository;
import com.udemy.mc.domain.service.exception.ObjectNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;	
	
	public Client findById(Long id) {		
		Optional<Client> opt = repository.findById(id);		
		//return  opt.orElse(null);
		return opt.orElseThrow(() -> new ObjectNotFoundException("Ojeto não encontrado! id: " + id + ", Tipo: " 
				+ Client.class.getName()));		
	}
}
