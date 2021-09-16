package com.wictortec.crm.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wictortec.crm.model.Client;
import com.wictortec.crm.repositories.ClientRepository;

@RestController
public class ClientController {
	
	@Autowired
	private ClientRepository repository;
	
	@CrossOrigin
	@PostMapping("/addclient")
	public Client saveClient(@RequestBody Client client) {
		repository.save(client);
		return client;
	}
	
	@CrossOrigin(origins = "http://localhost:8090")
	@GetMapping("/getclients")
	public List<Client> getClients() {
		return repository.findAll();
	}
	
	

}
