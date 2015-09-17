package dataStructures;

/**
 * 
 * Source: http://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/
 * @author dimitar danailov
 *
 */
public class CrunchifyLinkedList {
	
	// Reference to the head node.
	private Node head;
	private int listCount;
	
	// LinkedListConstructor
	public CrunchifyLinkedList() {
		// this is an empty list, so the reference to the head node
		// is set to a new node with no data
		head = new Node(null);
		listCount = 0;
	}
	
	/**
	 * Appends the specified element to the end of this list.
	 * @param data
	 */
	public void add(Object data) {
		Node currentNode = head;
		
		// starting at the head node, crawl to the end of the list.
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		
		Node tempNode = new Node(data);
		currentNode.setNext(tempNode);
		
		// Increment the number of elements variable.
		listCount++;
	}
	
	/**
	 * Inserts the specified element at the specified position
	 * in this list 
	 * 
	 * @param data
	 * @param index
	 */
	public void add(Object data, int index) {
		Node currentNode = head;
		
		// crawl to the requested index or the last element in the list.
		for (int i = 1; i < index && currentNode.getNext() != null; i++) {
			currentNode = currentNode.getNext();
		}
		
		Node tempNode = new Node(data);
		// set the new node's next-node reference to this node's next - node
		// reference
		tempNode.setNext(currentNode.getNext());
		
		// now set this node's next-node reference to the new node.
		currentNode.setNext(tempNode);
		
		// Increment the number of elements variable.
		listCount++;
	}
	
	/**
	 * Returns the element at the specified position in this list.
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		// index must be 1 or higher
		if (index <= 0) {
			return null;
		}
		
		Node currentNode = head.getNext();
		for (int i = 1; i < index; i++) {
			if (currentNode.getNext() == null) {
				return null;
			}
			
			currentNode = currentNode.getNext();
		}
		
		return currentNode.getData();
	}
	
	/**
	 * Removes the element at the specified position in this list.
	 * @param index
	 * @return
	 */
	public boolean remove(int index) {
		// if the index is out of range
		if (index < 1 || index > size()) {
			return false;
		}
		
		Node currentNode = head;
		for (int i = 1; i < index; i++) { 
			if (currentNode.getNext() == null) {
				return false;
			}
			
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(currentNode.getNext().getNext());
		
		// Decrement the number of elements variable.
		listCount--;
		
		return true;
	}
	
	/**
	 * Iterate collection and display content.
	 */
	public String toString() {
		Node currentNode = head.getNext();
        StringBuilder builder = new StringBuilder();
        while (currentNode != null) {
        	builder.append("[" + currentNode.getData().toString() + "]");
            currentNode = currentNode.getNext();
        }
        
        return builder.toString();
	}
	
	/**
	 * Returns the number of elements in this list.
	 * @return
	 */
	public int size()
	{
		return listCount;
	}
	
	private class Node {
		// reference to the next node in the chain,
		// or null if there isn't one.
		Node next;
		
		// data carried by this node.
		// could be of any type you need.
		Object data;
		
		/**
		 * Node constructor
		 * @param dataValue
		 */
		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}
		
		/**
		 * another Node Constructor if we want to 
		 * specify the node to point to.
		 * @param dataValue
		 * @param nextValue
		 */
		public Node(Object dataValue, Node nextValue) {
			next = nextValue;
			data = dataValue;
		}
		
		public Object getData() {
			return data;
		}
		
		public void setData(Object dataValue) {
			data = dataValue;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node nextValue) {
			next = nextValue;
		}
	}
}
