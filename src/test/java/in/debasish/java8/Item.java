package in.debasish.java8;

import java.util.List;

public class Item {

	private String name;
	private double price;

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	

	public static void main(String[] args) {
		// Simulate a shopping cart with items
		List<Item> shoppingCart = List.of(new Item("Laptop", 1000.0), new Item("Phone", 500.0),
				new Item("Headphones", 100.0), new Item("Tablet", 800.0), new Item("Keyboard", 50.0));
		shoppingCart.forEach(item -> System.out.println(item.getName() + "-$" + item.getPrice()));
	
	}

}
