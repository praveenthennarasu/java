class queueADT{
	private int que[];
	private int front;
	private int rear;

	void createQueue(int a){
	que = new int[a];
	front = -1;
	rear = -1;
	}
	
	void enqueue(int a){
	if(rear == que.length-1) System.out.println("Queue overflow !");
	else{
	que[++rear] = a;
	if(front == -1) front = 0;
	}
	}

	int dequeue(){
	if(front == -1){ System.out.println("Queue underflow !"); return 0; }
	else{
	if(rear == 0) front--;
	System.out.println(que[rear--]);
	return que[rear+1];
	}
	}
}
class queue{
	public static void main(String args[]){
		queueADT que1 = new queueADT();
		que1.createQueue(6);
		int i;
		for(i=0;i<10;i++) que1.enqueue(i);
		for(i=0;i<10;i++) que1.dequeue();
	}
}