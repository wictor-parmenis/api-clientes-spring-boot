package com.wictortec.crm.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wictortec.crm.model.Client;

public interface ClientRepository extends MongoRepository<Client, Integer> {

}
