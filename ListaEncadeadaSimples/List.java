package introducao.lista.encadeada.unicap;

public class List {
	private Node first;
	private Node last;
	private int qtd;
	
	
	
	public boolean isEmpty() {
		return (this.first == null);
	}
	
	
	public void inserirInicio(int value) {
		Node novoNo = new Node(value);
		if (isEmpty()) {
			first = novoNo;
			last = novoNo;
			qtd = 1;
		} else {
			novoNo.setNext(first);
			first = novoNo;
			qtd++;
		}
	}
	
	public void inserirFinal(int value) {
		Node novoNo = new Node(value);
		if(isEmpty()) {
			first = novoNo;
			last = novoNo;
			qtd = 1;
		} else {
			last.setNext(novoNo);
			last = novoNo;
			qtd++;
		}
		
	}
	
	public void Exibir() {
		Node aux;
		
		if(qtd == 0 ) {
			System.out.println("[+] Lista vazia não há oque mostrar.");
		} else {
				aux = first;
				while(aux != null) {
					System.out.println("[+] Valores: " + aux.getInfo());
					System.out.println("\t\n");
					aux = aux.getNext();
				}
				
		}
		
	}
}
