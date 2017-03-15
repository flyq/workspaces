public class No2{
    public static void main(String[] args){
	//	System.out.println(A.a);
    }
}

class A{
    private static final A a = new A();
    private A(){}
    public static A getInstance(){
	return a;
    }
}

class B{
    private static B b = null;
    private B(){
	public static B getInstance(){
	    if(b == null){
		synchronized (B.class) {
		    if(b == null)
			b = new B();
		}
	    }
	    return b;
	}
    }
    
