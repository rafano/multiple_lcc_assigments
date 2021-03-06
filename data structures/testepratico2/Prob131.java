import java.util.Scanner;

// Esta classe providencia a leitura de uma lista a partir do stdin
// e chama o metodo duplicate
class Prob131 {
    public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	LinkedList<Integer> list = new LinkedList<Integer>();

	int size = stdin.nextInt();
	for (int i=0; i<size; i++) {
	    int n = stdin.nextInt();
	    list.addLast(n);
	}

	System.out.println("Tamanho Inicial: " + list.size());
	System.out.println("Lista Inicial: " + list);
	list.duplicate();
	System.out.println("Tamanho Final: " + list.size());
	System.out.println("Lista Final: " + list);	    
    }
}

// Classe para representar um nó
class Node<T> {
    T    value;
    Node<T> next;

    Node(T v, Node<T> n) {
	value = v;
	next  = n;
    }

    Node(T v) {
	value = v;
	next  = null;
    }
}

// Classe para representar uma lista
class LinkedList<T> {  
    Node<T> first; 
    int     size;  
                         
    public LinkedList() {    
	first = null; 
	size  = 0; 
    }

    public int size() { 
	return size; 
    }

    public String toString() {
	if (size == 0) 
	    return new String("[]");
	else {
	    String  s = new String("[");
	    Node<T> p = first;
	    while (p.next != null) {
		s += p.value + ",";
		p = p.next;
	    }
	    s += p.value + "]";
	    return s;
	}
    }

    public void addFirst(T value) {
	first = new Node<T>(value, first);
	size++;
    }

    public void addLast(T value) {
	if(size == 0) 
	    first = new Node<T>(value, first);
	else {
	    Node<T> p = first;
	    for( int i = 0 ; i < size - 1 ; i++)
		p = p.next;
	    p.next = new Node<T>(value);
	}
	size++;
    }

    public void duplicate() {
	if (size==0)
	    return;	
	Node<T> p = first;
	for(int i=0; i<size(); i++) {
	    Node<T> n = new Node<T>(p.value, p.next);
	    p.next=n;
	    p= n.next;
	}
	size = size*2; 
    }
}
