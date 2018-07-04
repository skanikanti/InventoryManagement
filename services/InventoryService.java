package com.inventory.services;

import java.sql.SQLException;
import java.util.List;

import com.inventory.bean.Item;

public interface InventoryService {
	List<Item> initializeInventory() throws SQLException;
	void calculateExpiryDate(List<Item> items);
	void removeExpiredItems(List<Item> items);
}
