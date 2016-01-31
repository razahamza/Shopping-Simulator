/*
 * Hamza Raza
 * June 13, 2014
 * ICS4U1
 * Inventory object
 */
package objects;

import java.util.List;

public class Inventory {

	//declaring fields
	private List<Item> items;
	private int size;

	/*
	 * constructor to create the object
	 * pre: List<Item> items, int size
	 * post: none
	 */
	public Inventory(List<Item> items, int size) {
		this.items = items;
		this.size = size;
	}

	/*
	 * method to get the items
	 * pre: none
	 * post: returns value of type List<Item>
	 */
	public List<Item> getItems() {
		return items;
	}

	/*
	 * method to set the items
	 * pre: List<item> items
	 * post: returns value of type List<Item>
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/*
	 * method to get the size of the inventory
	 * pre: none
	 * post: returns value of type int
	 */
	public int getSize() {
		return size;
	}

	/*
	 * method to set the items
	 * pre: int size
	 * post: returns value of type List<Item>
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/*
	 * method to add an item from the list
	 * pre: Item item
	 * post: none
	 */
	public void add(Item item) {
		items.add(item);
	}

	/*
	 * method to add an item from the list
	 * pre: Item item
	 * post: none
	 */
	public void remove(Item item) {
		items.remove(item);
	}
}
