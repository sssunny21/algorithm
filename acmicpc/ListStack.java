package acmicpc;

import java.util.*;

public class ListStack {
	
	private Node top;
	
	private class Node{
		private Integer data;
		private Node nextNode;
		
		Node(Integer data){
			this.data = data;
			this.nextNode = null;
		}
	}
	
	public ListStack(){
		this.top = null;
	}
	
	public boolean empty(){
		return (top == null);
	}
	
	public void push(Integer item){
		Node node = new Node(item);
		node.nextNode = top;
		top = node;
	}
	
	public Integer peek(){
		if(empty()){
			System.out.println("범위 초과");
			System.exit(1);
		}
		return top.data;
	}
	
	public Integer pop(){
		Integer item = peek();
		top = top.nextNode;
		return item;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListStack stack = new ListStack();
		System.out.println(stack.empty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.pop();
		System.out.println(stack.peek());
		
	}

}
