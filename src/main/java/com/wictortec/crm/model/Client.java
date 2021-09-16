package com.wictortec.crm.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Client")
public class Client {
	
	@Id
	private UUID id = UUID.randomUUID();
	private String name;
	private String email;
	private String tel;
	
	
}
