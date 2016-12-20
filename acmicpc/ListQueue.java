package acmicpc;

public class ListQueue {
	
	private Node front;
	private Node rear;
	
	private class Node{
		Integer data;
		Node nextNode;
		
		Node(Integer item){
			this.data = item;
			this.nextNode = null;
		}
	}
	
	public ListQueue(){
		this.front = null;
		this.rear = null;
	}
	
	public boolean empty(){
		return (rear == null);
	}
	
	public void insert(Integer item){
		Node node = new Node(item);
		if(empty()){
			front = node;
			rear = node;
		}else{
			rear.nextNode = node;
			rear = node;
		}
	}
	
	public Integer peek(){
		if(empty()){
			System.out.println("범위 초과");
			System.exit(1);
		}
		return front.data;
	}
	
	public Integer remove(){
		Integer item = peek();
		front = front.nextNode;
		
		if(front == null) rear = null;
		
		return item;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListQueue queue = new ListQueue();
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		System.out.println(queue.empty());
		queue.insert(4);
		queue.insert(5);
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.empty());
	}

}
