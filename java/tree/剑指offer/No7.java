import java.util.*;

public class No7{
    private Stack s1 = new Stack();
    private Stack s2 = new Stack();

    public void offer(Object x){
	s1.push(x);
    }
    public void poll(){
	if(s1.size() == 0 && s2.size()==0){
	    try {
		throw new Exception("队列为空");
	    } catch (Exception e){
		e.printStackTrace();
	    }
	}
	else{
	    if(s2.size() != 0){
		System.out.println(s2.peek().toString());
		s2.pop();
	    }
	    else{
		while (s1.size()>0){
		    s2.push(s1.pop());
		}
		System.out.println(s2.peek().toString());
		s2.pop();
	    }
	}
    }

    public static void main(String[] args){
	No7 queue = new No7();
	queue.offer("a");
	queue.offer("b");
	queue.offer("c");
	queue.poll();
	queue.poll();
	queue.poll();
	queue.poll();
    }
}

	    
     
	   
