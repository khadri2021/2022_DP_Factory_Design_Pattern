package com.khadri.dp.child;

import com.khadri.dp.parent.Food;

public class NonVegBiryani extends Food{

	@Override
	public String prepareFood() {
		return "NonVeg-Biryani-Cooked";
	}

}
