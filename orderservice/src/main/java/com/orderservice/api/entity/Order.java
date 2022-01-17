package com.orderservice.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ORDER_TBL")
public class Order {

	@Id
	@GeneratedValue
	@NotNull
	private Integer orderId;
	
	@NotNull
	private String productName;
	
	@NotNull
	private String quantity;
	
	@NotNull
	private Float amount;
	
}
