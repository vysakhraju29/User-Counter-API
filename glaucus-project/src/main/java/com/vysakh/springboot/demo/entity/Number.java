package com.vysakh.springboot.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Vysakh
 * Represents the number table where incremented value is being stored
 *
 */
@Entity
@Table(name="number")
public class Number {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	/*
	 * Variable representing 'number' field of table 'number'
	 */
	@Column(name="number")
	private int number;
	
	public Number() {
		
	}

	public Number(int number) {
		
		this.number = number;
	}

	/*
	 * Getter for getting ID from table number
	 */
	public int getId() {
		return id;
	}
	
	/*
	 * Setting value for id in table number
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/*
	 * Getter for fetching number from table 'number'
	 */
	public int getNumber() {
		return number;
	}
	
	/*
	 * Setter for setting number in table 'number'
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
}
