public class No15_2 {
  
    public static void main(String[] args) {
	Node15 a=new Node15("1");
	Node15 b=new Node15("2");
	Node15 c=new Node15("3");
	Node15 d=new Node15("4");
	Node15 e=new Node15("5");
	Node15 f=new Node15("6");
	Node15 g=new Node15("7");
	a.setNext(b);b.setNext(c);c.setNext(d);
    }
    
    d.setNext(e);e.setNext(f);f.setNext(g);
    Node15 mid=getMid(a);
    System.out.println(mid.getData());
    
    private static Node15 getMid(Node15 a) {
    }
    if(a==null){
	return null;
    }
    Node15 slow=a;
    Node15 fast=a;
    while(fast.getNext()!=null&&fast.getNext().getNext()!=null){
	slow=slow.getNext();
	fast=fast.getNext().getNext();
    }
    return slow;
}

class Node15{
    private String data;
    private Node15 Next;
    public Node15(String data) {
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
