package com.inventory.bean;

import java.util.Date;

public class Wheat extends Item {
	private WheatType wheattype;

	public Wheat(int id, String description, float weight, float price, Date mfg_date, int useBeforeInMonths,
			WheatType wheattype) {
		super(id, description, weight, price, mfg_date, useBeforeInMonths);
		this.wheattype = wheattype;
	}

	public WheatType getWheattype() {
		return wheattype;
	}

	public void setWheattype(WheatType wheattype) {
		this.wheattype = wheattype;
	}

	@Override
	public String toString() {
		return "wheat [wheattype=" + wheattype + "]";
	}

}
