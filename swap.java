import java.util.*;
class swapping{
	int a,b;
	void swap(){
		a = a + b;
		b = a - b;
		a = a - b;	
	}
}
class swap{
	public static void main(String args[]){
		swapping ob = new swapping();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 values:\n");
		ob.a = sc.nextInt();
		ob.b = sc.nextInt();
		System.out.println("a-"+ob.a+" b-"+ob.b);
		ob.swap();
		System.out.println("a-"+ob.a+" b-"+ob.b);
	}
}