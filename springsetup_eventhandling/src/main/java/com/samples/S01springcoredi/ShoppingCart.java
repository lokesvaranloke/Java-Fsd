package com.samples.S01springcoredi;

public class ShoppingCart {
	private Item item;
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ShoppingCart [item=" + item + "]";
	}
	
	//this is a example of object reference
	//in this method we can reference the item object seperately but in inner bean we cant access the class seperately
}
