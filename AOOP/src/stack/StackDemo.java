package stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.add(10);
		s.push(5);
		s.empty();
		s.remove(0);
		s.pop();
		s.peek();
		System.out.println(s);
	}

}
