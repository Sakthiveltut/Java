import java.util.Stack;

public class stackExample{

public static void main(String[] args){
	
	Stack<Integer> s = new Stack();

	s.push(11);
	s.push(21);
	s.push(31);
	s.push(41);
	s.push(51);

	System.out.println("print "+s);

	//Removes and returns the item at the top of the stack.
	int popedStack = s.pop();
	System.out.println("popedStack "+popedStack);

	
	System.out.println(s);

	//Returns the item at the top of the stack without removing it.
	System.out.println(s.isEmpty());

	System.out.println(s.search(11));

	}
}