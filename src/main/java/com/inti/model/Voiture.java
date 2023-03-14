package com.inti.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
@Data
@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
@Entity
@Table
public class Voiture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private @NonNull String numPlaque;
	private String marque;
	private String model;
	private double vitesse;
	
	public Voiture(@NonNull String numPlaque, String marque, String model, double vitesse) {
		super();
		this.numPlaque = numPlaque;
		this.marque = marque;
		this.model = model;
		this.vitesse = vitesse;
	}
	
	
	

}
