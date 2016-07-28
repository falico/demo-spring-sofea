package com.example.domain.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import lombok.Data;

import javax.persistence.Id;

@Entity
@Data
public class Customer {
	@Id
	@GeneratedValue
	private Long id;

    private String firstName;
    private String lastName;
}
