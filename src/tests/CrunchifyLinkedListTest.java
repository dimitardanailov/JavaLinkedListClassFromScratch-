package tests;

import dataStructures.CrunchifyLinkedList;

public class CrunchifyLinkedListTest {

	public static void main(String[] args) {
		CrunchifyLinkedList list = new CrunchifyLinkedList();
		
		// add elements to LinkedList
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		/*
         * Please note that primitive values can not be added into LinkedList
         * directly. They must be converted to their corresponding wrapper
         * class.
         */
		
		System.out.println("Load test scenario");
		System.out.println("List - print linkedlist: " + list);
		System.out.println("Print Linked list size: " + list.size());
		System.out.println("Get third element of list: " + list.get(3));
		System.out.println("Remove second element: " + list.remove(2));
		System.out.println("Print Linked list size: " + list.size());
		System.out.println("List - print linkedlist: " + list);
		
		// Add a new element
		list.add("6");
		System.out.printf("List - print linkedlist: %s and size is %d\n", list, list.size());
		
		// Add a new element on third position
		list.add("item", 3);
		System.out.printf("List - print linkedlist: %s and size is %d\n", list, list.size());
	}
}
