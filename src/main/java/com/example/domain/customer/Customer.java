package com.example.domain.customer;

import javax.persistence.Entity;

import lombok.Data;

import javax.persistence.Id;

@Entity
@Data
public class Customer {
	@Id
	private String id;

    private String firstName;
    private String lastName;
}
