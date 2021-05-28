class stackADT{
	private int tos;
	private int stk[];

	void createStk(int a){
	stk = new int[a];
	tos = -1;
	}

	void push(int a){
	if(tos == stk.length-1) System.out.println("Stack overflow !");
	else stk[++tos] = a;
	}

	int pop(){
	if(tos == -1) {System.out.println("Stack underflow !");
	return 0;}
	else return stk[tos--];
	}	
}

class stack{
	public static void main(String args[]){
		stackADT stk1 = new stackADT();
		stk1.createStk(6);
		int i;
		for(i=0;i<10;i++) stk1.push(i);
		for(i=0;i<10;i++) System.out.println(stk1.pop());
	}	
}