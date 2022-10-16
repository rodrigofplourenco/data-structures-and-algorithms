package data_structures_and_algorithms;

import java.util.Stack;

public class Stacks {
	static void run() {
		// Stack is LIFO - Last-In First-Out
		
		/*
		 * What are the main uses of stacks?
		 * 1- undo/re-do features in text editors
		 * 2- moving back/forward in browser history
		 * 3- backtracking algorithms (maze, files directories)
		 * 4- calling functions (call stack)
		 */
		
		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.empty()); // Check if is empty
		
		stack.push("Minecraft"); // Add item to the top
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("Borderlands");
		stack.push("FFVII");
		
		System.out.println(stack.empty());
		
		stack.pop(); // Remove item from the top (returning the item, so if stack don't have items, it will give an error)
		
		System.out.println(stack);
		
		String myFavGame = stack.pop();
		
		System.out.println(myFavGame);
		System.out.println(stack);
		
		System.out.println(stack.peek()); // Return the top element without removing
		System.out.println(stack);
		
		System.out.println(stack.search("Minecraft")); // Get the position of the element from the top (1-n)
		System.out.println(stack); // Position 3 from the top
		
		System.out.println(stack.search("CSGO")); // If no element, it will print -1
	}
}
