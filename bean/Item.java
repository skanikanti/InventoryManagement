package com.inventory.bean;

import java.util.Date;

public class Item {
	private int id;
    private String description;
    private float weight;
    private float price;
    private Date mfg_date;
    private int UseBeforeInMonths;
    Date expiryDate;
    
	public Item(int id, String description, float weight, float price, Date mfg_date, int useBeforeInMonths) {
		super();
		this.id = id;
		this.description = description;
		this.weight = weight;
		this.price = price;
		this.mfg_date = mfg_date;
		UseBeforeInMonths = useBeforeInMonths;
	}
	
	   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getMfg_date() {
		return mfg_date;
	}

	public void setMfg_date(Date mfg_date) {
		this.mfg_date = mfg_date;
	}

	public int getUseBeforeInMonths() {
		return UseBeforeInMonths;
	}

	public void setUseBeforeInMonths(int useBeforeInMonths) {
		UseBeforeInMonths = useBeforeInMonths;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
		public String toString() {
			return "item [id=" + id + ", description=" + description + ", weight=" + weight + ", price=" + price
					+ ", mfg_date=" + mfg_date + ", UseBeforeInMonths=" + UseBeforeInMonths + "]";

	}}
		

	


