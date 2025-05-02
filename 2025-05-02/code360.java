import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static Stack<Integer> pushAtBottom(Stack<Integer> myStack, int x) {
		// Write your code here
		Stack<Integer> newStack = new Stack<>();
		while (!myStack.isEmpty()) {
			newStack.push(myStack.pop());
		}
		myStack.push(x);
		while (!newStack.isEmpty()) {
			myStack.push(newStack.pop());
		}
		return myStack;
	}
}