package com.inventory.bean;

import java.util.Date;

public class Cheese extends Item {

	private CheeseType cheesetype;
	private double protein;
	private double vitaminB1;
	private double fat;
	public Cheese(int id, String description, float weight, float price, Date mfg_date, int useBeforeInMonths,
			CheeseType cheesetype, double protein, double vitaminB1, double fat) {
		super(id, description, weight, price, mfg_date, useBeforeInMonths);
		this.cheesetype = cheesetype;
		this.protein = protein;
		this.vitaminB1 = vitaminB1;
		this.fat = fat;
	}
	public CheeseType getCheesetype() {
		return cheesetype;
	}
	public void setCheesetype(CheeseType cheesetype) {
		this.cheesetype = cheesetype;
	}
	public double getProtein() {
		return protein;
	}
	public void setProtein(double protein) {
		this.protein = protein;
	}
	public double getVitaminB1() {
		return vitaminB1;
	}
	public void setVitaminB1(double vitaminB1) {
		this.vitaminB1 = vitaminB1;
	}
	public double getFat() {
		return fat;
	}
	public void setFat(double fat) {
		this.fat = fat;
	}
	@Override
	public String toString() {
		return "Cheese [cheesetype=" + cheesetype + ", protein=" + protein + ", vitaminB1=" + vitaminB1 + ", fat=" + fat
				+ "]";
	}
	


		
	}
	

