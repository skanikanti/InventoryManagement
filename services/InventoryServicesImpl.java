package com.inventory.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;

import com.inventory.bean.Item;
import com.inventory.dao.InventoryServicesDao;
import com.inventory.dao.InventoryServicesDaoImpl;

public class InventoryServicesImpl implements InventoryService {
	InventoryServicesDao dao = new InventoryServicesDaoImpl();

	public List<Item> initializeInventory() throws SQLException {

		List<Item> list = dao.readAllItemsFromDb();

		return list;
	}

	public void calculateExpiryDate(List<Item> list) {
		for(Item item:list)
		{
			Date expiry=DateUtils.addMonths(item.getMfg_date(), item.getUseBeforeInMonths());
			item.setExpiryDate(expiry);
		}
		
	}

	public void removeExpiredItems(List<Item> list) {
	List<Item> temp=new ArrayList<Item>();
	Date currentDate=new Date();
	for(Item item:list)
	{
		if((currentDate.compareTo(item.getExpiryDate())) >0)
				{
			
				temp.add(item);
	}
		}
	
		list.removeAll(temp);
	}

}
