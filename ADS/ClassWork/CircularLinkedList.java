package CircularLinkedList;

public class CircularLinkedList {
	
	public class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value = value;
		}
	}
	public Node head;
	public Node tail;
	
	public CircularLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void insert(int value) {
		Node node = new Node(value);
		if(head == null) {
			head = node;
			tail = node;
			node.next = head;  // create circular link
			return;
		}
		tail.next = node;
		node.next = head;
		tail = node;
	}
	
	public void delete(int value) {
		// Case 1: If the node to be deleted is the head
		Node node = head;
		if(node == null) {
			return;
		}
		if(node.value == value) {
			if(head == tail) {
				head = null;
				tail = null;
				}
			else {
				head = head.next;
				tail.next = head;
			}
			return;
		}
		
		// case 2 :  Traverse the list to find the node
		do {
			Node n = node.next;
			if(n.value == value) {
				node.next = n.next;
				if(n == tail) {
					tail = node;
				}
				break;
			}
			node = node.next;
		} while( node != head);
	}
	
	public void display() {
		Node node = head;
		if(head != null) {
			do {
			System.out.print(node.value + " -> ");
			node = node.next;
			
			} while (node != head);
		}
		System.out.println("Head");
	}
	
	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
			cll.insert(10);
			cll.insert(20);
			cll.insert(30);
			cll.insert(40);
			cll.insert(50);
			cll.display();
		
			cll.delete(30);
			cll.display();
		}
}
