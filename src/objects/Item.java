/*
 * Hamza Raza
 * June 13, 2014
 * ICS4U1
 * Item object
 */
package objects;

import interfaces.ComparableItem;

public class Item implements ComparableItem {

	//declaring fields
	private String section;
	private String type;
	private String name;
	private int itemId;
	private double price;
	private int stock;

	/*
	 * constructor to create the object
	 * pre: String section, String type, String name, int itemId, double price, int stock
	 * post: none
	 */
	public Item(String section, String type, String name, int itemId,
			double price, int stock) {
		this.section = section;
		this.type = type;
		this.name = name;
		this.itemId = itemId;
		this.price = price;
		this.stock = stock;
	}

	/*
	 * method to get the stock of the item
	 * pre: none
	 * post: returns value of type int
	 */
	public int getStock() {
		return stock;
	}

	/*
	 * method to get the stock of the item
	 * pre: int stock
	 * post: none
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/*
	 * method to get the section name of the item
	 * pre: none
	 * post: returns value of type String
	 */
	public String getSection() {
		return section;
	}

	/*
	 * method to set the section name of the item
	 * pre: String section
	 * post: none
	 */
	public void setSection(String section) {
		this.section = section;
	}

	/*
	 * method to get the type of the item
	 * pre: none
	 * post: returns value of type String
	 */
	public String getType() {
		return type;
	}

	/*
	 * method to set the type of the item
	 * pre: String type
	 * post: none
	 */
	public void setType(String type) {
		this.type = type;
	}

	/*
	 * method to get the name of the item
	 * pre: none
	 * post: returns value of type String
	 */
	public String getName() {
		return name;
	}

	/*
	 * method to set the name of the item
	 * pre: String name
	 * post: none
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * method to get the item id of the item
	 * pre: none
	 * post: returns value of type int
	 */
	public int getItemId() {
		return itemId;
	}

	/*
	 * method to set the item id of the item
	 * pre: int itemId
	 * post: none
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/*
	 * method to get the price of the item
	 * pre: none
	 * post: returns value of type double
	 */
	public double getPrice() {
		return price;
	}

	/*
	 * method to set the price of the item
	 * pre: double price
	 * post: none
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * method to check if the item is in stock
	 * pre: none
	 * post: returns true or false
	 */
	public boolean inStock() {
		return getStock() > 0;
	}

	/*
	 * interface method that compares two objects prices
	 * pre: Object o
	 * post: returns value of type int (-1, 0 , 1)
	 */
	public int compareByPrice(Object o) {
		Item obj = (Item) o;
		if (getPrice() < obj.getPrice())
			return -1;
		else if (getPrice() == obj.getPrice())
			return 0;
		else
			return 1;
	}

	/*
	 * interface method that compares two objects id's
	 * pre: Object o
	 * post: returns value of type int (-1, 0 , 1)
	 */
	public int compareById(Object o) {
		Item obj = (Item) o;
		if (getItemId() < obj.getItemId())
			return -1;
		else if (getItemId() == obj.getItemId())
			return 0;
		else
			return 1;
	}
}