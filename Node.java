package introducao.lista.encadeada.unicap;

public class Node {
	private Integer info;
	private Node next;
	
	// construtor
	public Node (int value) {
		this.info = value;
	}
	// get and sets
	public void setInfo(int value ) {
		this.info = value;
	}
	
	public int getInfo() {
		return this.info;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return this.next;
	}
}

