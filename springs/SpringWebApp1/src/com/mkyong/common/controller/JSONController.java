package com.mkyong.common.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mkyong.common.model.Shop;
import com.mkyong.common.service.BuyService;

@Controller
@RequestMapping("/get")
public class JSONController {
	@Autowired
	private BuyService buyService;

	@RequestMapping(value = "{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Shop getShopInJSON(@PathVariable String name) {

		Shop shop = new Shop();
		shop.setShopName(name);
		shop.setStaffName(new String[] { "mkyong1", "mkyong2" });
		Map<String, Integer> itemsPrice = new HashMap<String, Integer>();
		itemsPrice.put("Bread", 20);
		itemsPrice.put("coke", 15);

		shop.setItemsPrice(itemsPrice);
		System.out.println(buyService.getService());
		return shop;

	}

}