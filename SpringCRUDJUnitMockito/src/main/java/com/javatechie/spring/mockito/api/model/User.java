package com.javatechie.spring.mockito.api.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "UsersJunit")
@Entity
public class User {
	
	@Id
	 @GeneratedValue
	private int id;
	private String name;
	private int age;
	private String address;

}
