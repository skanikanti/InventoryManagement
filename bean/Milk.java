package com.inventory.bean;

import java.util.Date;

public class Milk extends Item {
	private int fatrate;
	private MilkType milkType;

	public Milk(int id, String description, float weight, float price, Date mfg_date, int useBeforeInMonths,
			int fatrate, MilkType milkType) {
		super(id, description, weight, price, mfg_date, useBeforeInMonths);
		this.fatrate = fatrate;
		this.milkType = milkType;
	}

	public int getFatrate() {
		return fatrate;
	}

	public void setFatrate(int fatrate) {
		this.fatrate = fatrate;
	}

	public MilkType getMilkType() {
		return milkType;
	}

	public void setMilkType(MilkType milkType) {
		this.milkType = milkType;
	}

	@Override
	public String toString() {
		return "Milk [fatrate=" + fatrate + ", milkType=" + milkType + "]";
	}

}
