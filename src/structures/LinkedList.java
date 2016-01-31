/*
 * Hamza Raza
 * June 13, 2014
 * ICS4U1
 * LinkedList object
 */
package structures;

import java.util.ArrayList;
import java.util.List;

import objects.Item;

public class LinkedList {
	private Node head;

	/**
	 * constructor pre: none post: A linked list with a null item has been
	 * created.
	 */
	public LinkedList() {
		head = null;
	}

	/*
	 * method to add an item to the end of the linked list
	 * pre: Item item
	 * post: none
	 */
	public void append(Item item) {
		if (head == null) {
			head = new Node(item, null);
			return;
		}

		for (Node curr = head; curr != null; curr = curr.next) {
			if (curr.next == null) {
				curr.setNext(new Node(item, null));
				break;
			}
		}
	}

	/*
	 * method to remove an item from the linked list
	 * pre: Item item
	 * post: none
	 */
	public void remove(Item item) {
		if (head == null)
			return;
		if (head.getItem() == item) {
			head = head.getNext();
			return;
		}
		for (Node node = head; node != null; node = node.next) {
			Node temp = node.getNext();
			if (temp != null && temp.getItem() == item) {
				node.setNext(temp.getNext());
				break;
			}
		}
	}

	/*
	 * method to delete the list
	 * pre:
	 * post:
	 */
	public void deleteList() {
		head = null;
	}

	/*
	 * method to get all the items in the list
	 * pre: none
	 * post: returns value of type List<Item>
	 */
	public List<Item> getItems() {
		List<Item> ret = new ArrayList<Item>();
		for (Node temp = head; temp != null; temp = temp.next) {
			ret.add(temp.getItem());
		}
		return ret;
	}

	// nested class
	private class Node {
		//declaring fields
		private Item item;
		private Node next;

		/**
		 * constructor pre: none post: A node has been created.
		 */
		public Node(Item i, Node n) {
			item = i;
			next = n;
		}

		/*
		 * method that returns the next node
		 * pre: none
		 * post: returns value of type Node
		 */
		public Node getNext() {
			return next;
		}

		/*
		 * method that returns the item
		 * pre: none
		 * post: returns value of type Item
		 */
		public Item getItem() {
			return item;
		}

		/*
		 * method that sets the next node
		 * pre: Node n
		 * post:
		 */
		public void setNext(Node n) {
			next = n;
		}
	}
}