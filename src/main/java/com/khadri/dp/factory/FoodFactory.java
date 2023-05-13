package com.khadri.dp.factory;

import com.khadri.dp.child.NonVegBiryani;
import com.khadri.dp.child.RiceFood;
import com.khadri.dp.child.VegBiryani;
import com.khadri.dp.parent.Food;

public class FoodFactory {

	public static Food getFood(String foodType) {

		if(foodType.equals("VEG")) {
			return new VegBiryani();
		}else if(foodType.equals("NON-VEG")) {
			return new NonVegBiryani();
		}else if(foodType.equals("RICE")) {
			return new RiceFood();
		}
		
		return null;
	}
}
