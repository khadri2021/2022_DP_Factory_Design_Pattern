package com.khadri.dp.client;

import com.khadri.dp.factory.FoodFactory;
import com.khadri.dp.parent.Food;

public class Client {

	public static void main(String[] args) {
		Food food = FoodFactory.getFood("VEG");
		System.out.println(food.prepareFood());
	}
}
