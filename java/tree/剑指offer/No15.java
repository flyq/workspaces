public class No15 {

    public static  void main(String[] args) {
	Node15 a = new Node15("1");
	Node15 b = new Node15("2");
	Node15 c = new Node15("3");
	Node15 d = new Node15("4");
	Node15 e = new Node15("5");
	Node15 f = new Node15("6");

	a.setNext(b);
	b.setNext(c);
	c.setNext(d);
	d.setNext(e);
	e.setNext(f);

	System.out.print(FindDataFromTail(a, 5));
    }

    private static String FindDataFromTail(Node15 a, int k) {

	if(a == null)
	    return null;
	if(k == 0) {
	    System.out.println("k 应该从1开始");
	    return null;
	}
	Node15 Node1 = a;
	Node15 Node2 = null;
	for (int i = 0; i < k - 1; i++){
	    if(Node1.getNext() == null){
		System.out.println("k 不应该大于链表长度");
		return null;
	    }
	    Node1 = Node1.getNext();
	}
	Node2 = a;

	while(Node1.getNext() != null) {
	    Node1 = Node1.getNext();
	    Node2 = Node2.getNext();
	}
	return Node2.getData();
    }

}

class Node15 {
    public  String data;
    public  Node15 Next;
    public  Node15(String data) {
	super();
	this.data = data;
    }

    public String getData() {
	return data;
    }

    public void setData(String data) {
	this.data = data;
    }

    public Node15 getNext() {
	return Next;
    }

    public void setNext(Node15 next) {
	Next = next;
    }
}
	
	
	
	    

	    
	    
			      


			      
